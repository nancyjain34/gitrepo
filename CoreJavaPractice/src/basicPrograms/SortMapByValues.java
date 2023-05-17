package basicPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class SortMapByValues {

	public static void sortMap()
	{
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		map.put('E', 3);
		map.put('A', 5);
		map.put('B', 2);
		map.put('C', 1);
		map.put('D', 4);

		ArrayList<Map.Entry<Character,Integer>> maplist=new ArrayList<>(map.entrySet());
			maplist.sort(Map.Entry.comparingByValue());	
	//maplist.forEach(System.out::println);//new way to print list
			System.out.println(maplist);
		
	}
	
	public static void main(String args[])
	{
		sortMap();
	}
	
}
