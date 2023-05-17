package basicPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
public class MapSortBykey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
map.put("Nancy", 8);
map.put("Udit", 40);
map.put("Durva", 3);
//Sort map by key

List<Entry<String,Integer>> mapList=new ArrayList<>(map.entrySet());
	mapList.sort(Entry.comparingByKey());
	//Collections.sort(maplist,Entry.comparingByValue());

	//System.out.println(mapList);
	mapList.forEach(System.out::println);
	
	//---one more way to sort map by key---is using treemap concept of natural order sorting
	TreeMap<String,Integer> treemap=new TreeMap<String,Integer>();
	for(Entry<String,Integer> e1: map.entrySet())
	{
		treemap.put(e1.getKey(), e1.getValue());
		}
	//System.out.println(treemap);OR
	for(Entry<String,Integer> entry:treemap.entrySet())
	{
		System.out.println(entry.getKey()+"="+entry.getValue());
	}
	}

}
