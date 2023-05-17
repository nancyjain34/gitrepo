package practice;


public class practicePrograms {
	public static void main(String[] args) {
		//sort by value map
String str=null;
int a=10,b=0;
try
{
System.out.println(str.length());
System.out.println(a/b);
System.out.println("try block continues");
}

catch(NullPointerException n)
{
	System.out.println(n+" "+"String is null");
}
catch(ArithmeticException arithematic)
{
	System.out.println(arithematic+" "+"Divide by 0");
}
catch(ArrayIndexOutOfBoundsException i)
{
	System.out.println(i+" "+"Array index out of bound");
}
catch(Exception e)
{
	System.out.println("Parent exception caught");
}

finally
{
	System.out.println("Finally always executes");
}
System.out.println("Program continues");
}
}	
	
