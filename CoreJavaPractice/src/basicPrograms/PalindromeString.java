package basicPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Deed",  revstr="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		System.out.println(revstr);
		if(revstr.toLowerCase().equals(str.toLowerCase()))
		{
			System.out.println("String is a palindrome");
		}
	}

}
