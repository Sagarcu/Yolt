package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class YoltCodeChecker extends YoltBaseVisitor<DataType> {
    private ParseTreeProperty<DataType> types;
    private ParseTreeProperty<Symbol> symbols;
    private Scope currentScope;
    private int numLocals = 0;


    //TODO Consider adding infinite loop checker?
    //TODO Consider adding break statement checker?
    public YoltCodeChecker(ParseTreeProperty<DataType> types, ParseTreeProperty<Symbol> symbols) {
        this.types = types;
        this.symbols = symbols;
        currentScope = new Scope();
    }

    @Override
    public DataType visitVar_declaration(YoltParser.Var_declarationContext ctx) {
        String varName = ctx.IDENTIFIER().toString();
        DataType type;

        if (ctx.INT() != null) type = DataType.INT;
        else if (ctx.GOLD() != null) type = DataType.COINS;
        else if (ctx.BOOLEAN() != null) type = DataType.BOOLEAN;
        else type = DataType.STRING;

        if (ctx.expr() != null)
        {
            visit(ctx.expr());
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
    public DataType visitVar_addition(YoltParser.Var_additionContext ctx) {
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
    public DataType visitVar_addition_short(YoltParser.Var_addition_shortContext ctx) {
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

        if( expressionType != expressionType2 )
        {
            throw new YoltCompilerException("Can't compare " + expressionType + " with " + expressionType2);
        }
        return super.visitCompare_values(ctx);
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
    public DataType visitGoldIdentifier(YoltParser.GoldIdentifierContext ctx) {
        return addType( ctx, DataType.COINS );
    }

    @Override
    public DataType visitNegativeExpression(YoltParser.NegativeExpressionContext ctx) {
        DataType subtype = visit(ctx.expr());
        return addType( ctx, subtype );
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
        //TODO Consider it being possible to add strings with ints and ints with coins or smth.
        if( leftType != rightType) throw new YoltCompilerException("Type of left and right are not the same!");
        if (!(leftType == DataType.INT || leftType == DataType.COINS)) throw new YoltCompilerException("Type is not Int or Coins.");

        return addType(ctx, leftType);
    }

    @Override
    public DataType visitPowModExpression(YoltParser.PowModExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        if( leftType != rightType) throw new YoltCompilerException("Type of left and right are not the same!");
        if (!(leftType == DataType.INT || leftType == DataType.COINS)) throw new YoltCompilerException("Type is not Int or Coins.");

        return addType(ctx, leftType);
    }

    @Override
    public DataType visitMulDivExpression(YoltParser.MulDivExpressionContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);
        if( leftType != rightType) throw new YoltCompilerException("Type of left and right are not the same!");
        if (!(leftType == DataType.INT || leftType == DataType.COINS)) throw new YoltCompilerException("Type is not Int or Coins.");

        return addType(ctx, leftType);
    }

    private DataType addType(ParseTree node, DataType type) {
        types.put(node, type);
        return type;
    }
}
