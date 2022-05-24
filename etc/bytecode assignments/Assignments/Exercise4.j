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

	ldc 12
	istore 1

	iload 1
	ldc 2
	irem
	ifeq even      ; If remainder equal to zero, jump to even
	ldc 0
	goto endcmp
even:
	ldc 1
endcmp:
	istore 2       ; store the boolean

	iload 2
	ifeq else
	
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Value is even!"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	goto endif

else:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Value is odd!"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	; }
endif:


    return
.end method
