package basicPrograms;


import java.util.Scanner;

public class reverseString {
	
	public static void reverseMethod(String name)
	{

		
		int len=name.length();
		char arr[]=name.toCharArray();
		for (int i =len-1;i>=0;i--)
		{
		
			char revString=arr[i];
			System.out.print(revString);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string to reverse");
		Scanner sc=new Scanner(System.in);
		String str=	sc.nextLine();
		reverseMethod(str);
		sc.close();
	}

}


//-----for nancy jain reversal in same position----

//String str1[]=name.split(" ");
//char arr1[]=str1[0].toCharArray();
//char arr2[]=str1[1].toCharArray();
//int len1=str1[0].length();
//int len2=str1[1].length();
//for (int i =len1-1;i>=0;i--)
//{
//	char rev=arr1[i];
//	System.out.println((rev));
//}
//for (int i =len2-1;i>=0;i--)
//{
//	char rev=arr2[i];
//	System.out.println(rev);
//}
