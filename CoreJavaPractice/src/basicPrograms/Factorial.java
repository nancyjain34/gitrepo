package basicPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		System.out.println("Enter a number to find its factorial");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++)
		{
			
			fact=fact*i;
		}
System.out.println("Factorial of entered num is:"+fact);
sc.close();
	}
}
