package collectionFramework;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("vw");
		list.add("xuv");
		list.add("m2");
		int size=list.size();
		System.out.println("Size of list is:" +size);
		//System.out.println(list.get(0));
		for (int i=0;i<size;i++)
		{
			System.out.println("List items are:" +list.get(i));
		}
		
		list.remove(2);
		for (String str: list)
		{
			System.out.println("After removing index 2 element in list is :"+str);
		}
		
	}

}
