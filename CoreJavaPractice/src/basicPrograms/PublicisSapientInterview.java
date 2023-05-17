package basicPrograms;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PublicisSapientInterview {
	public static void test1(String str)
	{
	char arr[]=str.toCharArray();
	Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	for(char ch:arr)
	{
	    if(map.containsKey(ch))
	    {
	        map.put(ch,map.get(ch)+1);
	    }
	    else
	map.put(ch,1);
		}
	int max=Collections.max(map.values());
	for(Entry<Character,Integer> entry: map.entrySet())
	{
		if(entry.getValue().equals(max))
		{
		char key=entry.getKey();
		int value=entry.getValue();
		System.out.println("Maximun occurred char in string is: "+key + " "+" and its Count is: " +value);
		}
		
	}
	
	}

	public static void main(String[] args) {
		
		String str="aecdfegaeveedecdef";
		test1(str);		
}
}
