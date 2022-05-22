package nl.saxion.cos;

import java.util.ArrayList;

/**
 * Code generator.
 * Visits each node in the tree of an expression a generates the code needed to
 * evaluate that expression.
 *
 * TODO: Expand this, so that it actually calculates the correct value.
 */
public class CodeGenerator extends CalcBaseVisitor< Void > {
	private ArrayList<String> jasminCode = new ArrayList<>();
	private int numTernary = 0;

	public ArrayList<String> getJasminCode() {
		return jasminCode;
	}

    @Override
	public Void visitStart( CalcParser.StartContext ctx ) {
	    // Main method
	    jasminCode.add(".method public static main([Ljava/lang/String;)V");
	    jasminCode.add(".limit stack 99");
	    jasminCode.add(".limit locals 99");
	    jasminCode.add("");

		jasminCode.add("getstatic java/lang/System/out Ljava/io/Printstream;");
		visit(ctx.expression());
		jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");

	    jasminCode.add("return");
	    jasminCode.add(".end method");

		return null;
    }

	@Override
	public Void visitExIntLiteral(CalcParser.ExIntLiteralContext ctx) {
		jasminCode.add("LDC " + ctx.getText());
		return null;
	}

	@Override
	public Void visitExNegate(CalcParser.ExNegateContext ctx) {
		visit(ctx.expression());
		jasminCode.add("ineg");
		return null;
	}

	@Override
	public Void visitExMulOp(CalcParser.ExMulOpContext ctx) {
		visit(ctx.left);
		visit(ctx.right);
		jasminCode.add("imul");
		return null;
	}

	@Override
	public Void visitExAddOp(CalcParser.ExAddOpContext ctx) {
		visit(ctx.left);
		visit(ctx.right);
		jasminCode.add("iadd");
		return null;
	}

	@Override
	public Void visitExParentheses(CalcParser.ExParenthesesContext ctx) {
		visit(ctx.expression());
		return null;
	}

	@Override
	public Void visitExTernary(CalcParser.ExTernaryContext ctx) {
		visit(ctx.left);
		visit(ctx.right);
		numTernary++;

		String trueLabel = ("ternary" + numTernary);
		String endLabel = ("ternaryEnd" + numTernary);
		switch( ctx.op.getText() ) {
			case ">":   jasminCode.add("if_icmpgt " + trueLabel);  break;
			case ">=":  jasminCode.add("if_icmpge " + trueLabel);  break;
			case "<":   jasminCode.add("if_icmplt " + trueLabel);  break;
			case "<=":  jasminCode.add("if_icmple " + trueLabel);  break;
			case "==":  jasminCode.add("if_icmpeq " + trueLabel);  break;
			case "!=":  jasminCode.add("if_icmpne " + trueLabel);  break;
			default:    break;
		}

		visit(ctx.falseVal);
		jasminCode.add("goto " + endLabel);
		jasminCode.add(trueLabel + ":");
		visit(ctx.trueVal);
		jasminCode.add(endLabel + ":");

		return null;
	}
}
