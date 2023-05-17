package basicPrograms;


public class MissingArrayNum {
	public static void method()
	{
		int a[]= {2,4,1,5,6};
		int n=a.length;
		int sum=((n+1)*(n+2))/2;
		for(int i=0;i<n;i++)
		{
			sum-=a[i];
		}
			System.out.println("Missing num is "+sum);
	}
	public static void main(String[] args) {
		method();
}
}
