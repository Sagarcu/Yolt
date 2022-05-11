.class public Exercise3
.super java/lang/Object

;
; standard initializer (calls java.lang.Object's initializer)
;
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

;
; main() method
;
.method public static main([Ljava/lang/String;)V
	.limit stack 4
	.limit locals 4

	ldc 5
	istore 1
	
	ldc 6
	istore 2
	
	ldc 25
	iload 1
	iload 2
	imul
	isub 
	ldc 15
	iadd
    istore 3
	
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 3
    invokevirtual java/io/PrintStream/println(I)V

    return
.end method
