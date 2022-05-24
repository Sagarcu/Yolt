.class public Exercise8
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
	.limit locals 5   ; The double takes two places

	ldc 10
	istore 1
	
	iload 1
	i2d
	ldc2_w 5.0
	dadd
	
	iload 1
	i2d
	dmul
	
	ldc2_w 2.0
	dsub
	
	ldc2_w 3.0
	ddiv
	dstore 2
	

	iconst_1
	istore 4


	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 1
	invokevirtual java/io/PrintStream/println(I)V

	getstatic java/lang/System/out Ljava/io/PrintStream;
	dload 2
	invokevirtual java/io/PrintStream/println(D)V

	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 4
	invokevirtual java/io/PrintStream/println(Z)V

    return
.end method
