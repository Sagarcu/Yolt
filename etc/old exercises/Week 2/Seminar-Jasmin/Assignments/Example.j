.class public Example
.super java/lang/Object

; standard initializer (calls java.lang.Object's initializer)
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

; main() method
.method public static main([Ljava/lang/String;)V
	.limit stack 2 													; Determine the size of the stack

    getstatic java/lang/System/out Ljava/io/PrintStream; 			; Put System.out on the stack
    ldc "Hello World!"												; Push a string onto the stack
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V	; Call the method PrintStream.println()

    return															; End the method
.end method
