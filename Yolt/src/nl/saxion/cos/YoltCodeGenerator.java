package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;


@SuppressWarnings("DuplicatedCode")
public class YoltCodeGenerator extends YoltBaseVisitor< Void > {

    private HashMap<String, String> variables = new HashMap<String, String>();
    private int loopnr = 0;
    private int endloop = 0;

    private int logicnr = 0;
    private int statementnr = 0;
    private int boolnr = 0;

    private int endif = 0;
    private int elseif = 0;

    //Put variables in like a hashmap or something? number corresponding to name of variable.

    private ArrayList<String> jasminCode = new ArrayList<>();
    @Override
    public Void visitApplication(YoltParser.ApplicationContext ctx) {
        //Our code has either one class and / or multiple functions. We visit those here.
        //variables.put("Magic&&Flag", "0");
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

        //Standard initializer.



        for(int i = 0; i < ctx.function_declaration().size(); i++) //Check our functions.
        {
            visit(ctx.function_declaration(i));
        }

        return null;
    }

    @Override
    public Void visitClass_declaration(YoltParser.Class_declarationContext ctx) {
        jasminCode.add(".class public " + ctx.IDENTIFIER(0));
        jasminCode.add(".super java/lang/Object");
        jasminCode.add("");

        jasminCode.add(".method public <init>()V");
        jasminCode.add("aload_0");
        jasminCode.add("invokenonvirtual java/lang/Object/<init>()V");
        jasminCode.add("return");
        jasminCode.add(".end method");
        jasminCode.add("");

        for(int i = 0; i < ctx.function_declaration().size(); i++)
        {
            visit(ctx.function_declaration(i)); //Visit all the functions inside the class.
        }
        //TODO Add logic for global variables here.
        //TODO CHECK SCOPING WITH FUNCTIONS OUTSIDE OF THIS CLASS.
        return null;
    }

    @Override
    public Void visitFunction_declaration(YoltParser.Function_declarationContext ctx) {
        //TODO Change main to function declaration name.
        jasminCode.add(".method public static "+ ctx.IDENTIFIER(0) +"([Ljava/lang/String;)V");
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
    public Void visitIf_statement(YoltParser.If_statementContext ctx) {

        visit(ctx.compare_multiple_values());

        //Check if it 0 or 1. If it is 1 then do all the stuff here, else go to end of the if statement.

        //Our value here is 0.
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
        visit(ctx.compare_multiple_values()); //Get our valuesss.

        jasminCode.add("ifeq else_" + statementnr); //If it is false. go to end if.

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

    @Override
    public Void visitWhile_loop(YoltParser.While_loopContext ctx) {
        //Let's write the bytecode for the While loop!

        jasminCode.add("loopcheck_" + loopnr + ":");

        visit(ctx.compare_multiple_values()); //Get our true or false on the stack.

        jasminCode.add("ifeq endloop_" + endloop); //Once our answer from compare_multiple_values becomes zero we go to the end of the loop.

        for(int i = 0; i < ctx.statement().size(); i++)
        {
            visit(ctx.statement(i)); //Visit all our statements inside this thing.
            //TODO IF WE WANT WE COULD ADD A BREAK STATEMENT SOMEWHERE IN HERE. JUST MAKE IT GO TO endloop WITH CURRENT VALUE OF endloop?!
            //TODO CHECK LOOP INSIDE OF ANOTHER LOOP.
        }
        jasminCode.add("goto loopcheck_" + loopnr);

        loopnr++;
        jasminCode.add("endloop_" + endloop + ":");
        endloop++;
        return null;
    }

    @Override //TODO FIX THE && || STUFF!
    public Void visitCompare_multiple_values(YoltParser.Compare_multiple_valuesContext ctx) {

        //Every time we come in here
        visit(ctx.compare_values()); //Get our first value. The rest we will calculate in order later?



        //for(int i = 0; i < ctx.compare_values().size(); i++)
        //{
        //    visit(ctx.compare_values());
        //}



        //TODO VISIT THESE IN ORDER OF OR AND AND! This way we can first do all the and statements and then do the or statements.
        /*
        for(int i = (ctx.LOGIC_AND().size() + ctx.LOGIC_OR().size()); i > 0; i--) //TODO  Replace with boolean logic perhaps.
        {
            if (ctx.LOGIC_AND(i - 1) != null)
            {
                jasminCode.add("ifeq false_" + boolnr); //If it is false the result of the statement will always be false.
                jasminCode.add("ifeq false2_" + boolnr);
                jasminCode.add("ldc 1"); //Both are true, so the value we add on the stack is also true!
                jasminCode.add("goto endcmp_" + boolnr);

                jasminCode.add("false_" + boolnr +":"); //First value is false, so statement is false.
                jasminCode.add("pop"); //Pop this value, we don't care about it really since it doesn't matter if it is true or false.
                jasminCode.add("false2_" + boolnr +":"); //Second value is false, so statement is false.
                jasminCode.add("ldc 0");

                jasminCode.add("endcmp_" + boolnr + ":");
                boolnr++;
            } else if (ctx.LOGIC_OR(i - 1) != null)
            {
                //TODO If it is correct then we return true.
                //if first value is false we need to check the second value. If both are false then we ldc 0
                //If first value is 1 (true) what do we do?
                jasminCode.add("ifeq false_" + boolnr); //If the first value is false we go and check if the second value is also false.
                jasminCode.add("pop"); //It wasn't false, so we can remove the first one and tell our result was true.
                jasminCode.add("ldc 1"); //Add true on the stack.
                jasminCode.add("goto endcmp_" + boolnr); //Go to end of choice.

                jasminCode.add("false_" + boolnr +":"); //Check if the second value perhaps is true.
                jasminCode.add("ifeq false2_" + boolnr);//
                jasminCode.add("ldc 1"); //TODO Consider changing this to a -1 and store this in magic_value. Then at end load magic value and see if it is -1, indicating it is true.
                jasminCode.add("goto endcmp_" + boolnr);

                jasminCode.add("false2_" + boolnr +":");
                jasminCode.add("ldc 0");

                jasminCode.add("endcmp_" + boolnr + ":");
                boolnr++;
                //Checks if one of the values is equal?
            }
        }
        */
        //Consider adding magic flag :D.



        //Don't do anything if it is neither and / or because we already got our value!
        //WE WANT TO RETURN 1 NUMBER HERE, WHICH IS 0 OR 1 BASED ON TRUE OR FALSE.
        return null;
    }

    @Override
    public Void visitCompare_values(YoltParser.Compare_valuesContext ctx) {
        visit(ctx.expr(0));
        visit(ctx.expr(1));

        if (ctx.LOGIC_EQUAL() != null) jasminCode.add("if_icmpeq true_" + boolnr);
        else if (ctx.LOGIC_BIGGER() != null) jasminCode.add("if_icmpgt true_"+ boolnr);
        else if (ctx.LOGIC_BIGGER_EQUAL() != null) jasminCode.add("if_icmpge true_"+ boolnr);
        else if (ctx.LOGIC_LOWER() != null) jasminCode.add("if_icmple true_"+ boolnr);
        else if (ctx.LOGIC_LOWER_EQUAL() != null) jasminCode.add("if_icmplt true_"+ boolnr);

        jasminCode.add("ldc 0"); //False
        jasminCode.add("goto endcmp_" + boolnr);

        jasminCode.add("true_" + boolnr +":"); //True.
        jasminCode.add("ldc 1");

        jasminCode.add("endcmp_" + boolnr + ":");
        boolnr++;


        //Should return in a boolean, 1 equals true, 0 equals false.

        return null;
    }

    @Override
    public Void visitInt_declaration(YoltParser.Int_declarationContext ctx) {

        if (ctx.expr() != null) visit(ctx.expr());
        else if (ctx.INT_VALUE() != null) jasminCode.add("ldc " + ctx.INT_VALUE());
        else if (ctx.prompt_input() != null) visit(ctx.prompt_input());
        else if (ctx.random_input() != null) visit(ctx.random_input());
        variables.put(ctx.IDENTIFIER().toString(), Integer.toString(variables.size()));
        jasminCode.add("istore " + (variables.size() - 1));


        return null;
    }

    @Override
    public Void visitRandom_input(YoltParser.Random_inputContext ctx) {
        jasminCode.add("new java/util/Random");
        jasminCode.add("dup");
        jasminCode.add("invokenonvirtual java/util/Random/<init>()V");
        if (ctx.number() != null) visit(ctx.number()); //This should load in our value if we do have one.
        jasminCode.add("invokevirtual java/util/Random/nextInt(I)I");

        return null;
    }

    @Override
    public Void visitPrompt_input(YoltParser.Prompt_inputContext ctx) {
        jasminCode.add("new java/util/Scanner");
        jasminCode.add("dup");
        jasminCode.add("getstatic java/lang/System/in Ljava/io/InputStream;");
        jasminCode.add("invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V");

        return null;
    }

    //TODO NOG TE FIXEN!
    @Override
    public Void visitPrint_stmt(YoltParser.Print_stmtContext ctx) {

        if(ctx.IDENTIFIER() != null)
        {
            jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
            String varIndex = variables.get(ctx.IDENTIFIER().toString());
            jasminCode.add("iload " + varIndex);
            jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");

        } else if (ctx.INT_VALUE() != null)
        {
            jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
            jasminCode.add("ldc " + ctx.INT_VALUE().toString());
            jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");
        }


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
    public Void visitNumberExpression(YoltParser.NumberExpressionContext ctx) {
        visit(ctx.number());
        //jasminCode.add("ldc " + ctx.number());
        //Don't visit anything, just add number onto the stack.
        return null;
    }

    @Override
    public Void visitNumber(YoltParser.NumberContext ctx) {
        if (ctx.INT_VALUE() != null) jasminCode.add("ldc " + ctx.INT_VALUE());
        else
        {
            String varIndex = variables.get(ctx.IDENTIFIER().toString()); //TODO Check if works and make check that it isn't null in thing.
            jasminCode.add("iload " + varIndex);
        }

        return null;
    }

    @Override
    public Void visitInt_addition_short(YoltParser.Int_addition_shortContext ctx) {
        String varIndex = variables.get(ctx.IDENTIFIER().toString()); //TODO Check if works and make check that it isn't null in thing.
        jasminCode.add("iinc " + varIndex + " 1");
        return null;
    }

    //TODO NOG TE FIXEN.
    @Override
    public Void visitNegativeExpression(YoltParser.NegativeExpressionContext ctx) {
        jasminCode.add("isub");
        visit(ctx.expr());


        return null;
    }


    public ArrayList<String> getJasminCode() {
        return jasminCode;
    }
}
