package basicPrograms;

public class FibonacciRecursion {
	public static void test1(int n1, int n2)
	{
		int n3=n1+n2;;
	
		if(n3<15)
		{
		System.out.print(","+n3);
		n1=n2;
		n2=n3;
		test1(n1,n2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0;int n2=1;
System.out.print(n1 + ","+n2);
test1(n1,n2);

}
}
