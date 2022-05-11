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

	ldc 0
	istore 1
	
	ldc 0 
	istore 2
	goto loopcheck

loopcheck:
	iload 2
	ldc 10
	if_icmplt iteration
	goto end
	
iteration:
	iload 1
	iload 2
	iadd
	istore 1
	
	iload 2
	ldc 1
	iadd
	istore 2
	goto check
	
end:
    getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 1
	invokevirtual java/io/PrintStream/println(I)V


    return
.end method
