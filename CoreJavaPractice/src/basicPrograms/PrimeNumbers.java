package basicPrograms;

import java.util.Scanner;

public class PrimeNumbers {
	
	  static void primeNumber(int n)
	  
	{
		  int count=0;
		for(int i=2;i<=n-1;i++)
		{
			if (n%i==0)
				count++;
		}
		if (count>0)
			System.out.println("Number is not prime");
		else
			System.out.println("Number is Prime");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if it is Prime or not");
		
		int num=sc.nextInt();
		primeNumber(num);
		sc.close();
	}

}
