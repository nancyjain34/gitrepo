package basicPrograms;
import java.util.Collections;
import java.util.LinkedHashMap;
public class charOccurences {

	public static void countmethod(String name)
	{
		LinkedHashMap<Character,Integer> charmap=new LinkedHashMap<Character,Integer>();
		char arr_traverse[]=name.toCharArray();
		
		for(char c: arr_traverse)
		{
		//	if(!String.valueOf(c).isBlank())
			
			if (charmap.containsKey(c))
			{
				charmap.put(c, charmap.get(c)+1);
			}
			else
			{
				charmap.put(c, 1);
			}
			
		}
		System.out.println(charmap);
		int max=Collections.max(charmap.values());
		System.out.println("Max occurence of character is:"+max);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("starrting breakpoint");
		countmethod("3212133");
	}

}
