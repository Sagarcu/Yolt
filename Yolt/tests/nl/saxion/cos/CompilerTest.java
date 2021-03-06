package nl.saxion.cos;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This file shows a few different ways you can do automated tests:
 *
 *  - checkByteCode():        Shows how to compile a file and check that the bytecode that was
 *                            generated matches your expectations.
 *  - checkByteCode2():       Same as above, but now the output is stored in a file.
 *  - syntaxErrorsAreFound(): Checks that a file with syntax errors stops compilation.
 *  - checkOutputFile():      This test shows how to compile a file, run it and check if the output
 *                            matches your expectations.
 *  - checkOutputString():    Same as above, but now the source code is coming from a string within
 *                            the test.
 *
 * Not shown is a test where the file contains no syntax errors, but the checker should find some
 * error. You can of course add that yourself.
 */
class CompilerTest extends TestBase {


	@Test
	void checkByteCode() throws Exception {
		Compiler c = new Compiler();
		JasminBytecode code = c.compileFile("testFiles/Exercise1.exlang", "Exercise1");
		assertNotNull(code);

		// Check that the bytecode matches what we expect
		assertArrayEquals(new String[] {
				".class public Exercise1",
				".super java/lang/Object",

				"new Exercise1",
				"dup",
				"invokenonvirtual Exercise1/<init>()V",
				"astore 0",

				"ldc 0",
				"istore 1",
				"ldc 1",
				"istore 2",
				"ldc 0",
				"istore 3",
				"getstatic java/lang/System/out Ljava/io/PrintStream;",
				"iload 1",
				"invokevirtual java/io/PrintStream/println(I)V",
				"getstatic java/lang/System/out Ljava/io/PrintStream;",
				"iload 2",
				"invokevirtual java/io/PrintStream/println(I)V",
				"loopcheck_1:",
				"iload 3",
				"ldc 100",
				"if_icmplt true_0",
				"iconst_0",
				"goto endcmp_0",
				"true_0:",
				"iconst_1",
				"endcmp_0:",
				"ifeq endloop_1",
				"iload 1",
				"iload 2",
				"iadd",
				"istore 3",
				"iload 2",
				"istore 1",
				"iload 3",
				"istore 2",
				"getstatic java/lang/System/out Ljava/io/PrintStream;",
				"iload 3",
				"invokevirtual java/io/PrintStream/println(I)V",
				"goto loopcheck_1",
				"endloop_1:",
				"getstatic java/lang/System/out Ljava/io/PrintStream;",
				"ldc 'DONE'",
				"invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V",
				"return",
				".end method",

				".method public <init>()V",
				".limit stack 99",
				".limit locals 99",
				"aload_0",
				"invokenonvirtual java/lang/Object/<init>()V",
				"return",
				".end method"
		}, code.getLines().toArray());
	}

	@Test
	void checkByteCode2() throws Exception {
		// Compile the file testFiles/hello.exlang
		Compiler c = new Compiler();
		JasminBytecode code = c.compileFile("testFiles/hello.exlang", "HelloWorld");
		assertNotNull(code);

		// Check that the bytecode matches what we expect
		List<String> expectedOutput = Files.readAllLines(Paths.get("testFiles/hello.expected_j"));
		assertArrayEquals(expectedOutput.toArray(), code.getLines().toArray());
	}

	@Test
	void syntaxErrorsAreFound() throws Exception {
		// Try to compile a file with syntax errors. The compiler should detect this and should
		// return null.
		Compiler c = new Compiler();
		JasminBytecode code = c.compileString("dfsgkjs;", "HelloWorld");
		assertNull(code);
	}

	@Test
	void checkOutputFile() throws Exception {
		// Compile and assemble testFiles/hello.exlang
		Compiler c = new Compiler();
		JasminBytecode code = c.compileFile("testFiles/hello.exlang", "HelloWorld");
		assertNotNull(code);

		// Check that output matches what we expect
		List<String> output = runCode(code);
		assertArrayEquals(new String[] {
				"Hello from ExampleLang!"
		}, output.toArray());
	}

	@Test
	void checkOutputString() throws Exception {
		// Compile and assemble the string 'hello; hi;'
		Compiler c = new Compiler();
		JasminBytecode code = c.compileString("hello; hi;", "HelloWorld");
		assertNotNull(code);

		// Check that output matches what we expect
		List<String> output = runCode(code);
		assertArrayEquals(new String[] {
				"Hello from ExampleLang!"
		}, output.toArray());
	}
}
