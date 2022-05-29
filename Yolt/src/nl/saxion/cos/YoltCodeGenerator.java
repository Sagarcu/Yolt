package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import java.util.ArrayList;

@SuppressWarnings("DuplicatedCode")
public class YoltCodeGenerator extends YoltBaseVisitor<Void> {
    private int loopnr = 0;//required.
    private int boolnr = 0; //required for loop in a loop.

    private int elseif = 0; //required for multiple else if loops.
    private int endif = 0; //required.

    private final ParseTreeProperty<DataType> types;
    private final ParseTreeProperty<Symbol> symbols;
    private final ParseTreeProperty<FunctionType> functionTypes;
    private final ParseTreeProperty<FunctionSymbol> functionSymbols;

    private ArrayList<YoltParser.ExprContext> initExpressions = new ArrayList<>();
    private final ArrayList<String> initVarCode = new ArrayList<>();

    private final ArrayList<String> jasminCode = new ArrayList<>();

    private final String className; //Name of our class.
    private Boolean createdInit = false;

    public YoltCodeGenerator(
                          ParseTreeProperty<DataType> types,
                          ParseTreeProperty<Symbol> symbols,
                          ParseTreeProperty<FunctionType> functionTypes,
                          ParseTreeProperty<FunctionSymbol> functionSymbols,
                          String standardName) {
        this.types = types;
        this.symbols = symbols;
        this.functionTypes = functionTypes;
        this.functionSymbols = functionSymbols;
        this.className = standardName;
    }

    @Override
    public Void visitApplication(YoltParser.ApplicationContext ctx) {
        jasminCode.add(".class public " + className);
        jasminCode.add(".super java/lang/Object");
        jasminCode.add("");

        for(int i = 0; i < ctx.global_var_declaration().size(); i++)
        {
            visit(ctx.global_var_declaration(i));
        }

        for(int i = 0; i < ctx.function_declaration().size(); i++) //Check our functions.
        {
            visit(ctx.function_declaration(i)); //Visit all our functions
        }

        if (!createdInit) //TODO CONSIDER MOVING LATER TO ABOVE ALL FUNCTIONS? BUT NEED INFO FROM CODECHECKER THEN!
        { //Creates a standard initialize.
            jasminCode.add(".method public <init>()V");
            jasminCode.add(".limit stack 99");
            jasminCode.add(".limit locals 99");
            jasminCode.add("aload_0");
            jasminCode.add("invokenonvirtual java/lang/Object/<init>()V");

            for(int i = 0; i < initExpressions.size(); i++)
            {
                jasminCode.add("aload_0");
                visit(initExpressions.get(i));
            }

            for (String s : initVarCode) jasminCode.add(s.toString());


            jasminCode.add("return");
            jasminCode.add(".end method");
            jasminCode.add("");
        }
        return null;
    }

    @Override
    public Void visitFunction_declaration(YoltParser.Function_declarationContext ctx) {
        if (!createdInit && ctx.IDENTIFIER().toString().equals(className)) //Init method. //TODO SHOULD BE CORRECT NOW!
        {
            createdInit = true;
            jasminCode.add(".method public <init>()V"); //Create init method.
            jasminCode.add(".limit stack 99");
            jasminCode.add(".limit locals 99");
            jasminCode.add("aload_0");
            jasminCode.add("invokenonvirtual java/lang/Object/<init>()V");

            for(int i = 0; i < ctx.statement().size(); i++) //Anything we want to do within the initializer.
            {
                visit(ctx.statement(i)); //visit all our statements inside initialize.
            }

            jasminCode.add("return");

        } else if (ctx.IDENTIFIER().toString().equals("main")) //Main method. //TODO UPDATE
        {
            jasminCode.add(".method public static main([Ljava/lang/String;)V"); //Create init method as entrypoint for the code.
            jasminCode.add(".limit stack 99");
            jasminCode.add(".limit locals 99");
            jasminCode.add("new " + className);
            jasminCode.add("dup");
            jasminCode.add("invokenonvirtual " + className + "/<init>()V");
            jasminCode.add("astore 0");
            jasminCode.add("");
            //jasminCode.add("new " + className); //TODO MOVE OUTSIDE OF HERE!
            //jasminCode.add("dup");
            //jasminCode.add("invokenonvirtual " + className + "/<init>()V");

            for(int i = 0; i < ctx.statement().size(); i++)
            {
                visit(ctx.statement(i)); //visit all our statements inside our function.
            }
            jasminCode.add("return");
        } else //All other methods!
        {
            StringBuilder jasmin = new StringBuilder(".method public ");
            jasmin.append(ctx.IDENTIFIER().toString());
            jasmin.append("(");

            FunctionSymbol fs = functionSymbols.get(ctx);

            for(int i = 0; i < fs.getTypes().size(); i++)
            {
                if(fs.getTypes().get(i).equals(DataType.STRING)) jasmin.append("Ljava/lang/String;");
                else jasmin.append("I");
            }
            jasmin.append(")");

            if (fs.getFunctionType() == FunctionType.VOID) jasmin.append("V");
            else if (fs.getFunctionType() == FunctionType.STRING) jasmin.append("Ljava/lang/String;");
            else jasmin.append("I");

            jasminCode.add(jasmin.toString());
            jasminCode.add(".limit stack 99");
            jasminCode.add(".limit locals 99");
            jasminCode.add("");

            for(int i = 0; i < ctx.variables().size(); i++)
            {
                visit(ctx.variables(i)); //Visit our parameter variables.
            }

            for(int i = 0; i < ctx.statement().size(); i++)
            {
                visit(ctx.statement(i)); //visit all our statements inside our function.
            }

            if (fs.getFunctionType() == FunctionType.INT || fs.getFunctionType() == FunctionType.COINS || fs.getFunctionType() == FunctionType.BOOLEAN)
            {
                visit(ctx.return_statement());
                jasminCode.add("ireturn");
            } else if (fs.getFunctionType() == FunctionType.STRING)
            {
                visit(ctx.return_statement());
                jasminCode.add("areturn");
            } else
            {
                jasminCode.add("return");
            }
        }

        jasminCode.add(".end method");
        jasminCode.add("");


        return null;
    }

    @Override //TODO TYPECHECK!!!
    public Void visitFunction_call(YoltParser.Function_callContext ctx) {
        FunctionSymbol fs = functionSymbols.get(ctx);

        StringBuilder parameters = new StringBuilder("");

        for(int i = 0; i < fs.getTypes().size(); i++)
        {
            if(fs.getTypes().get(i).equals(DataType.STRING)) parameters.append("Ljava/lang/String;");
            else parameters.append("I");
        }

        jasminCode.add("aload 0"); //Load class onto stack.

        for(int i = 0; i < ctx.expr().size(); i++)
        {
            visit(ctx.expr(i));
        }

        if(fs.getFunctionType().equals(FunctionType.STRING) || fs.getFunctionType().equals(FunctionType.VOID)) jasminCode.add("invokevirtual " + className + "/" +ctx.IDENTIFIER().toString() +"(" + parameters + ")V");
        else jasminCode.add("invokevirtual " + className + "/" +ctx.IDENTIFIER().toString() +"(" + parameters + ")I");
        return null;
    }

    @Override
    public Void visitFunctionExpression(YoltParser.FunctionExpressionContext ctx) {
        //Function symbol here instead of function type.
        FunctionSymbol fs = functionSymbols.get(ctx);

        StringBuilder parameters = new StringBuilder("");

        for(int i = 0; i < fs.getTypes().size(); i++)
        {
            if(fs.getTypes().get(i).equals(DataType.STRING)) parameters.append("Ljava/lang/String;");
            else parameters.append("I");
        }

        jasminCode.add("aload 0"); //Load class onto stack.

        for(int i = 0; i < ctx.function_call().expr().size(); i++)
        {
            visit(ctx.function_call().expr(i));
        }

        if(fs.getFunctionType().equals(FunctionType.VOID)) jasminCode.add("invokevirtual " + className + "/" +ctx.function_call().IDENTIFIER().toString() +"(" + parameters + ")V");
        else if (fs.getFunctionType().equals(FunctionType.STRING)) jasminCode.add("invokevirtual " + className + "/" +ctx.function_call().IDENTIFIER().toString() +"(" + parameters + ")Ljava/lang/String;");
        else jasminCode.add("invokevirtual " + className + "/" +ctx.function_call().IDENTIFIER().toString() +"(" + parameters + ")I");



        //TODO typecheck in codechecker!
        //ctx.function_call().expr();
        //jasminCode.add("invokevirtual " + className + "/" + ctx.function_call().expr() + "I");

        return null;
    }

    @Override
    public Void visitGlobal_var_declaration(YoltParser.Global_var_declarationContext ctx) {
        //TODO FIX THE GLOBAL STUFF.
        //visit(ctx.expr());

        Symbol s = symbols.get(ctx);
        if (s.getType() == DataType.STRING)
        {
            jasminCode.add(".field private " + ctx.IDENTIFIER().toString() + " a");
        } else jasminCode.add(".field private " + ctx.IDENTIFIER().toString()  + " I");

        if(ctx.expr() != null) //TODO add all code for creating variables here.
        {
            if(s.getType() == DataType.INT)
            {
                initExpressions.add(ctx.expr());
                initVarCode.add("putfield " + className + "/" + ctx.IDENTIFIER().toString()  + " I");
            }


        }



        //TODO find out how to do the initializing of these values!

        return null;
    }

    @Override
    public Void visitIf_statement(YoltParser.If_statementContext ctx) {
        endif++;
        elseif++;
        int currentEndIf = endif;
        int currentElseIf = elseif;

        visit(ctx.logic_expr());

        jasminCode.add("ifeq else_" + currentElseIf); //If it is false. go to end if.

        for(int i = 0; i < ctx.statement().size(); i++)
        {
            visit(ctx.statement(i)); //visit all statements inside the function and add their bytecode.
        }

        jasminCode.add("goto endif_" + currentEndIf);

        jasminCode.add("else_" + currentElseIf + ":");


        for(int i = 0; i < ctx.else_if_statement().size(); i++) //All the else if statements.
        {
            visit(ctx.else_if_statement(i));
        }

        if(ctx.else_statement() != null) visit(ctx.else_statement()); //The else statement.


        jasminCode.add("endif_" + currentEndIf + ":");
        return null;
    }

    @Override
    public Void visitElse_if_statement(YoltParser.Else_if_statementContext ctx) {
        elseif++;
        int currentEndIf = endif;
        int currentElseIf = elseif;
        visit(ctx.logic_expr()); //Get our valuesss.

        jasminCode.add("ifeq else_" + currentElseIf); //If it is false. go to next else if.

        for(int i = 0; i < ctx.statement().size(); i++)
        {
            visit(ctx.statement(i)); //visit all statements inside the function and add their bytecode.
        }

        jasminCode.add("goto endif_" + currentEndIf);


        jasminCode.add("else_" + currentElseIf + ":");
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

    @Override
    public Void visitWhile_loop(YoltParser.While_loopContext ctx) {
        loopnr++;
        int currentLoopNumber = loopnr;

        jasminCode.add("loopcheck_" + currentLoopNumber + ":");

        visit(ctx.logic_expr()); //Get our true or false on the stack.

        jasminCode.add("ifeq endloop_" + currentLoopNumber); //Once our answer from compare_multiple_values becomes zero we go to the end of the loop.

        for(int i = 0; i < ctx.statement().size(); i++)
        {
            visit(ctx.statement(i)); //Visit all our statements inside this thing.
        }

        jasminCode.add("goto loopcheck_" + currentLoopNumber);

        jasminCode.add("endloop_" + currentLoopNumber + ":");
        return null;
    }

    @Override
    public Void visitDo_while_loop(YoltParser.Do_while_loopContext ctx) {
        loopnr++;
        int currentLoopNumber = loopnr;

        jasminCode.add("startloop_" + currentLoopNumber + ":");

        for(int i = 0; i < ctx.statement().size(); i++)
        {
            visit(ctx.statement(i)); //Visit all our statements, we do this before
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
        jasminCode.add("iconst_1");
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
    public Void visitVar_assignment(YoltParser.Var_assignmentContext ctx) {

        Symbol s = symbols.get(ctx);

        if(s.isGlobal())
        {
            jasminCode.add("aload_0");

            visit(ctx.expr());

            if (s.getType() == DataType.STRING) jasminCode.add("putfield " + className + "/" + ctx.IDENTIFIER() + " A");
            else  jasminCode.add("putfield " + className + "/" + ctx.IDENTIFIER() + " I");
        } else
        {
            visit(ctx.expr());
            if (s.getType() == DataType.STRING) jasminCode.add("astore " + s.getLocalSlot());
            else  jasminCode.add("istore " + s.getLocalSlot());
        }
        return null;
    }


    //TODO Fix short_assignments!
    @Override
    public Void visitVar_assignment_short(YoltParser.Var_assignment_shortContext ctx) {

        Symbol s = symbols.get(ctx);

        if (s.getType() == DataType.INT || s.getType() == DataType.COINS)
        {
            jasminCode.add("iload " + s.getLocalSlot());
            visit(ctx.expr());

            if (ctx.ADD() != null) jasminCode.add("iadd");
            else if (ctx.SUB() != null) jasminCode.add("isub");
            else if (ctx.DIV() != null) jasminCode.add("idiv");
            else if (ctx.MUL() != null) jasminCode.add("imul");
            else if (ctx.POW() != null) jasminCode.add("iadd"); //TODO UPDATE TO POWER.
            else if (ctx.MOD() != null) jasminCode.add("irem");
            jasminCode.add("istore " + s.getLocalSlot());
        } else if (s.getType() == DataType.STRING)
        {
            if (ctx.ADD() != null)
            {
                //TODO stuff for addition of Strings.
            }
        }

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
        visit(ctx.expr()); //puts number on the stack.

        //int test = 37115;
        //System.out.println(test % 69);
        //System.out.println(test % 2898 / 69); //Silver
        //System.out.println(37815 / 2898);


        if( types.get(ctx.expr()) == DataType.INT)
            jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");
        else if( types.get(ctx.expr()) == DataType.STRING )
            jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        else if (types.get(ctx.expr()) == DataType.BOOLEAN)
        {
            generateBooleanJasmin();
            jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        } else if (types.get(ctx.expr()) == DataType.COINS)
        {
           generateCoinsJasmin();
           jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        }

        //else throw new YoltCompilerException("Unknown type in print");



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
        if (ctx.ADD() != null)
        {
            if(types.get(ctx.left) == DataType.STRING || types.get(ctx.right) == DataType.STRING)
            {
                jasminCode.add("new java/lang/StringBuilder");
                jasminCode.add("dup");
                jasminCode.add("invokespecial java/lang/StringBuilder/<init>()V");

                visit(ctx.left);
                if(types.get(ctx.left) == DataType.INT) jasminCode.add("invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;");
                else if (types.get(ctx.left) == DataType.COINS)
                {
                    generateCoinsJasmin();
                    jasminCode.add("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
                }
                else if (types.get(ctx.left) == DataType.BOOLEAN)
                {
                    generateBooleanJasmin();
                    jasminCode.add("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
                }
                else jasminCode.add("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");

                visit(ctx.right);
                if(types.get(ctx.right) == DataType.INT) jasminCode.add("invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;");
                else if (types.get(ctx.right) == DataType.COINS)
                {
                    generateCoinsJasmin();
                    jasminCode.add("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
                }  else if (types.get(ctx.right) == DataType.BOOLEAN)
                {
                    generateBooleanJasmin();
                    jasminCode.add("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
                }
                else jasminCode.add("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
                jasminCode.add("invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");
            } else
            {
                visit(ctx.left);
                visit(ctx.right);
                jasminCode.add("iadd");
            }
        }
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
    public Void visitVarIdentifier(YoltParser.VarIdentifierContext ctx) {
        Symbol s = symbols.get(ctx);

        if(s.isGlobal())
        {
            jasminCode.add("aload_0"); //TODO change with 1 or aload 1 if it not worky!
            if( s.getType() == DataType.STRING )
                jasminCode.add("getfield " + className + "/" + s.getName() +" A");
            else {
                jasminCode.add("getfield " + className + "/" + s.getName() +" I");
            }
            //Put stuff here if it is global.
        } else
        {
            if( s.getType() == DataType.STRING )
                jasminCode.add("aload " + s.getLocalSlot());
            else {
                jasminCode.add("iload " + s.getLocalSlot());
            }
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
    public Void visitCoinIdentifier(YoltParser.CoinIdentifierContext ctx) {
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

    /*
    @Override
    public Void visitRandomIdentifier(YoltParser.RandomIdentifierContext ctx) {
        visit(ctx.random_input());
        return null;
    } */ //Uncomment if shit with the random is suddenly broken!.


    @Override
    public Void visitReturn_statement(YoltParser.Return_statementContext ctx) {
        visit(ctx.expr()); //This gets our return value on the stack.
        return null;
    }

    @Override
    public Void visitStatement(YoltParser.StatementContext ctx) {
        //jasminCode.add(""); //Sometimes makes the jasmin a bit easier to decipher.
        return super.visitStatement(ctx);
    }

    public ArrayList<String> getJasminCode() {
        return jasminCode;
    }

    private void generateCoinsJasmin(){
        jasminCode.add("istore 98"); //TODO FIND BETTER PLACE TO STORE THIS NUMBER!
         // requires the value to already be on the stack.
        jasminCode.add("new java/lang/StringBuilder");
        jasminCode.add("dup");
        jasminCode.add("invokespecial java/lang/StringBuilder/<init>()V");
        jasminCode.add("iload 98");
        jasminCode.add("ldc 2898");
        jasminCode.add("idiv"); //The value of the gold.
        jasminCode.add("invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;");
        jasminCode.add("ldc \"G_\"");
        jasminCode.add("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");


        jasminCode.add("iload 98");
        jasminCode.add("ldc 2898");
        jasminCode.add("irem");
        jasminCode.add("ldc 69");
        jasminCode.add("idiv"); //The silver value.
        jasminCode.add("invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;");
        jasminCode.add("ldc \"S_\"");
        jasminCode.add("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");

        jasminCode.add("iload 98");
        jasminCode.add("ldc 69");
        jasminCode.add("irem"); //Bronze.
        jasminCode.add("invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;");
        jasminCode.add("ldc \"B\"");
        jasminCode.add("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
        jasminCode.add("invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");
        jasminCode.add("ldc 0");
        jasminCode.add("istore 98");
    }

    private void generateBooleanJasmin() //The boolean value should already be on the stack!
    {
        jasminCode.add("ifeq false_" + boolnr);
        jasminCode.add("ldc \"TRUE\"");
        jasminCode.add("goto endcmp_" + boolnr);
        jasminCode.add("false_" + boolnr + ":");
        jasminCode.add("ldc \"FALSE\"");
        jasminCode.add("endcmp_" + boolnr +":");
    }
}
