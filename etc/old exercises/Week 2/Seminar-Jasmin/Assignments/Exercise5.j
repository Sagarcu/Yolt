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

	ldc 12
	istore 1
	
	ldc 4
	istore 2
	
	
	iload 1
	ldc 10
	if_icmpgt bigger
	goto secondcheck
	
bigger: 
    getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Input1 is large!"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto endif
	
secondcheck:
  iload 2
  ldc 5
  if_icmplt smaller
  goto endif
  
smaller:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Input2 is small!"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

endif:

    return
.end method
