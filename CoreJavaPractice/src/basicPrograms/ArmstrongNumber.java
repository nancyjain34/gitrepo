package basicPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
//When sum of cube of all the digit of a number is equal to number itself then it is called Armstrong number
//same as palindrome
	int num=371;
	int n=num;int rem;
	int sum=0;
	
	while(n>0)
	{
		rem=n%10;
		sum=(int) (sum+Math.pow(rem, 3));
		n=n/10;
	}
	System.out.println(sum);
	if(sum==num)
		System.out.println("armstrong");
	else
		System.out.println("not");
	}

}
