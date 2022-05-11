.class public Fibonacci
.super java/lang/Object

; standard initializer (calls java.lang.Object's initializer)
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

; main() method
.method public static main([Ljava/lang/String;)V
	.limit stack 10 													; Determine the size of the stack
	.limit locals 20

	;Fibonacci
	
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Printing Fibonacci: "
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	
	ldc 0
	istore 1
	
	ldc 1
	istore 2
	
	ldc 0
	istore 3
	
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 2
	invokevirtual java/io/PrintStream/println(I)V
	
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 1
	invokevirtual java/io/PrintStream/println(I)V
	
	
startLoop:
	
	iload 3
	ldc 100
	if_icmpgt endloop

	iload 1
	iload 2
	iadd
	istore 3
	iload 2
	istore 1
	iload 3
	istore 2
	
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 3
	invokevirtual java/io/PrintStream/println(I)V
	
	goto startLoop


endloop:

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Done!"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    return															; End the method
.end method
