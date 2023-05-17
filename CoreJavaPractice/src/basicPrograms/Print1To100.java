package basicPrograms;

public class Print1To100 {
	


	public static void method1(int n1)
	{
		
		
		if (n1<= 100) {
			System.out.println(n1);
			method1(n1+1);
		}
		
	}
	
	public static void main(String[] args) {
	
		int n=1;
		method1(n);
}


}

