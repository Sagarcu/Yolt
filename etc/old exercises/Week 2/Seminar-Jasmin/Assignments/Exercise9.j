.class public Exercise9
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
; main() methode
;
.method public static main([Ljava/lang/String;)V
	.limit stack 4
	.limit locals 3

    getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Enter your name: "
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    new java/util/Scanner
	dup
	getstatic java/lang/System/in Ljava/io/InputStream;
	invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V
	astore 1
	
	aload 1
	invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;
	astore 2

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Hello, "
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 2
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V



    return
.end method
