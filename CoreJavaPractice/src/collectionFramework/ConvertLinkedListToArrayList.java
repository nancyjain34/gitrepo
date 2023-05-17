package collectionFramework;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class ConvertLinkedListToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("Banana");
		linkedlist.add("Peer");
		linkedlist.add("Apple");
		//converting to ArrayList
		
		ArrayList<String> arrlist=new ArrayList<String>(linkedlist);
		
		System.out.println(arrlist);
		
		//convert array to list and visa versa
		String arr[]= {"Banana","Apple","Peers"};
		List <String> list=new ArrayList<>(Arrays.asList(arr));
		list.forEach(System.out::println);
		
		//list to array
		String arr1[]=new String[list.size()];
		for(int i=0;i<list.size();i++)
		{
			 arr1[i]=list.get(i);
		}
	}

}
