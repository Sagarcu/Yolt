package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;


@SuppressWarnings("DuplicatedCode")
public class YoltCodeGenerator extends YoltBaseVisitor< Void > {

    private HashMap<String, String> variables = new HashMap<String, String>();
    private int loopnr = 0;
    private int endloop = 0;

    private int statementnr = 0;
    private int boolnr = 0;

    private int endif = 0;
    private int elseif = 0;

    //Put variables in like a hashmap or something? number corresponding to name of variable.

    private ArrayList<String> jasminCode = new ArrayList<>();
    @Override
    public Void visitApplication(YoltParser.ApplicationContext ctx) {
        //Our code has either one class and / or multiple functions. We visit those here.

        if (ctx.class_declaration() != null) visit(ctx.class_declaration()); //Check our Classes
        else
        {
            jasminCode.add(".class public undefined");
            jasminCode.add(".super java/lang/Object");
            jasminCode.add("");
        }

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

        System.out.println(ctx.function_declaration());

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

        for(int i = 0; i < ctx.compare_values().size(); i++)
        {
            visit(ctx.compare_values(i));
        }

        if(ctx.LOGIC_AND() != null) //TODO FIX THIS!
        {
            //We have to find out how many numbers we actually have to compare. somehow. Let's check antlr preview with a statement like this to do this!
            //Check both sides. If they are both equal then return 1, else return 0.
        }
        if (ctx.LOGIC_OR() != null) //TODO FIX THIS!
        {
            //Do stuff for checking or.
        }

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
        return super.visitPrint_stmt(ctx);
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
