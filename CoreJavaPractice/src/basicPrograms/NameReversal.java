package basicPrograms;

public class NameReversal {
	
	public static void method1(String str)
	{
		String arr[]=str.split(" ");
		String firstname=arr[0];
		String lastname=arr[1];
		System.out.println("Before Reverse: "+firstname+" "+lastname);
		char arr1[]=firstname.toCharArray();
		char arr2[]=lastname.toCharArray();
		int len1=arr1.length;
		int len2=arr2.length;
		System.out.print("After Reverse: ");
		for(int i=len1-1;i>=0;i--)
		{
			System.out.print(arr1[i]);
		}
		System.out.print(" ");
		for(int j=len2-1;j>=0;j--)
		{
			System.out.print(arr2[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str=new String("Udit Taran");
	method1(str);
	}
	
	
	//OR
//	String name="Udit Taran";
//	String rev="";
//	String firstname=name.split(" ")[0];
//	String lastname=name.split(" ")[1];
//	for(int i=firstname.length()-1;i>=0;i--)
//	{
//		rev=rev+firstname.charAt(i);
//	}
//	rev=rev+" ";
//	for(int i=lastname.length()-1;i>=0;i--)
//	{
//		rev=rev+lastname.charAt(i);
//	}
//		System.out.println(rev);
//		}
//
//	}
}
