package basicPrograms;

public class MagicNum {

	public static void main(String[] args) {
	//if sum of all digit of number until it becomes single digit is 1 then it is a magic number
//1081=1+0+8+1=10--1+0=1 magic
		//1082=11--1+1=2 not magic
		int num=1082;
		int sum=0;
		int sum1=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		while(sum>0)
		{
			int rem1=sum%10;
			sum1=sum1+rem1;
			sum=sum/10;
		}
		if(sum1==1)
		{
			System.out.println("MAgic");
		}
		else 
			System.out.println("Not MAgic");
		
	}

}
