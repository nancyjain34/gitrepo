package basicPrograms;

import java.util.Scanner;

public class palindrome {
	
	public static void palindromeMethod(Long n)
	{
		long rem=0; long sum=0;
		long temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if (sum==temp)
			System.out.println("Entered number is a Palindrome");
		else
			System.out.println("entered number is not a Palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if it is Palindrome or not");
		
		long num=sc.nextLong();
		palindromeMethod(num);
		sc.close();		
	}

}
