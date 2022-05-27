package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//TODO: Add function support.

//TODO: Consider adding array support later if time left.
@SuppressWarnings("DuplicatedCode")
public class YoltCodeGenerator extends YoltBaseVisitor< Void > {
    private int loopnr = 0;//required.
    private int boolnr = 0; //required for loop in a loop.

    private int endif = 0; //required.
    private int elseif = 0; //required.

    private ParseTreeProperty<DataType> types;
    private ParseTreeProperty<Symbol> symbols;
    private ArrayList<String> jasminCode = new ArrayList<>();

    public YoltCodeGenerator(
                          ParseTreeProperty<DataType> types,
                          ParseTreeProperty<Symbol> symbols ) {
        this.types = types;
        this.symbols = symbols;
    }

    @Override
    public Void visitApplication(YoltParser.ApplicationContext ctx) {


        if (ctx.class_declaration() != null) visit(ctx.class_declaration()); //Check our Classes
        else
        {
            jasminCode.add(".class public undefined");
            jasminCode.add(".super java/lang/Object");
            jasminCode.add("");

            jasminCode.add(".method public <init>()V");
            jasminCode.add("aload_0");
            jasminCode.add("invokenonvirtual java/lang/Object/<init>()V");
            jasminCode.add("return");
            jasminCode.add(".end method");
            jasminCode.add("");
        }

        for(int i = 0; i < ctx.function_declaration().size(); i++) //Check our functions.
        {
            visit(ctx.function_declaration(i)); //Visit all our functions
        }

        return null;
    }

    @Override
    public Void visitClass_declaration(YoltParser.Class_declarationContext ctx) {
        jasminCode.add(".class public " + ctx.IDENTIFIER()); //Create our class.
        jasminCode.add(".super java/lang/Object");
        jasminCode.add("");

        for(int i = 0; i < ctx.global_var_declaration().size(); i++)
        {
            visit(ctx.global_var_declaration(i)); //Our global variables.
        }

        jasminCode.add(".method public <init>()V"); //Create init method as entrypoint for the code.
        jasminCode.add("aload_0");
        jasminCode.add("invokenonvirtual java/lang/Object/<init>()V");
        jasminCode.add("return");
        jasminCode.add(".end method");
        jasminCode.add("");

        for(int i = 0; i < ctx.function_declaration().size(); i++)
        {
            visit(ctx.function_declaration(i)); //Visit all the functions inside the class.
        }
        return null;
    }

    @Override
    public Void visitFunction_declaration(YoltParser.Function_declarationContext ctx) {
        jasminCode.add(".method public static "+ ctx.IDENTIFIER() +"([Ljava/lang/String;)V");
        jasminCode.add(".limit stack 99");
        jasminCode.add(".limit locals 99");
        jasminCode.add("");

        for(int i = 0; i < ctx.statement().size(); i++)
        {
            visit(ctx.statement(i)); //visit all our statements inside our function.
        }

        jasminCode.add("return"); //TODO CHANGE TO ACTUAL RETURN INSTEAD OF RETURNING NOTHING
        jasminCode.add(".end method");
        jasminCode.add("");
        return null;
    }

    @Override
    public Void visitGlobal_var_declaration(YoltParser.Global_var_declarationContext ctx) {
        //TODO FIX THE GLOBAL STUFF.
        //visit(ctx.expr());

        Symbol s = symbols.get(ctx);
        if (s.getType() == DataType.STRING)
        {
            jasminCode.add(".field private " + ctx.IDENTIFIER() + " a");
        } else if (s.getType() == DataType.BOOLEAN)
        {
            jasminCode.add(".field private " + ctx.IDENTIFIER() + " I");
        } else if (s.getType() == DataType.COINS)
        {
            jasminCode.add(".field private " + ctx.IDENTIFIER() + " I");
        } else if (s.getType() == DataType.INT)
        {
            jasminCode.add(".field private " + ctx.IDENTIFIER() + " I");
        }

        //here perhaps say ldc and then assign value to it?

        return null;
    }

    @Override
    public Void visitIf_statement(YoltParser.If_statementContext ctx) {

        visit(ctx.logic_expr());

        jasminCode.add("ifeq else_" + elseif); //If it is false. go to end if.

        for(int i = 0; i < ctx.statement().size(); i++)
        {
            visit(ctx.statement(i)); //visit all statements inside the function and add their bytecode.
        }

        jasminCode.add("goto endif_" + endif);

        jasminCode.add("else_" + elseif + ":");
        elseif++;

        for(int i = 0; i < ctx.else_if_statement().size(); i++) //All the else if statements.
        {
            visit(ctx.else_if_statement(i));
        }

        if(ctx.else_statement() != null) visit(ctx.else_statement()); //The else statement.


        jasminCode.add("endif_" + endif + ":");
        endif++;

        return null;
    }

    @Override
    public Void visitElse_if_statement(YoltParser.Else_if_statementContext ctx) {
        visit(ctx.logic_expr()); //Get our valuesss.

        jasminCode.add("ifeq else_" + elseif); //If it is false. go to next else if.

        for(int i = 0; i < ctx.statement().size(); i++)
        {
            visit(ctx.statement(i)); //visit all statements inside the function and add their bytecode.
        }

        jasminCode.add("goto endif_" + endif);


        jasminCode.add("else_" + elseif + ":");
        elseif++;

        return null;
    }

    @Override
    public Void visitElse_statement(YoltParser.Else_statementContext ctx) {
        for(int i = 0; i < ctx.statement().size(); i++)
        {
            visit(ctx.statement(i)); //visit all statements inside the function and adds their bytecode.
        }
        return null;
    }

    //TODO Figure out something for nested loops! <- Can be removed :)
    @Override
    public Void visitWhile_loop(YoltParser.While_loopContext ctx) {
        int currentLoopNumber = loopnr; //I hope this is allowed?
        loopnr++; //I hope doing this is allowed?

        jasminCode.add("loopcheck_" + currentLoopNumber + ":");

        visit(ctx.logic_expr()); //Get our true or false on the stack.

        jasminCode.add("ifeq endloop_" + currentLoopNumber); //Once our answer from compare_multiple_values becomes zero we go to the end of the loop.

        for(int i = 0; i < ctx.statement().size(); i++)
        {
            visit(ctx.statement(i)); //Visit all our statements inside this thing.
            //TODO IF WE WANT WE COULD ADD A BREAK STATEMENT SOMEWHERE IN HERE. JUST MAKE IT GO TO endloop WITH CURRENT VALUE OF endloop?!
        }

        jasminCode.add("goto loopcheck_" + currentLoopNumber);

        jasminCode.add("endloop_" + currentLoopNumber + ":");
        return null;
    }

    @Override
    public Void visitDo_while_loop(YoltParser.Do_while_loopContext ctx) {
        int currentLoopNumber = loopnr; //I hope this is allowed?
        loopnr++; //I hope doing this is allowed?

        jasminCode.add("startloop_" + currentLoopNumber + ":");

        for(int i = 0; i < ctx.statement().size(); i++)
        {
            visit(ctx.statement(i)); //Visit all our statements, we do this before
            //TODO Consider adding break statement.
        }

        visit(ctx.logic_expr()); //Get our true or false on the stack.

        jasminCode.add("ifne startloop_" + currentLoopNumber);
        return null;
    }

    @Override
    public Void visitLogicAnd(YoltParser.LogicAndContext ctx) {
        visit(ctx.logic_expr(0));
        visit(ctx.logic_expr(1));

        jasminCode.add("ifeq false_" + boolnr); //If it is false the result of the statement will always be false.
        jasminCode.add("ifeq false2_" + boolnr);
        jasminCode.add("iconst_1"); //Both are true, so the value we add on the stack is also true!
        jasminCode.add("goto endcmp_" + boolnr);

        jasminCode.add("false_" + boolnr +":"); //First value is false, so statement is false.
        jasminCode.add("pop"); //Pop this value, we don't care about it really since it doesn't matter if it is true or false.
        jasminCode.add("false2_" + boolnr +":"); //Second value is false, so statement is false.
        jasminCode.add("iconst_0");

        jasminCode.add("endcmp_" + boolnr + ":");
        boolnr++;
        return null;
    }

    @Override
    public Void visitLogicOr(YoltParser.LogicOrContext ctx) {
        visit(ctx.logic_expr(0));
        visit(ctx.logic_expr(1));

        jasminCode.add("ifeq false_" + boolnr); //If the first value is false we go and check if the second value is also false.
        jasminCode.add("pop"); //It wasn't false, so we can remove the first one and tell our result was true.
        jasminCode.add("iconst_1"); //Add true on the stack.
        jasminCode.add("goto endcmp_" + boolnr); //Go to end of choice.

        jasminCode.add("false_" + boolnr +":"); //Check if the second value perhaps is true.
        jasminCode.add("ifeq false2_" + boolnr);//
        jasminCode.add("iconst_1"); //TODO Consider changing this to a -1 and store this in magic_value. Then at end load magic value and see if it is -1, indicating it is true.
        jasminCode.add("goto endcmp_" + boolnr);

        jasminCode.add("false2_" + boolnr +":");
        jasminCode.add("iconst_0");

        jasminCode.add("endcmp_" + boolnr + ":");
        boolnr++;
        return null;
    }

    @Override
    public Void visitCompare_values(YoltParser.Compare_valuesContext ctx) {
        visit(ctx.expr(0));
        visit(ctx.expr(1));



        if (ctx.LOGIC_EQUAL() != null) jasminCode.add("if_icmpeq true_" + boolnr);
        else if (ctx.LOGIC_BIGGER() != null) jasminCode.add("if_icmpgt true_"+ boolnr);
        else if (ctx.LOGIC_BIGGER_EQUAL() != null) jasminCode.add("if_icmpge true_"+ boolnr);
        else if (ctx.LOGIC_LOWER() != null) jasminCode.add("if_icmplt true_"+ boolnr);
        else if (ctx.LOGIC_LOWER_EQUAL() != null) jasminCode.add("if_icmple true_"+ boolnr);

        jasminCode.add("iconst_0"); //False
        jasminCode.add("goto endcmp_" + boolnr);

        jasminCode.add("true_" + boolnr +":"); //True.
        jasminCode.add("iconst_1");

        jasminCode.add("endcmp_" + boolnr + ":");
        boolnr++;

        return null;
    }

    @Override
    public Void visitVar_declaration(YoltParser.Var_declarationContext ctx) {
        visit(ctx.expr());

        Symbol s = symbols.get(ctx);

        if (s.getType() == DataType.STRING)
        {
            jasminCode.add("astore " + s.getLocalSlot());
        } else if (s.getType() == DataType.BOOLEAN)
        {
            jasminCode.add("istore " + s.getLocalSlot());
        } else if (s.getType() == DataType.COINS)
        {
            jasminCode.add("istore " + s.getLocalSlot());
        } else if (s.getType() == DataType.INT)
        {
            jasminCode.add("istore " + s.getLocalSlot());
        }

        return null;
    }

    @Override
    public Void visitVar_addition(YoltParser.Var_additionContext ctx) {

        visit(ctx.expr());
        Symbol s = symbols.get(ctx);

        if (s.getType() == DataType.INT)
        {
            jasminCode.add("istore " + s.getLocalSlot()); //Store it in that variable.
        } else if (s.getType() == DataType.COINS)
        {
            jasminCode.add("istore " + s.getLocalSlot());
        }


        //TODO CONSIDER ADDING STUFF FOR STRINGS AND ALL.

        return null;
    }

    @Override
    public Void visitRandom_input(YoltParser.Random_inputContext ctx) {
        jasminCode.add("new java/util/Random");
        jasminCode.add("dup");
        jasminCode.add("invokenonvirtual java/util/Random/<init>()V");

        if (ctx.expr() != null) {
            visit(ctx.expr());
            jasminCode.add("invokevirtual java/util/Random/nextInt(I)I");
        } else
        {
            jasminCode.add("invokevirtual java/util/Random/nextInt()I");
        }

        return null;
    }

    @Override
    public Void visitPrompt_input(YoltParser.Prompt_inputContext ctx) {
        jasminCode.add("new java/util/Scanner");
        jasminCode.add("dup");
        jasminCode.add("getstatic java/lang/System/in Ljava/io/InputStream;");
        jasminCode.add("invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V");

        if (ctx.INT() != null)
        {
            jasminCode.add("invokevirtual java/util/Scanner/nextInt()I");
        } else
        {
            jasminCode.add("invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;");
        }

        return null;
    }

    @Override
    public Void visitBreak_statement(YoltParser.Break_statementContext ctx) {
        jasminCode.add("goto endloop_" + loopnr);
        return null;
    }


    @Override
    public Void visitPrint_stmt(YoltParser.Print_stmtContext ctx) {
        jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        visit(ctx.expr()); //Doesn't put number on tha stack?

        //int test = 37115;
        //System.out.println(test % 69);
        //System.out.println(test % 2898 / 69); //Silver
        //System.out.println(37815 / 2898);


        if( types.get(ctx.expr()) == DataType.INT )
            jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");
        else if( types.get(ctx.expr()) == DataType.STRING )
            jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        else if (types.get(ctx.expr()) == DataType.BOOLEAN)
        {
            jasminCode.add("ifeq false_" + boolnr);
            jasminCode.add("ldc \"TRUE\"");
            jasminCode.add("goto endcmp_" + boolnr);
            jasminCode.add("false_" + boolnr + ":");
            jasminCode.add("ldc \"FALSE\"");
            jasminCode.add("endcmp_" + boolnr +":");
            jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        } else if (types.get(ctx.expr()) == DataType.COINS)
        { //TODO Look into if we can concatenate before printing!
            jasminCode.add("istore 0");
            jasminCode.add("ldc \"GOLD:\"");
            jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
            jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
            jasminCode.add("iload 0");
            jasminCode.add("ldc 2898");
            jasminCode.add("idiv"); //The value of the gold.
            jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");
            jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");

            jasminCode.add("ldc \"SILVER:\"");
            jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
            jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
            jasminCode.add("iload 0");
            jasminCode.add("ldc 2898");
            jasminCode.add("irem");
            jasminCode.add("ldc 69");
            jasminCode.add("idiv"); //The silver value.
            jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");
            jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");

            jasminCode.add("ldc \"BRONZE:\"");
            jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
            jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
            jasminCode.add("iload 0");
            jasminCode.add("ldc 69");
            jasminCode.add("irem"); //Bronze.
            jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");
        }
        else throw new YoltCompilerException("Unknown type in print");



        return null;
    }

    @Override
    public Void visitParanExpression(YoltParser.ParanExpressionContext ctx) {
        visit(ctx.expr());
        return null;
    }

    @Override
    public Void visitMulDivExpression(YoltParser.MulDivExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);
        if (ctx.MUL() != null) jasminCode.add("imul");
        else if (ctx.DIV() != null) jasminCode.add("idiv");

        return null;
    }

    @Override
    public Void visitAddSubExpression(YoltParser.AddSubExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);
        if (ctx.ADD() != null) jasminCode.add("iadd");
        else if (ctx.SUB() != null) jasminCode.add("isub");

        return null;
    }

    @Override
    public Void visitPowModExpression(YoltParser.PowModExpressionContext ctx) {
        visit(ctx.left);
        visit(ctx.right);
        if (ctx.MOD() != null) jasminCode.add("irem");
        //TODO Add power by here as well, will need to be done in a "special" way since there is no easy bytecode for that. So will be 6*6*6*6*6 probably.
        return null;
    }

    @Override
    public Void visitVar_addition_short(YoltParser.Var_addition_shortContext ctx) {
        visit(ctx.expr());
        Symbol s = symbols.get(ctx);

        if (s.getType() == DataType.INT)
        {
            //jasminCode.add("iadd " + s.getLocalSlot() + " " + ctx.expr().toString()); //TODO FIX.
        } else if (s.getType() == DataType.COINS)
        {
            //TODO FIX THIS SO IT ADDS GOLD VALUE
        }

        return null;
    }

    //TODO NOG TE FIXEN.
    @Override
    public Void visitNegativeExpression(YoltParser.NegativeExpressionContext ctx) {
        jasminCode.add("isub");
        visit(ctx.expr());


        return null;
    }

    @Override
    public Void visitVarIdentifier(YoltParser.VarIdentifierContext ctx) {
        Symbol s = symbols.get(ctx);

        if( s.getType() == DataType.INT )
            jasminCode.add("iload " + s.getLocalSlot());
        else if (s.getType() == DataType.STRING)
            jasminCode.add("aload " + s.getLocalSlot());
        else if (s.getType() == DataType.BOOLEAN)
        {
            jasminCode.add("iload " + s.getLocalSlot());
        } else if (s.getType() == DataType.COINS)
        {
            jasminCode.add("iload " + s.getLocalSlot());
        }
        return null;
    }

    @Override
    public Void visitIntIdentifier(YoltParser.IntIdentifierContext ctx) {
        jasminCode.add("ldc " + ctx.INT_VALUE().toString());
        return null;
    }

    @Override
    public Void visitStringIdentifier(YoltParser.StringIdentifierContext ctx) {
        jasminCode.add("ldc " + ctx.STRING_VALUE().toString());
        return null;
    }

    @Override
    public Void visitBoolIdentifier(YoltParser.BoolIdentifierContext ctx) {
        if (ctx.BOOLEAN_VALUE().toString().equals("FALSE"))
        {
            jasminCode.add("iconst_0");
        } else if (ctx.BOOLEAN_VALUE().toString().equals("TRUE"))
        {
            jasminCode.add("iconst_1");
        }
        return null;
    }

    @Override
    public Void visitGoldIdentifier(YoltParser.GoldIdentifierContext ctx) {
        String coins = ctx.COINS_VALUE().toString();
        String[] differentCoins = coins.split("_");

        int totalGold = 0;

        for (String coin : differentCoins) {
            if (coin.contains("G")) {
                totalGold += Integer.parseInt(coin.replace("G", "")) * 2898;
            } else if (coin.contains("S")) {
                totalGold += Integer.parseInt(coin.replace("S", "")) * 69;
            } else if (coin.contains("B")) {
                totalGold += Integer.parseInt(coin.replace("B", ""));
            }
        }

        jasminCode.add("ldc " + totalGold);
        return null;
    }

    @Override
    public Void visitTextIdentifier(YoltParser.TextIdentifierContext ctx) {
        visit(ctx.prompt_input());
        return null;
    }

    @Override
    public Void visitRandomIdentifier(YoltParser.RandomIdentifierContext ctx) {
        visit(ctx.random_input());
        return null;
    }

    @Override
    public Void visitStatement(YoltParser.StatementContext ctx) {
        jasminCode.add(""); //Makes the bytecode look a little better in my opinion by splitting statements up.
        return super.visitStatement(ctx);
    }

    public ArrayList<String> getJasminCode() {
        return jasminCode;
    }
}
