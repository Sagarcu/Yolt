.class public Exercise5
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

	; int input = 12;
	ldc 12
	istore 1

	; int input2 = 4;
	ldc 4
	istore 2

	; if (input > 10) {
	iload 1
	ldc 10
	if_icmple elseif

	; 	 System.out.println("Input1 is large!");
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Input1 is large!"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	goto endif

elseif:
	; else if (input2 < 5) {
	iload 2
	ldc 5
	if_icmpge endif

	;    System.out.println("Input2 is small!");
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Input2 is small!"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

endif:

    return
.end method
