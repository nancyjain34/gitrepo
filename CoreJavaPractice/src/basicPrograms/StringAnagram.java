package basicPrograms;

import java.util.Arrays;

public class StringAnagram {

	public static boolean method()
	{
		String a="listen";
		String b="silent";
		char a1[]=a.toCharArray();
		char a2[]=b.toCharArray();
		int n1=a1.length;
		int n2=a2.length;
		if(n1!=n2)
			return false;
		Arrays.sort(a1);
		Arrays.sort(a2);
		for(int i=0;i<n1;i++)
		{
			
				if(a1[i]!=a2[i])
					return false;
						
		}
		return true;
	}
	
	public static void main(String[] args) {
		boolean str=method();
		System.out.println(str);
}
}
