.class public Exercise4
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

	; boolean b = (input % 2 == 0);   // Is value even?
	iload 1
	ldc 2
	irem
	ifeq even      ; If remainder equal to zero, jump to even
	iconst_0       ;   otherwise, push false (ldc 0 is ok too)
	goto endcmp
even:
	iconst_1       ; Push true (ldc 1 is an option too)
endcmp:
	istore 2       ; store the boolean

	; if (b) {
	iload 2
	ifeq else

	;	System.out.println("Value is even!");
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Value is even!"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	goto endif

	; } else {
else:
	; 	System.out.println("Value is odd!");
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Value is odd!"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	; }
endif:

    return
.end method
