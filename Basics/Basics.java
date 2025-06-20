/*class Basics
{
	public void name()
	{
	   System.out.println("B.Pavani");
	}
	public static void main(String[] args)
	{
	 Basics b=new Basics();
         b.name();
	}
}
output:B.Pavani*/


/*class Basics{
public static void main(String[] args){
System.out.println("B.Pavani");
 }
}
output:B.Pavani*/


/*class Basics
{
	/**void sign()
	{
	   System.out.println("B.Pavani");
	}*/
	/*public static void main(String[] args)
	{
	   /* Basics b=new Basics();
                    b.sign();*/
	 //System.out.println("Pavani");
                    /*System.out.println("ECE");
	}
}
output:ECE*/

/*class Basics
{
public static void main(String[] args)
{
int a=27;
boolean b=true;
char c='G';
float d=3.14f;   
double e=99.89;
System.out.println("Integer value:"+a);
System.out.println("Boolean value:"+b);
System.out.println("Character value:"+c);
System.out.println("Float value:"+d);
System.out.println("Double value:"+e);
}
}
output:Integer value:27
Boolean value:true
Character value:G
Float value:3.14
Double value:99.89
*/

public class Basics 
{
int x = 10;
public void local() {
int x = 20;
System.out.println("Local variable : " + x);   
}
public static void main(String[] args) 
    {
     Basics b = new Basics();
     b.local();
    System.out.println("Global Variable: "+b.x);
    }
}
/*output*/


/*class Basics{
public void name(){
System.out.println("B.Pavani");
}
public static void main(String[] args){
Basics b=new Basics();
b.name();
}
}*/