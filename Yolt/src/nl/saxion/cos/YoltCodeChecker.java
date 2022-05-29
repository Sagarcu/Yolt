package nl.saxion.cos;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YoltCodeChecker extends YoltBaseVisitor<DataType> {
    private final ParseTreeProperty<DataType> types;
    private final ParseTreeProperty<FunctionType> functionTypes; //TODO Perhaps remove.
    private final ParseTreeProperty<Symbol> symbols;
    private final ParseTreeProperty<FunctionSymbol> functionSymbols; //TODO Perhaps remove.
    private final Map<String, FunctionSymbol> functions;

    private YoltParser parser; //Used temporarily to be able to search through children.



    private Scope currentScope;
    private int numLocals = 2; //0 is used for the class. 1 is used for methods. 2 is used for gold calculation.

    //TODO LOOK IF THERE ARE ANY MORE THINGS WE WANT TO CHECK?!
    //TODO Consider adding infinite loop checker?
    public YoltCodeChecker(ParseTreeProperty<DataType> types, ParseTreeProperty<FunctionType> functionType, ParseTreeProperty<Symbol> symbols, ParseTreeProperty<FunctionSymbol> functionSymbols, Map<String, FunctionSymbol> functions, YoltParser parser) {
        this.types = types;
        this.functionTypes = functionType;
        this.symbols = symbols;
        this.functionSymbols = functionSymbols;
        this.parser = parser;
        this.functions = functions;
        currentScope = new Scope();
    }

    @Override
    public DataType visitVar_declaration(YoltParser.Var_declarationContext ctx) {
        String varName = ctx.IDENTIFIER().toString();
        DataType type;

        if (ctx.INT() != null) type = DataType.INT;
        else if (ctx.COINS() != null) type = DataType.COINS;
        else if (ctx.BOOLEAN() != null) type = DataType.BOOLEAN;
        else type = DataType.STRING;

        if (ctx.expr() != null)
        {
            visit(ctx.expr()); //Look if the possible expression is correct.
        }

        Symbol s = currentScope.lookupVariable(varName);
        if( s != null )
            throw new YoltCompilerException("The variable " + varName + " has already been initialized.");


        int numLocal = currentScope.getNumLocals();
        currentScope.declareVariable(new Symbol(varName, type, false, numLocal));

        DataType expressionType = visit(ctx.expr()); //TODO Turn on again!
        //if( type != expressionType )
        //    throw new YoltCompilerException("Trying to assign a " + expressionType + " to a " + type + ".");

        symbols.put(ctx, new Symbol(varName, type, false, numLocal));
        return null;
    }

    @Override
    public DataType visitFunction_call(YoltParser.Function_callContext ctx) {
        String functionName = ctx.IDENTIFIER().toString();

        FunctionSymbol currentFunction = functions.get(functionName);
        if(currentFunction == null)
        {
            throw new YoltCompilerException("No function named " + functionName + " found!");
        }
        for(int i = 0; i < ctx.expr().size(); i++)
        {
            visit(ctx.expr(i));
        }



        functionSymbols.put(ctx, currentFunction);
        return null;
    }

    @Override
    public DataType visitFunction_declaration(YoltParser.Function_declarationContext ctx) {
        currentScope = currentScope.openScope();

        String functionName = ctx.IDENTIFIER().toString();
        FunctionSymbol currentFunction = functions.get(functionName);
        functionSymbols.put(ctx, currentFunction);

        visitChildren(ctx);

        currentScope = currentScope.closeScope();
        return null;
    }

    @Override
    public DataType visitVariables(YoltParser.VariablesContext ctx) {
        DataType type;
        if (ctx.STRING() != null) type = DataType.STRING;
        else if (ctx.COINS() != null) type = DataType.COINS;
        else if (ctx.BOOLEAN() != null) type = DataType.BOOLEAN;
        else type = DataType.INT;

        int localNum = currentScope.getNumLocals();

        currentScope.declareVariable(new Symbol(ctx.IDENTIFIER().toString(), type, false, localNum));
        symbols.put(ctx, new Symbol(ctx.IDENTIFIER().toString(), type, false, localNum));

        return null;
    }

    @Override
    public DataType visitFunctionExpression(YoltParser.FunctionExpressionContext ctx) {

        String functionName = ctx.function_call().IDENTIFIER().toString();

        FunctionSymbol currentFunction = functions.get(functionName);
        if(currentFunction == null)
        {
            throw new YoltCompilerException("No function named " + functionName + " found!");
        }

        functionSymbols.put(ctx, currentFunction);


        for(int i = 0; i < currentFunction.getTypes().size(); i++)
        {
            //TODO TYPECHECK THE EXTRA VARIABLES IT RECEIVES!
            //if(currentFunction.getTypes().get(i) != ctx.function_call().expr(i))
        }


        //Check for missing variables.
        //Find out what kind of value it is expecting back! We have to do this by saving our functions and then finding the name and then reading the type to get the correct type.

        //return super.visitFunctionExpression(ctx);
        return null;
    }

    @Override
    public DataType visitGlobal_var_declaration(YoltParser.Global_var_declarationContext ctx) {
        //TODO COME UP WITH WHAT NEEDS TO BE DONE HERE! Also think about static or remove static.
        String varName = ctx.IDENTIFIER().toString();
        DataType type;

        if (ctx.INT() != null) type = DataType.INT;
        else if (ctx.COINS() != null) type = DataType.COINS;
        else if (ctx.BOOLEAN() != null) type = DataType.BOOLEAN;
        else type = DataType.STRING;

        Symbol s = currentScope.lookupVariable(varName);
        if( s != null )
            throw new YoltCompilerException("The variable " + varName + " has already been initialized.");


        currentScope.declareVariable(new Symbol(varName, type, true, -1)); //Global variable doesn't need a numLocal.

        if (ctx.expr() != null)
        {
            DataType expressionType = visit(ctx.expr());
            if( type != expressionType )
                throw new YoltCompilerException("Trying to assign a " + expressionType + " to a " + type + ".");
        }
        symbols.put(ctx, new Symbol(varName, type, true, -1)); //TODO make neater later if it works.

        return null;
    }

    @Override
    public DataType visitVar_assignment(YoltParser.Var_assignmentContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Symbol s = currentScope.lookupVariable(varName);
        if( s == null )
            throw new YoltCompilerException("Undefined variable in assignment: " + varName);

        DataType expressionType = visit(ctx.expr());
        if( s.getType() != expressionType )
            throw new YoltCompilerException("Assignment type is not correct");

        symbols.put(ctx, s);

       return null;
    }

    @Override
    public DataType visitVar_assignment_short(YoltParser.Var_assignment_shortContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Symbol s = currentScope.lookupVariable(varName);
        if( s == null )
            throw new YoltCompilerException("Undefined variable in assignment: " + varName);

        if(s.getType().equals(DataType.STRING))
        {
            throw new YoltCompilerException("Can't do short expressions on STRING objects.");
        }

        DataType expressionType = visit(ctx.expr());
        if( s.getType() != expressionType )
            throw new YoltCompilerException("Assignment type is not correct");

        symbols.put(ctx, s);
        return null;
    }

    @Override
    public DataType visitCompare_values(YoltParser.Compare_valuesContext ctx) {
        DataType expressionType = visit(ctx.expr(0));
        DataType expressionType2 = visit(ctx.expr(1));

        if (expressionType == DataType.STRING && ctx.LOGIC_EQUAL() == null)
        {
            throw new YoltCompilerException("Can't compare " + expressionType);
        }

        if(expressionType != expressionType2)
        {
            if (!(expressionType == DataType.COINS || expressionType == DataType.INT && expressionType2 == DataType.COINS || expressionType2 == DataType.INT))
            {
                throw new YoltCompilerException("Can't compare on mismatched types [" + expressionType + "] and [" + expressionType2 + "].");
            }
        }
        return super.visitCompare_values(ctx);
    }

    @Override
    public DataType visitApplication(YoltParser.ApplicationContext ctx) {
        boolean main = false;

        for(int i = 0; i < ctx.function_declaration().size(); i++)
        {
            if (ctx.function_declaration(i).IDENTIFIER().toString().equals("main"))
            {
                main = true;
                break;
            }
        }

        if (!main) throw new YoltCompilerException("No entrypoint found. Please add a FUNCTION main");


        currentScope = currentScope.openScope();
        visitChildren(ctx);
        currentScope = currentScope.closeScope();
        return null;
    }

    @Override
    public DataType visitVarIdentifier(YoltParser.VarIdentifierContext ctx) {
        Symbol s = currentScope.lookupVariable(ctx.IDENTIFIER().toString());

        if (s == null)
            throw new YoltCompilerException("Variable has not been initialized yet: " + ctx.IDENTIFIER().toString());

        symbols.put(ctx, s);
        types.put(ctx, s.getType());
        return s.getType();
    }

    @Override
    public DataType visitIntIdentifier(YoltParser.IntIdentifierContext ctx) {
        return addType( ctx, DataType.INT );
    }

    @Override
    public DataType visitBoolIdentifier(YoltParser.BoolIdentifierContext ctx) {
        return addType( ctx, DataType.BOOLEAN);
    }

    @Override
    public DataType visitCoinIdentifier(YoltParser.CoinIdentifierContext ctx) {
        return addType( ctx, DataType.COINS );
    }

    @Override
    public DataType visitStringIdentifier(YoltParser.StringIdentifierContext ctx) {
        return addType( ctx, DataType.STRING );
    }


    @Override
    public DataType visitParanExpression(YoltParser.ParanExpressionContext ctx) {
        DataType subtype = visit(ctx.expr());
        return addType( ctx, subtype );
    }

    @Override
    public DataType visitPowModExpression(YoltParser.PowModExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);

        if (leftType == DataType.STRING || rightType == DataType.STRING)
        {
            throw new YoltCompilerException("Can't do POW/MOD on String expressions.");
        }

        if(leftType != rightType)
        {
            if (!(leftType == DataType.COINS || leftType == DataType.INT && rightType == DataType.COINS || rightType == DataType.INT))
            {
                throw new YoltCompilerException("Can't do mathematical expressions on mismatched types [" + leftType + "] and [" + rightType + "].");
            }
        }

        return addType(ctx, leftType);
    } //TODO Create CodeGen stuff for POW.

    @Override
    public DataType visitMulDivExpression(YoltParser.MulDivExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);

        if (leftType == DataType.STRING || rightType == DataType.STRING)
        {
            throw new YoltCompilerException("Can't do MUL/DIV on String expressions.");
        }

        if(leftType != rightType)
        {
            if (!(leftType == DataType.COINS || leftType == DataType.INT && rightType == DataType.COINS || rightType == DataType.INT))
            {
                throw new YoltCompilerException("Can't do mathematical expressions on mismatched types [" + leftType + "] and [" + rightType + "].");
            }
        }
        return addType(ctx, leftType);
    }

    @Override
    public DataType visitAddSubExpression(YoltParser.AddSubExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);

        if (leftType == DataType.STRING || rightType == DataType.STRING)
        {
            if (ctx.SUB() != null)
            {
                throw new YoltCompilerException("Can't do SUB String expressions.");
            }
            return addType(ctx, DataType.STRING); //We always return a string if we try to add them together!
        } else if (!(leftType == DataType.COINS || leftType == DataType.INT) && !(rightType == DataType.INT || rightType == DataType.COINS))
        {
            throw new YoltCompilerException("Can't do mathematical expressions on mismatched types [" + leftType + "] and [" + rightType + "].");
        }

        return addType(ctx, leftType);
    }


    @Override
    public DataType visitPrompt_input(YoltParser.Prompt_inputContext ctx) { //TODO check why it does work with number but not with int.
        if (ctx.INT() != null) return addType( ctx, DataType.INT);
        else if (ctx.STRING() != null) return addType( ctx, DataType.STRING);

        throw new YoltCompilerException("Unsupported datatype found in prompt!");
    }

    @Override
    public DataType visitRandom_input(YoltParser.Random_inputContext ctx) {

        if (visit(ctx.expr()) == DataType.INT)
        {
            return addType( ctx, DataType.INT);
        } else if (visit(ctx.expr()) == DataType.COINS)
        {
            return addType(ctx, DataType.COINS);
        } else if (visit(ctx.expr()) == DataType.BOOLEAN)
        {
            return addType(ctx, DataType.BOOLEAN);
        }

        throw new YoltCompilerException("Random input has to be of either INT, Boolean or COIN");
    } ///TODO check in codeGenerator that it works for all 3 values.

    @Override
    public DataType visitBreak_statement(YoltParser.Break_statementContext ctx) {

        boolean insideLoop = false;
        RuleContext parent = ctx;

        for(int i = 1; i < ctx.depth(); i++)
        {
            parent = parent.getParent();
            if (parent instanceof YoltParser.While_loopContext || parent instanceof YoltParser.Do_while_loopContext)
            {
                insideLoop = true;
                break;
            }
        }

        if(!insideLoop) throw new YoltCompilerException("Break statement outside of a loop!");

        return null;
    }


    private FunctionType addFunctionType(ParseTree node, FunctionType type) //TODO Check if even necessary.
    {
        functionTypes.put(node, type);
        return type;
    }

    private DataType addType(ParseTree node, DataType type) {
        types.put(node, type);
        return type;
    }
}
