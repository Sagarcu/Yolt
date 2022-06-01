.class public Exercise4
.super java/lang/Object

.method public <init>()V
.limit stack 99
.limit locals 99
aload_0
invokenonvirtual java/lang/Object/<init>()V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Hello, this is a simple application that tests some statements and functions."
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method

.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99
new Exercise4
dup
invokenonvirtual Exercise4/<init>()V
astore 0

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Calculating normalizedPressure. It should result in a value smaller then 11000"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
ldc 40
ldc 11000
invokevirtual Exercise4/calculateNormalizedKPA(II)I
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Calculating normalizedPressure. It should result in a value smaller then the previous one"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 0
ldc 60
ldc 11000
invokevirtual Exercise4/calculateNormalizedKPA(II)I
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Divide 212 Gold coins and a few bronze and silver coins between 5 people."
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 0
ldc 617147
ldc 5
invokevirtual Exercise4/divideCoins(II)I
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
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Divide 5000 Gold coins and a few bronze and silver coins between 42 people."
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 0
ldc 14492771
ldc 42
invokevirtual Exercise4/divideCoins(II)I
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
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Divide 212G between only yourself, should result in special message!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 0
ldc 617147
ldc 1
invokevirtual Exercise4/divideCoins(II)I
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
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Divide 50B between 1000 people, should result in special message!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 0
ldc 50
ldc 1000
invokevirtual Exercise4/divideCoins(II)I
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
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Crazy statement should result in: Crazy statement is true."
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
ldc 10
ldc 35
ldc 5
invokevirtual Exercise4/testCrazyStatements(III)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Crazy statement should result in: Crazy statement is true."
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
ldc 20
ldc 24
ldc 10
invokevirtual Exercise4/testCrazyStatements(III)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Crazy statement should result in: Crazy statement is true."
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
ldc 20
ldc 10
ldc 3000
invokevirtual Exercise4/testCrazyStatements(III)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Crazy statement should result in num 1, 2 and 3 are smaller then 5!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
ldc 1
ldc 3
ldc 4
invokevirtual Exercise4/testCrazyStatements(III)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Crazy statement should result in num 1 is smaller then 5!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
ldc 1
ldc 30
ldc 4
invokevirtual Exercise4/testCrazyStatements(III)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Crazy statement should result in: Doesn't apply to anything."
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 0
ldc 30
ldc 10
ldc 50
invokevirtual Exercise4/testCrazyStatements(III)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method

.method public calculateNormalizedKPA(II)I
.limit stack 99
.limit locals 99

iload 2
ldc 293
imul
istore 2
iload 1
ldc 273
iadd
istore 1
iload 2
iload 1
idiv
ireturn
.end method

.method public divideCoins(II)I
.limit stack 99
.limit locals 99

iload 1
ldc 100
if_icmplt true_0
iconst_0
goto endcmp_0
true_0:
iconst_1
endcmp_0:
ifeq else_1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Get more money dummy."
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc 1
istore 2
goto endif_1
else_1:
iload 2
ldc 1
if_icmple true_1
iconst_0
goto endcmp_1
true_1:
iconst_1
endcmp_1:
ifeq else_2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Why are you even dividing with only yourself? Kinda weird"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc 1
istore 2
goto endif_1
else_2:
endif_1:
iload 1
iload 2
idiv
ireturn
.end method

.method public testCrazyStatements(III)V
.limit stack 99
.limit locals 99

iload 1
ldc 5
if_icmpgt true_2
iconst_0
goto endcmp_2
true_2:
iconst_1
endcmp_2:
iload 1
ldc 15
if_icmplt true_3
iconst_0
goto endcmp_3
true_3:
iconst_1
endcmp_3:
ifeq false_4
ifeq false2_4
iconst_1
goto endcmp_4
false_4:
pop
false2_4:
iconst_0
endcmp_4:
iload 2
ldc 15
if_icmpgt true_5
iconst_0
goto endcmp_5
true_5:
iconst_1
endcmp_5:
iload 2
ldc 30
if_icmplt true_6
iconst_0
goto endcmp_6
true_6:
iconst_1
endcmp_6:
ifeq false_7
ifeq false2_7
iconst_1
goto endcmp_7
false_7:
pop
false2_7:
iconst_0
endcmp_7:
iload 2
ldc 25
if_icmplt true_8
iconst_0
goto endcmp_8
true_8:
iconst_1
endcmp_8:
ifeq false_9
ifeq false2_9
iconst_1
goto endcmp_9
false_9:
pop
false2_9:
iconst_0
endcmp_9:
ifeq false_10
pop
iconst_1
goto endcmp_10
false_10:
ifeq false2_10
iconst_1
goto endcmp_10
false2_10:
iconst_0
endcmp_10:
iload 3
ldc 1000
if_icmpgt true_11
iconst_0
goto endcmp_11
true_11:
iconst_1
endcmp_11:
ifeq false_12
pop
iconst_1
goto endcmp_12
false_12:
ifeq false2_12
iconst_1
goto endcmp_12
false2_12:
iconst_0
endcmp_12:
ifeq else_3
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Crazy statement is true!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endif_2
else_3:
iload 1
ldc 5
if_icmplt true_13
iconst_0
goto endcmp_13
true_13:
iconst_1
endcmp_13:
iload 2
ldc 5
if_icmplt true_14
iconst_0
goto endcmp_14
true_14:
iconst_1
endcmp_14:
ifeq false_15
ifeq false2_15
iconst_1
goto endcmp_15
false_15:
pop
false2_15:
iconst_0
endcmp_15:
iload 3
ldc 5
if_icmplt true_16
iconst_0
goto endcmp_16
true_16:
iconst_1
endcmp_16:
ifeq false_17
ifeq false2_17
iconst_1
goto endcmp_17
false_17:
pop
false2_17:
iconst_0
endcmp_17:
ifeq else_4
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Num 1, 2 and 3 are all smaller then 5!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endif_2
else_4:
iload 1
ldc 5
if_icmplt true_18
iconst_0
goto endcmp_18
true_18:
iconst_1
endcmp_18:
ifeq else_5
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Num 1 is smaller then 5!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endif_2
else_5:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Doesn't apply to any of the previous statements"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
endif_2:
return
.end method

