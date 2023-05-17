package basicPrograms;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LargestWordInString {

	public static void main(String[] args) {
		//find the largest and smallest word in string
				String string = "Rahul Shetty Academy is the best";
				String arr[]=string.split(" ");
				
				LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
				for(int i=0;i<arr.length;i++)
					{
						map.put(arr[i],arr[i].length());	
					}
				int max=Collections.max(map.values());
				int min=Collections.min(map.values());
				//System.out.println(map);
				for(Entry<String,Integer> entry:map.entrySet())
				{
					if(entry.getValue().equals(max))
					{
					System.out.println("Maximum word is "+entry.getKey()); 
					}
					if(entry.getValue().equals(min))
					{
					System.out.println("Minimun word is "+entry.getKey()); 
					}
				}
		}


		}
