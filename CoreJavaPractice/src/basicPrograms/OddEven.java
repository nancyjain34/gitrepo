package basicPrograms;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the number to check if odd or even");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Number is Even");
		}
		else
			System.out.println("Number is ODD");
		sc.close();
	}

}
