.class public Exercise2
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
	.limit locals 1


	; System.out.println(25 - 5 * 6 + 15);
    getstatic java/lang/System/out Ljava/io/PrintStream; 			; Put System.out on the stack
	ldc 25
	ldc 5
	ldc 6
	imul
	isub
	ldc 15
	iadd
    invokevirtual java/io/PrintStream/println(I)V
	
    return
.end method
