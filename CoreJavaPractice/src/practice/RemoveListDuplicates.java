package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveListDuplicates {

	public static void method()
	{
		int a[]= {1,4,2,3,6,7,8,1};
		List<Integer> list=new ArrayList<Integer>();
			System.out.println("After removing duplicates");
			for(int i:a)
			{
				if(list.contains(i))
			list.remove(i);
				else
					list.add(i);
			}
			System.out.println("without duplicate"+ list);
			Collections.reverse(list); 
			System.out.println("After reverse: "+list);
	}
	
	public static void main(String[] args) {
		method();
}
}
