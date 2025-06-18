class Pattern
{
public static void main(String args[])
{
int i,j;
/*Pattern1*

for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print("*");
}
System.out.println("");
}
}
}
*Pattern2*

for(i=1;i<6;i++)
{
for(j=1;j<5;j++)
{
System.out.print(i+" ");
}
System.out.println(" ");
}
}
}
*Pattern 3*

for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(j+" ");
}
System.out.println(" ");
}
}
}
*Pattern 4*
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n++;
}
System.out.println(" ");
}
}
}
*Pattern 5*
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n++;
if(n>9)
{
n=1;
}
}
System.out.println(" ");
}
}
}
*Pattern  6*
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n=n+2;

}
System.out.println(" ");
}
}
}
*Pattern 7*
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(i);
n--;
if(n!=0)
{
n=1;
}
}
System.out.println(" ");
}
}
}
*Pattern 8*
for(i=0;i<6;i++)
{
for(j=0;j<i;j++)
{
System.out.print("*");
}
System.out.println("");
}
}
*Pattern 19*
for(i=0;i<6;i++)
{
for(j=0;j<i;j++)
{
System.out.print("*");
}
System.out.println(i);
}
}
}
*Pattern 8*
int k;
for(i=1;i<=5;i++)
{
for(j=1;j<=4;j++)
{
System.out.println(" ");
{
for(k=0;k<=(2*i-1);k++)
{
System.out.print("* ");
}
System.out.println();
}
}
}
}
}
*Pattern 15*
int n=7;
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(i==n/2+1||j==n/2+4)
System.out.print("* ");
else
System.out.print(" ");
}
System.out.println(" ");
}
}
}
*Pattern 10*
String word="INDIA";
for(i=1;i<=word.length();i++)
{
System.out.println(word.substring(0,i));
}
}
}


for(i=0;i<=5;i++)
{
for(j=0;j<=5;j++)
{
if(j<6-i)
{
System.out.print(" ");
}
else
{
System.out.print(" * ");
}
}
System.out.println();
}
}
}
Output:
       *
     *  *
    *  *  *
   *  *  *  *
  *  *  *  *  *     */

