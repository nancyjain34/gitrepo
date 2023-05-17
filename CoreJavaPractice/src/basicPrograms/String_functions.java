package basicPrograms;

public class String_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is java learning";
		String str1="Hello";
		String str3="   This is space string";
		System.out.println(str);
		System.out.println(str.contains("x"));
		System.out.println(str.concat(" & this is concatenated string"));
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("h"));
		System.out.println(str.endsWith("e"));
		System.out.println(!str.isEmpty());
	System.out.println(str1.replace("l", "n"));
	System.out.println(str1.substring(3));
	System.out.println(str1.substring(3, 5));//length of the string is end index 5 - beginning index 0
	System.out.println(str1.toUpperCase());
	System.out.println(str3.trim());
	String stringarr[]=str.split(" ");
	System.out.println(stringarr[0]);
	}

}
