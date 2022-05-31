package nl.saxion.cos;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.Map;

public class YoltCodeChecker extends YoltBaseVisitor<DataType> {
    private final ParseTreeProperty<DataType> types;
    private final ParseTreeProperty<Symbol> symbols;
    private final Map<String, FunctionSymbol> functions; //I should have done this in a neater way, but its too late for that now!
    private final ParseTreeProperty<FunctionSymbol> functionSymbols;

    private Scope currentScope;

    //TODO LOOK IF THERE ARE ANY MORE THINGS WE WANT TO CHECK?!
    //TODO Consider adding infinite loop checker?
    public YoltCodeChecker(ParseTreeProperty<DataType> types, ParseTreeProperty<Symbol> symbols, ParseTreeProperty<FunctionSymbol> functionSymbols, Map<String, FunctionSymbol> functions) {
        this.types = types;
        this.symbols = symbols;
        this.functionSymbols = functionSymbols;
        this.functions = functions;
        currentScope = new Scope();
    }

    @Override
    public DataType visitFunction_declaration(YoltParser.Function_declarationContext ctx) {
        currentScope = currentScope.openScope();

        String functionName = ctx.IDENTIFIER().toString();
        FunctionSymbol currentFunction = functions.get(functionName);
        functionSymbols.put(ctx, currentFunction);

        visitChildren(ctx);

        if(ctx.return_statement() != null)
        {
            if(!currentFunction.getFunctionType().equals(visit(ctx.return_statement().expr())))
            {
                throw new YoltCompilerException("ERROR: Return type of function [" + functionName + "] should be " + currentFunction.getFunctionType() + " but found " + visit(ctx.return_statement().expr()));
            }

        }

        currentScope = currentScope.closeScope();
        return null;
    }

    @Override
    public DataType visitFunction_call(YoltParser.Function_callContext ctx) {
        String functionName = ctx.IDENTIFIER().toString();

        FunctionSymbol currentFunction = functions.get(functionName);
        if(currentFunction == null)
        {
            throw new YoltCompilerException("ERROR: No function named " + functionName + " has been declared!");
        }

        if(currentFunction.getFunctionType() != DataType.VOID)
        {
            throw new YoltCompilerException("ERROR: Function [" + functionName + "] its call doesn't get stored. Please store the value or change the function to not return a value.");
        }

        for(int i = 0; i < ctx.expr().size(); i++)
        {
            visit(ctx.expr(i));
        }

        for(int i = 0; i < ctx.expr().size(); i++)
        {
            if(currentFunction.getTypes().get(i) != types.get(ctx.expr(i)))
            {
                throw new YoltCompilerException("ERROR: Function [" + functionName + "] has invalid parameters. Please double check where you call this function.");
            }
        }


        functionSymbols.put(ctx, currentFunction);
        return null;
    }

    @Override
    public DataType visitFunctionExpression(YoltParser.FunctionExpressionContext ctx) {

        String functionName = ctx.function_call().IDENTIFIER().toString();

        FunctionSymbol currentFunction = functions.get(functionName);
        if(currentFunction == null)
        {
            throw new YoltCompilerException("ERROR: No function named " + functionName + " has been declared!");
        }

        for(int i = 0; i < ctx.function_call().expr().size(); i++)
        {
            visit(ctx.function_call().expr(i));
        }


        functionSymbols.put(ctx, currentFunction);

        for(int i = 0; i < ctx.function_call().expr().size(); i++)
        {
            if(currentFunction.getTypes().get(i) != types.get(ctx.function_call().expr(i)))
            {
                throw new YoltCompilerException("ERROR: Function [" + functionName + "] has invalid parameters. Please double check where you call this function.");
            }
        }

        if(currentFunction.getFunctionType().equals(DataType.NUMBERS)) return addType(ctx, DataType.NUMBERS);
        else if (currentFunction.getFunctionType().equals(DataType.WORDS))  return addType(ctx, DataType.WORDS);
        else if (currentFunction.getFunctionType().equals(DataType.COINS))  return addType(ctx, DataType.COINS);
        else if (currentFunction.getFunctionType().equals(DataType.BOOL))  return addType(ctx, DataType.BOOL);

        return null;
    }

    @Override
    public DataType visitVar_declaration(YoltParser.Var_declarationContext ctx) {
        String varName = ctx.IDENTIFIER().toString();
        DataType type;

        if (ctx.INT() != null) type = DataType.NUMBERS;
        else if (ctx.COINS() != null) type = DataType.COINS;
        else if (ctx.BOOLEAN() != null) type = DataType.BOOL;
        else type = DataType.WORDS;

        if (ctx.expr() != null)
        {
            visit(ctx.expr());
        }

        Symbol s = currentScope.lookupVariable(varName);
        if( s != null )
            throw new YoltCompilerException("ERROR: Variable [" + varName + "] has already been initialized.");


        int numLocal = currentScope.getNumLocals();
        currentScope.declareVariable(new Symbol(varName, type, false, numLocal));

        DataType expressionType = visit(ctx.expr());
        if( type != expressionType )
            throw new YoltCompilerException("ERROR: Trying to assign + " + expressionType + " to [" + varName + "] which has the type of " + type + ".");

        symbols.put(ctx, new Symbol(varName, type, false, numLocal));
        return null;
    }

    @Override
    public DataType visitVariables(YoltParser.VariablesContext ctx) {
        DataType type;
        if (ctx.STRING() != null) type = DataType.WORDS;
        else if (ctx.COINS() != null) type = DataType.COINS;
        else if (ctx.BOOLEAN() != null) type = DataType.BOOL;
        else type = DataType.NUMBERS;

        int localNum = currentScope.getNumLocals();

        currentScope.declareVariable(new Symbol(ctx.IDENTIFIER().toString(), type, false, localNum));
        symbols.put(ctx, new Symbol(ctx.IDENTIFIER().toString(), type, false, localNum));

        return null;
    }

    @Override
    public DataType visitGlobal_var_declaration(YoltParser.Global_var_declarationContext ctx) {
        String varName = ctx.IDENTIFIER().toString();
        DataType type;

        if (ctx.INT() != null) type = DataType.NUMBERS;
        else if (ctx.COINS() != null) type = DataType.COINS;
        else if (ctx.BOOLEAN() != null) type = DataType.BOOL;
        else type = DataType.WORDS;

        Symbol s = currentScope.lookupVariable(varName);
        if( s != null )
            throw new YoltCompilerException("ERROR: The Global variable [" + varName + "] has already been initialized.");


        currentScope.declareVariable(new Symbol(varName, type, true, -1)); //Global variable doesn't need a numLocal.

        if (ctx.expr() != null)
        {
            DataType expressionType = visit(ctx.expr());
            if( type != expressionType )
                throw new YoltCompilerException("ERROR: Trying to assign + " + expressionType + " to [" + varName + "] which has the type of " + type + ".");
        }
        symbols.put(ctx, new Symbol(varName, type, true, -1));

        return null;
    }

    @Override
    public DataType visitVar_assignment(YoltParser.Var_assignmentContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Symbol s = currentScope.lookupVariable(varName);
        if( s == null )
            throw new YoltCompilerException("ERROR: The variable [" + varName + "has not been initialized yet.");

        DataType expressionType = visit(ctx.expr());
        if( s.getType() != expressionType )
            throw new YoltCompilerException("ERROR: Trying to assign + " + expressionType + " to [" + varName + "] which has the type of " + s.getType() + ".");

        symbols.put(ctx, s);

       return null;
    }

    @Override
    public DataType visitVar_assignment_short(YoltParser.Var_assignment_shortContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Symbol s = currentScope.lookupVariable(varName);
        if( s == null )
            throw new YoltCompilerException("ERROR: The variable [" + varName + "has not been initialized yet.");

        if(s.getType().equals(DataType.WORDS))
        {
            throw new YoltCompilerException("ERROR: [" + varName + "] Can't do short expressions on STRING objects.");
        }

        DataType expressionType = visit(ctx.expr());
        if( s.getType() != expressionType )

            if (!(expressionType == DataType.COINS || expressionType == DataType.NUMBERS && s.getType() == DataType.COINS || s.getType() == DataType.NUMBERS))
            {
                throw new YoltCompilerException("ERROR: Trying to assign + " + expressionType + " to [" + varName + "] which has the type of " + s.getType() + ".");
            }


        symbols.put(ctx, s);
        return null;
    }

    @Override
    public DataType visitCompare_values(YoltParser.Compare_valuesContext ctx) {
        DataType expressionType = visit(ctx.expr(0));
        DataType expressionType2 = visit(ctx.expr(1));

        if (expressionType == DataType.WORDS || expressionType2 == DataType.WORDS)
        {
            throw new YoltCompilerException("ERROR: Can't compare WORDS");
        }

        if(expressionType != expressionType2)
        {
            if (!(expressionType == DataType.COINS || expressionType == DataType.NUMBERS && expressionType2 == DataType.COINS || expressionType2 == DataType.NUMBERS))
            {
                throw new YoltCompilerException("ERROR: Can't compare mismatched types " + expressionType + " and " + expressionType2 + ".");
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

        if (!main) throw new YoltCompilerException("ERROR: No entrypoint found. Please add a FUNCTION main");


        currentScope = currentScope.openScope();
        visitChildren(ctx);
        currentScope = currentScope.closeScope();
        return null;
    }

    @Override
    public DataType visitVarIdentifier(YoltParser.VarIdentifierContext ctx) {
        Symbol s = currentScope.lookupVariable(ctx.IDENTIFIER().toString());

        if (s == null)
            throw new YoltCompilerException("ERROR: The variable [" + ctx.IDENTIFIER() + "] has not been initialized yet.");

        symbols.put(ctx, s);
        types.put(ctx, s.getType());
        return s.getType();
    }

    @Override
    public DataType visitIntIdentifier(YoltParser.IntIdentifierContext ctx) {
        return addType( ctx, DataType.NUMBERS);
    }

    @Override
    public DataType visitBoolIdentifier(YoltParser.BoolIdentifierContext ctx) {
        return addType( ctx, DataType.BOOL);
    }

    @Override
    public DataType visitCoinIdentifier(YoltParser.CoinIdentifierContext ctx) {
        return addType( ctx, DataType.COINS );
    }

    @Override
    public DataType visitStringIdentifier(YoltParser.StringIdentifierContext ctx) {
        return addType( ctx, DataType.WORDS);
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

        if (leftType == DataType.WORDS || rightType == DataType.WORDS)
        {
            throw new YoltCompilerException("ERROR: Can't do POW/MOD expressions on WORDS.");
        }

        if(leftType != rightType)
        {
            if (!(leftType == DataType.COINS || leftType == DataType.NUMBERS && rightType == DataType.COINS || rightType == DataType.NUMBERS))
            {
                throw new YoltCompilerException("ERROR: Can't do mathematical expressions on mismatched types [" + leftType + "] and [" + rightType + "].");
            }
        }
        //Check that the right number is bigger then zero.

        return addType(ctx, leftType);
    }

    @Override
    public DataType visitMulDivExpression(YoltParser.MulDivExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);

        if (leftType == DataType.WORDS || rightType == DataType.WORDS)
        {
            throw new YoltCompilerException("ERROR: Can't do MUL/DIV expressions on WORDS.");
        }

        if(leftType != rightType)
        {
            if (!(leftType == DataType.COINS || leftType == DataType.NUMBERS && rightType == DataType.COINS || rightType == DataType.NUMBERS))
            {
                throw new YoltCompilerException("ERROR: Can't do mathematical expressions on mismatched types [" + leftType + "] and [" + rightType + "].");
            }
        }
        return addType(ctx, leftType);
    }

    @Override
    public DataType visitAddSubExpression(YoltParser.AddSubExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);

        if (leftType == DataType.WORDS || rightType == DataType.WORDS)
        {
            if (ctx.SUB() != null)
            {
                throw new YoltCompilerException("ERROR: Can't do SUB expressions on WORDS.");
            }
            return addType(ctx, DataType.WORDS); //We always return a string if we try to add them together!
        } else if (!(leftType == DataType.COINS || leftType == DataType.NUMBERS) && !(rightType == DataType.NUMBERS || rightType == DataType.COINS))
        {
            throw new YoltCompilerException("ERROR Can't do mathematical expressions on mismatched types [" + leftType + "] and [" + rightType + "].");
        }

        return addType(ctx, leftType);
    }

    @Override
    public DataType visitPrompt_input(YoltParser.Prompt_inputContext ctx) {
        if (ctx.INT() != null) return addType( ctx, DataType.NUMBERS);
        else if (ctx.STRING() != null) return addType( ctx, DataType.WORDS);

        throw new YoltCompilerException("ERROR: Unsupported datatype found in prompt.");
    }

    @Override
    public DataType visitRandom_input(YoltParser.Random_inputContext ctx) {

        if (visit(ctx.expr()) == DataType.NUMBERS)
        {
            return addType( ctx, DataType.NUMBERS);
        } else if (visit(ctx.expr()) == DataType.COINS)
        {
            return addType(ctx, DataType.COINS);
        } else if (visit(ctx.expr()) == DataType.BOOL)
        {
            return addType(ctx, DataType.BOOL);
        }

        throw new YoltCompilerException("ERROR: Random input is of wrong datatype. It has to be of either INT, Boolean or COIN");
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

        if(!insideLoop) throw new YoltCompilerException("ERROR: Found break statement outside of a loop!");

        return null;
    }

    private DataType addType(ParseTree node, DataType type) {
        types.put(node, type);
        return type;
    }
}
