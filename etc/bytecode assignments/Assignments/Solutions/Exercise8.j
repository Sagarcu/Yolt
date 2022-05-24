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

	; int a = 10;
	ldc 10
	istore 1
		
	; double b = ((a + 5.0d) * a - 2.0d) / 3.0d;
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

	; boolean c = true;
	iconst_1
	istore 4       ; N.B. double b starting at 2 takes up two places
		
	; System.out.println(a);
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 1
	invokevirtual java/io/PrintStream/println(I)V

	; System.out.println(b);
	getstatic java/lang/System/out Ljava/io/PrintStream;
	dload 2
	invokevirtual java/io/PrintStream/println(D)V

	; System.out.println(c);
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 4
	invokevirtual java/io/PrintStream/println(Z)V

    return
.end method
