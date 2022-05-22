package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;



public class YoltCodeGenerator extends YoltBaseVisitor< Void > {

    private ArrayList<String> jasminCode = new ArrayList<>();
    @Override
    public Void visitApplication(YoltParser.ApplicationContext ctx) {
        //Our code has either one class and / or multiple functions. We visit those here.

        if (ctx.class_declaration() != null) visit(ctx.class_declaration()); //Check our Classes

        for(int i = 0; i < ctx.function_declaration().size(); i++) //Check our functions.
        {
            visit(ctx.function_declaration(i));
        }

        return null;
    }



    @Override
    public Void visitClass_declaration(YoltParser.Class_declarationContext ctx) {
        jasminCode.add(".method public static "+ ctx.IDENTIFIER() +"([Ljava/lang/String;)V");
        jasminCode.add(".limit stack 99");
        jasminCode.add(".limit locals 99");
        jasminCode.add("");

        for(int i = 0; i < ctx.function_declaration().size(); i++)
        {
            visit(ctx.function_declaration(i));
        }

        //VISIT ALL THE FUNCTIONS INSIDE OF THIS THING!
        jasminCode.add(".end method");
        return null;
    }

    @Override
    public Void visitFunction_declaration(YoltParser.Function_declarationContext ctx) {
        //TODO Change main to function declaration name.
        jasminCode.add("ldc 10");
        //VISIT ALL THE CHILDREN.

        return null;
    }

    public ArrayList<String> getJasminCode() {
        return jasminCode;
    }
}
