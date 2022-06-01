.class public Exercise3
.super java/lang/Object

.field private prizeMoney I
.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99
new Exercise3
dup
invokenonvirtual Exercise3/<init>()V
astore 0

iconst_0
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "HELLO, WELCOME TO GUESS THE NUMBER!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc 0
istore 2
new java/util/Random
dup
invokenonvirtual java/util/Random/<init>()V
ldc 100
invokevirtual java/util/Random/nextInt(I)I
istore 3
loopcheck_1:
iload 2
ldc 7
if_icmplt true_0
iconst_0
goto endcmp_0
true_0:
iconst_1
endcmp_0:
ifeq endloop_1
iload 2
ldc 1
iadd
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "IF YOU GUESS IT CORRECT THIS TURN YOU WILL GET "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload_0
getfield Exercise3/prizeMoney I
istore 98
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
iload 98
ldc 2898
idiv
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
ldc "G_"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
iload 98
ldc 2898
irem
ldc 69
idiv
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
ldc "S_"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
iload 98
ldc 69
irem
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
ldc "B"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
ldc 0
istore 98
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc "! "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V
invokevirtual java/util/Scanner/nextInt()I
istore 4
iload 4
iload 3
if_icmpgt true_1
iconst_0
goto endcmp_1
true_1:
iconst_1
endcmp_1:
ifeq else_1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "YOUR GUESS IS TOO HIGH!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endif_1
else_1:
iload 4
iload 3
if_icmplt true_2
iconst_0
goto endcmp_2
true_2:
iconst_1
endcmp_2:
ifeq else_2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "YOUR GUESS IS TOO LOW!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endif_1
else_2:
getstatic java/lang/System/out Ljava/io/PrintStream;
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "You guessed the number in "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
iload 2
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " tries! Well done! "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "You won "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload_0
getfield Exercise3/prizeMoney I
istore 98
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
iload 98
ldc 2898
idiv
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
ldc "G_"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
iload 98
ldc 2898
irem
ldc 69
idiv
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
ldc "S_"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
iload 98
ldc 69
irem
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
ldc "B"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
ldc 0
istore 98
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iconst_1
istore 1
goto endloop_1
endif_1:
aload_0
aload_0
getfield Exercise3/prizeMoney I
ldc 2
idiv
putfield Exercise3/prizeMoney I
goto loopcheck_1
endloop_1:
iload 1
iconst_1
if_icmpne true_3
iconst_0
goto endcmp_3
true_3:
iconst_1
endcmp_3:
ifeq else_3
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "You have failed guess the number, better luck next time!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endif_2
else_3:
endif_2:
return
.end method

.method public <init>()V
.limit stack 99
.limit locals 99
aload_0
invokenonvirtual java/lang/Object/<init>()V
aload_0
ldc 345000
putfield Exercise3/prizeMoney I
return
.end method

