.class public Exercise1
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99
new Exercise1
dup
invokenonvirtual Exercise1/<init>()V
astore 0

ldc 0
istore 1
ldc 1
istore 2
ldc 0
istore 3
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/println(I)V
loopcheck_1:
iload 3
ldc 100
if_icmplt true_0
iconst_0
goto endcmp_0
true_0:
iconst_1
endcmp_0:
ifeq endloop_1
iload 1
iload 2
iadd
istore 3
iload 2
istore 1
iload 3
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 3
invokevirtual java/io/PrintStream/println(I)V
goto loopcheck_1
endloop_1:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "DONE"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method

.method public <init>()V
.limit stack 99
.limit locals 99
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

