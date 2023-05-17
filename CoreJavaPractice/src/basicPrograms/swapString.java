package basicPrograms;

public class swapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		String a="Hello";
//		String b="World";
//		String c="";
//		c=b;
//		b=a;
//		a=c;
//		System.out.println(a + " " + b);		
		
		
String str1="Hello";
String str2="World";

String str3="";
for(int i=0;i<str2.length();i++)
{
	str3=str3+str2.charAt(i);
}
	str2=str1;
	str1=str3;
	System.out.println(str1);
	System.out.println(str2);
//------------------------------one more way------------
	String s1="Nancy";
	String s2="Jain";
s1=s1+s2;

s2=s1.substring(0,5);
s1=s1.substring(5,9);
System.out.println(s1);
System.out.println(s2);


	}

}
