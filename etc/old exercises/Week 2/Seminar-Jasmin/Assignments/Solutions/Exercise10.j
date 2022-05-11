.class public Exercise10
.super java/lang/Object

.field private valueOne I
.field private valueTwo I

;
; standard initializer (calls java.lang.Object's initializer)
;
.method public <init>()V
	.limit stack 2 				

	aload_0
	invokenonvirtual java/lang/Object/<init>()V

	; valueTwo = 99;
	aload_0
	ldc 99
	putfield Exercise10/valueTwo I

	return
.end method

;
; main() method
;
.method public static main([Ljava/lang/String;)V
	.limit stack 2 				
	.limit locals 2

	; Exercise6 e = new Exercise10();
	new Exercise10
	dup
	invokenonvirtual Exercise10/<init>()V
	astore 1

	; e.setValueOne(42);
	aload 1
	ldc 42
	invokevirtual Exercise10/setValueOne(I)V

	; System.out.println(e.getSumOfValues());
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 1
	invokevirtual Exercise10/getSumOfValues()I
	invokevirtual java/io/PrintStream/println(I)V

	return
.end method

;
; setValueOne() method
;
.method public setValueOne(I)V
	.limit stack 2		
	.limit locals 2

	; valueOne = a;
	aload_0
	iload 1
	putfield Exercise10/valueOne I

	return
.end method

;
; getSumOfValues() method
;
.method public getSumOfValues()I
	.limit stack 2	
	.limit locals 1

	; return valueOne + valueTwo;
	aload_0
	getfield Exercise10/valueOne I

	aload_0
	getfield Exercise10/valueTwo I

	iadd
	ireturn
.end method
