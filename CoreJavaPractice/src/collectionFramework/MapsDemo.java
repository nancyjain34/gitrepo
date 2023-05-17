package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(3, "nancy"); //one entry
		hashmap.put(1, "toshi");
		hashmap.put(2, "udit");
		System.out.println("-----------HashMap--------------------");
		System.out.println(hashmap);
		//iteration through entryset and keyset

		System.out.println("---Iteration through EntrySet---");
	for(Entry<Integer,String> entry : hashmap.entrySet())
	{
		int key=entry.getKey();
		String value=entry.getValue();
		System.out.println("Value of key "+key +" is "+value);
	}
	System.out.println("---Iteration through KeySet---");
	for(Integer key: hashmap.keySet())
	{
		String value=hashmap.get(key);
		System.out.println("Value of key "+key +" is "+value);
	}
	
	
	
//LinkedHashMap maintains the order in which entries are added
	Map<Integer, String> lhashmap = new LinkedHashMap<Integer, String>();
	lhashmap.put(3, "nancy"); // one entry
	lhashmap.put(1, "toshi");
	lhashmap.put(2, "udit");
	System.out.println("-----------LinkedHashMap--------------------");
	System.out.println(lhashmap);
	// iteration through entryset and keyset
	
	for (Entry<Integer, String> entry : lhashmap.entrySet()) {
		int key = entry.getKey();
		String value = entry.getValue();
		
		System.out.println("Value of key " + key + " is " + value);
	}
	// TreeMap maintains the natural sorting order like 1.2.3..
	Map<Integer, String> treemap = new TreeMap<Integer, String>();
	treemap.put(3, "nancy"); // one entry
	treemap.put(1, "toshi");
	treemap.put(2, "udit");
	System.out.println("-----------TreeMap--------------------");
	System.out.println(treemap);
	// iteration through entryset and keyset
	for (Entry<Integer, String> entry : treemap.entrySet()) {
		int key = entry.getKey();
		String value = entry.getValue();
	
		System.out.println("Value of key " + key + " is " + value);
	}

}
}
