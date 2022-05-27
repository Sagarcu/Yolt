package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import javax.xml.crypto.Data;

public class YoltCodeChecker extends YoltBaseVisitor<DataType> {
    private ParseTreeProperty<DataType> types;
    private ParseTreeProperty<Symbol> symbols;
    private Scope currentScope;
    private int numLocals = 0; //Start at 2 because i'm using 0, 1 and 2 for the gold :D.

    //TODO LOOK IF THERE ARE ANY MORE THIGNS WE WANT TO CHECK?!
    //TODO Consider adding infinite loop checker?
    public YoltCodeChecker(ParseTreeProperty<DataType> types, ParseTreeProperty<Symbol> symbols) {
        this.types = types;
        this.symbols = symbols;
        currentScope = new Scope();
    }

    @Override
    public DataType visitBreak_statement(YoltParser.Break_statementContext ctx) {
        //TODO ADD BREAK STATEMENT CHECKER! SHOULD ONLY BE ABLE TO EXIST WITHIN A LOOP!
        return null;
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

        numLocals++;
        currentScope.declareVariable(new Symbol(varName, type, numLocals));

        DataType expressionType = visit(ctx.expr());
        if( type != expressionType )
            throw new YoltCompilerException("Trying to assign a " + expressionType + " to a " + type + ".");

        symbols.put(ctx, new Symbol(varName, type, numLocals));
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

        numLocals++;
        currentScope.declareVariable(new Symbol(varName, type, numLocals));

        DataType expressionType = visit(ctx.expr());
        if( type != expressionType )
            throw new YoltCompilerException("Trying to assign a " + expressionType + " to a " + type + ".");

        symbols.put(ctx, new Symbol(varName, type, numLocals));

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
    public DataType visitClass_declaration(YoltParser.Class_declarationContext ctx) {
        currentScope = currentScope.openScope();
        visitChildren(ctx);
        currentScope = currentScope.closeScope();
        return null;
    }

    @Override
    public DataType visitFunction_declaration(YoltParser.Function_declarationContext ctx) {
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
    public DataType visitStringIdentifier(YoltParser.StringIdentifierContext ctx) {
        return addType( ctx, DataType.STRING );
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
    public DataType visitParanExpression(YoltParser.ParanExpressionContext ctx) {
        DataType subtype = visit(ctx.expr());
        return addType( ctx, subtype );
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
    }

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
    public DataType visitPrompt_input(YoltParser.Prompt_inputContext ctx) {
        if (ctx.INT() != null) return addType( ctx, DataType.INT);
        else return addType(ctx, DataType.STRING);
    }

    @Override
    public DataType visitRandom_input(YoltParser.Random_inputContext ctx) {

        if (visit(ctx.expr()) == DataType.INT || visit(ctx.expr()) == DataType.COINS)
        {
            return addType( ctx, DataType.INT);
        }
        throw new YoltCompilerException("Random input has to be either INT or COIN");
    }



    private DataType addType(ParseTree node, DataType type) {
        types.put(node, type);
        return type;
    }
}
