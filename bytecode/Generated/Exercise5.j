.class public Exercise5
.super java/lang/Object

.field private availableSpots I
.field private earnedMoney I
.field private totalAmountOfVisits I
.field private skippedGuests I
.method public <init>()V
.limit stack 99
.limit locals 99
aload_0
invokenonvirtual java/lang/Object/<init>()V
aload_0
ldc 0
putfield Exercise5/availableSpots I
aload_0
ldc 0
putfield Exercise5/earnedMoney I
aload_0
ldc 1000
putfield Exercise5/totalAmountOfVisits I
aload_0
ldc 0
putfield Exercise5/skippedGuests I
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "WELCOME TO YOUR HOTEL SIMULATOR. PLEASE TELL ME HOW MANY ROOMS YOU HAVE"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload_0
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V
invokevirtual java/util/Scanner/nextInt()I
putfield Exercise5/availableSpots I
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "HOW MANY GUESTS DO YOU WANT TO COME?"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload_0
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V
invokevirtual java/util/Scanner/nextInt()I
putfield Exercise5/totalAmountOfVisits I
return
.end method

.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99
new Exercise5
dup
invokenonvirtual Exercise5/<init>()V
astore 0

loopcheck_1:
aload_0
getfield Exercise5/totalAmountOfVisits I
ldc 0
if_icmpgt true_0
iconst_0
goto endcmp_0
true_0:
iconst_1
endcmp_0:
ifeq endloop_1
aload 0
ldc 2
invokevirtual Exercise5/randomBehaviour(I)V
aload 0
ldc 4
invokevirtual Exercise5/randomBehaviour(I)V
aload 0
new java/util/Random
dup
invokenonvirtual java/util/Random/<init>()V
ldc 20
invokevirtual java/util/Random/nextInt(I)I
invokevirtual Exercise5/randomBehaviour(I)V
new java/util/Random
dup
invokenonvirtual java/util/Random/<init>()V
ldc 10
invokevirtual java/util/Random/nextInt(I)I
istore 1
loopcheck_2:
iload 1
ldc 0
if_icmpne true_1
iconst_0
goto endcmp_1
true_1:
iconst_1
endcmp_1:
ifeq endloop_2
aload_0
aload_0
getfield Exercise5/earnedMoney I
ldc 5
isub
putfield Exercise5/earnedMoney I
iload 1
ldc 1
isub
istore 1
goto loopcheck_2
endloop_2:
aload_0
aload_0
getfield Exercise5/totalAmountOfVisits I
ldc 1
isub
putfield Exercise5/totalAmountOfVisits I
getstatic java/lang/System/out Ljava/io/PrintStream;
aload_0
getfield Exercise5/totalAmountOfVisits I
invokevirtual java/io/PrintStream/println(I)V
goto loopcheck_1
endloop_1:
getstatic java/lang/System/out Ljava/io/PrintStream;
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "Rooms left in your hotel "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload_0
getfield Exercise5/availableSpots I
invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "ALL your guests have visited"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload_0
aload 0
aload_0
getfield Exercise5/earnedMoney I
ldc 2
ldc 6597
ldc "Cooks"
invokevirtual Exercise5/removeWages(IIILjava/lang/String;)I
putfield Exercise5/earnedMoney I
aload_0
aload 0
aload_0
getfield Exercise5/earnedMoney I
ldc 4
ldc 1500
ldc "Maids"
invokevirtual Exercise5/removeWages(IIILjava/lang/String;)I
putfield Exercise5/earnedMoney I
getstatic java/lang/System/out Ljava/io/PrintStream;
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "Your hotel earned "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload_0
getfield Exercise5/earnedMoney I
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
ldc " amount of money!"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload_0
getfield Exercise5/earnedMoney I
ldc 0
if_icmpgt true_2
iconst_0
goto endcmp_2
true_2:
iconst_1
endcmp_2:
ifeq else_1
getstatic java/lang/System/out Ljava/io/PrintStream;
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "ME GET TO KEEP "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload_0
getfield Exercise5/earnedMoney I
ldc 2
idiv
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
ldc " OF THIS! JAIH!"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endif_1
else_1:
getstatic java/lang/System/out Ljava/io/PrintStream;
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "WE MADE A LOSS.... IS SECRET! BUT WE LOST "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload_0
getfield Exercise5/earnedMoney I
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
endif_1:
return
.end method

.method public randomBehaviour(I)V
.limit stack 99
.limit locals 99

new java/util/Random
dup
invokenonvirtual java/util/Random/<init>()V
ldc 10
invokevirtual java/util/Random/nextInt(I)I
ldc 7
if_icmpge true_3
iconst_0
goto endcmp_3
true_3:
iconst_1
endcmp_3:
ifeq else_2
aload_0
getfield Exercise5/availableSpots I
iload 1
isub
ldc 0
if_icmpge true_4
iconst_0
goto endcmp_4
true_4:
iconst_1
endcmp_4:
ifeq else_3
aload_0
aload_0
getfield Exercise5/availableSpots I
iload 1
isub
putfield Exercise5/availableSpots I
aload_0
aload_0
getfield Exercise5/earnedMoney I
ldc 178
iload 1
imul
iadd
putfield Exercise5/earnedMoney I
goto endif_3
else_3:
aload_0
aload_0
getfield Exercise5/skippedGuests I
iload 1
iadd
putfield Exercise5/skippedGuests I
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "The hotel is full, you are losing money!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
endif_3:
goto endif_2
else_2:
aload_0
aload_0
getfield Exercise5/availableSpots I
ldc 2
iadd
putfield Exercise5/availableSpots I
endif_2:
return
.end method

.method public removeWages(IIILjava/lang/String;)I
.limit stack 99
.limit locals 99

iload 3
iload 2
imul
istore 5
getstatic java/lang/System/out Ljava/io/PrintStream;
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "Your "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload 4
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " costed you in total "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
iload 5
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
ldc "!"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iload 1
iload 5
isub
ireturn
.end method

