.class public GuessTheNumber
.super java/lang/Object

; standard initializer (calls java.lang.Object's initializer)
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

; main() method
.method public static main([Ljava/lang/String;)V
	.limit stack 3 													; Determine the size of the stack
	.limit locals 5
	
	; 0 = random
	; 1 = the scanner
	; 2 = the actual random int.
	; 3 = the amount of tries the user did
	; 4 = the current guess
	
	
	;Random random = new Random();
	new java/util/Random
	dup
	invokenonvirtual java/util/Random/<init>()V
	astore 0
	
	; s = new Scanner(System.in)
	new java/util/Scanner
	dup
	getstatic java/lang/System/in Ljava/io/InputStream;
	invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V
	astore 1
	
	;int toGuess = random.nextInt(100);
	aload 0
	ldc 100
	invokevirtual java/util/Random/nextInt(I)I
	istore 2
	
	
	
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Welcome to guess the number! Goodluck!"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	
	ldc 0 
	istore 3 ;Amount of tries user did.

startLoop:
	iinc 3 1
	
	iload 3
	ldc 7
	if_icmpgt lost

	aload 1
	invokevirtual java/util/Scanner/nextInt()I
	istore 4 ; the guess the user did this time.
	
	iload 2
	iload 4
	if_icmpgt lower
	
	iload 2
	iload 4
	if_icmplt higher
	
	goto won
	
lower:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Your guessed number is lower then the secret number."
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	goto startLoop
	
higher:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Your guessed number is higher then the secret number."
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	goto startLoop
	
won:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "You guessed the number. Hooray!"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	return
	
lost:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "You didn't guess the number."
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	
	
	
    return															; End the method
.end method