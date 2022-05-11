.class public Exercise1
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
	.limit stack 3
	.limit locals 1

	; System.out.println(25 + 15 + 10);
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc 25
	ldc 15
	iadd
	ldc 10
	iadd
	invokevirtual java/io/PrintStream/println(I)V

    return
.end method
