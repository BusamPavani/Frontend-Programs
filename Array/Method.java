/*class Method
{
static int p=2;
static int q=8;
int r=4;
int s=3;
static{
System.out.println("Static block");
}
static{
System.out.println("Static block");
}
{
System.out.println("instance block");
}
{
System.out.println("instance block");
}

static void a()
{
int q=2;
System.out.println(p+q);
}

static void s()
{
int p=3;
System.out.println(p-q);
}
void m()
{
int s=4;
System.out.println(r*s);
}
void g()
{
int r=8;
System.out.println(r/s);
}
public static void main(String args[])
{
Method m=new Method();
m.a();
m.s();
m.m();
m.g();
}
}
output:Static block
Static block
instance block
instance block
4
-5
16
2*/
class Instance
{
int a=10;
int b=20;
static void p()
{
Instance obj=new Instance();
System.out.println(obj.a);
System.out.println(obj.b);
}
public static void main(String args[])
{
System.out.println("HII");
Instance obj=new Instance();
obj.p();
}
}
}

