package basicPrograms;


public  class StringCount {
	
public static void main(String[] args) {
		String name="nancy";
		int count=0;
		char arr[]=name.toCharArray();
		for (int i=0;i<arr.length;i++)
		{
			count++;
		}
		System.out.println("Count of char is " + count);
		//using inbuilt
System.out.println("Count is "+ name.length());
}
}

