.class public main
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
	.limit stack 99
	.limit locals 99

	ldc 0
	istore 1
	
	ldc 0 
	istore 2
	goto loopcheck

loopcheck:
	iload 2
	ldc 10
	if_icmpge end
	
iteration:
	iload 1
	iload 2
	iadd
	istore 1
	
	iload 2
	ldc 1
	iadd
	istore 2
	goto loopcheck
	
end:
    getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 1
	invokevirtual java/io/PrintStream/println(I)V


    return
.end method

