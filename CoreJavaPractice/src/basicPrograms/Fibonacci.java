package basicPrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the length of series");
Scanner s1=new Scanner(System.in);
int length= s1.nextInt();
int a=0, b=1;
System.out.print(+a+","+b);
for (int i=1;i<length;i++)
{
	int c=a+b;
	System.out.print(","+c);
	a=b;
	b=c;
	
}
s1.close();
	}
}
