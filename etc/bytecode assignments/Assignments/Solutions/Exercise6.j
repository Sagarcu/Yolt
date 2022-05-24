.class public Exercise6
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
	.limit stack 2
	.limit locals 3

	; int sum = 0;
	ldc 0
	istore 1
	
	; int i = 0;
	ldc 0
	istore 2
	
	; while (i < 10) {
startloop:		
	iload 2
	ldc 10
	if_icmpge endloop

	;	sum += i;
	iload 1
	iload 2
	iadd
	istore 1

	; 	i++;
	iinc 2 1    ; or iload 2, iconst_1, iadd, istore 2
	goto startloop

	; }
endloop:

	; System.out.println(sum);
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 1
	invokevirtual java/io/PrintStream/println(I)V

    return
.end method
