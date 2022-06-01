.class public Exercise2
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99
new Exercise2
dup
invokenonvirtual Exercise2/<init>()V
astore 0

ldc 0
istore 1
loopcheck_1:
iload 1
ldc 100
if_icmplt true_0
iconst_0
goto endcmp_0
true_0:
iconst_1
endcmp_0:
ifeq endloop_1
iload 1
ldc 5
irem
ldc 0
if_icmpeq true_1
iconst_0
goto endcmp_1
true_1:
iconst_1
endcmp_1:
iload 1
ldc 7
irem
ldc 0
if_icmpeq true_2
iconst_0
goto endcmp_2
true_2:
iconst_1
endcmp_2:
ifeq false_3
ifeq false2_3
iconst_1
goto endcmp_3
false_3:
pop
false2_3:
iconst_0
endcmp_3:
ifeq else_1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "FizzBuzz"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endif_1
else_1:
iload 1
ldc 5
irem
ldc 0
if_icmpeq true_4
iconst_0
goto endcmp_4
true_4:
iconst_1
endcmp_4:
ifeq else_2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Fizz"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endif_1
else_2:
iload 1
ldc 7
irem
ldc 0
if_icmpeq true_5
iconst_0
goto endcmp_5
true_5:
iconst_1
endcmp_5:
ifeq else_3
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Buzz"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endif_1
else_3:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
endif_1:
iload 1
ldc 1
iadd
istore 1
goto loopcheck_1
endloop_1:
return
.end method

.method public <init>()V
.limit stack 99
.limit locals 99
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

