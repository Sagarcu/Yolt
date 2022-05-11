.class public FizzBuzz
.super java/lang/Object

; standard initializer (calls java.lang.Object's initializer)
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

; main() method
.method public static main([Ljava/lang/String;)V
	.limit stack 2 													; Determine the size of the stack
	.limit locals 3

	;Fizzbuzz. 
	
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Printing Fizzbuzz: "
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; stack is empty?
	
	ldc 0
	istore 1
	
startLoop:	
	iinc 1 1

	iload 1
	ldc 100
	if_icmpgt endloop
	
	iload 1
	ldc 5
	irem
	ifeq checkBuzz
	
	iload 1 
	ldc 7
	irem
	ifeq printBuzz
	
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 1
	invokevirtual java/io/PrintStream/println(I)V
	
	goto startLoop

checkBuzz:
	iload 1 
	ldc 7
	irem
	ifne printFizz
	
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "FizzBuzz"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	goto startLoop

printFizz:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Fizz"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	goto startLoop
	
printBuzz:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Buzz"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	goto startLoop

endloop:

    return															; End the method
.end method
