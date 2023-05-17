package basicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class removeDuplicates {
	
	public static void stringDuplicates(String str)
	{
		char arr[]=str.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		System.out.println("String after removing duplicates is:"+set);
	}
	public static void intDuplicates(int arr1[])
	{
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
		}
		System.out.println("Integer array after removing duplicates is:"+set);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="helloo";
		System.out.println("String before:"+name);
		stringDuplicates(name);
		
		//for integers
		int a[]= {1,2,3,3,4,5};
		
		List<Integer> list= new LinkedList<>();
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
		}
		System.out.println("Before integer array"+list);
		Collections.reverse(list);
		System.out.println("After reversing the list"+ list);
		intDuplicates(a);
		
//Using list
		
			//OR
//		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,4,3,2,1));
//		Set<Integer> set=new HashSet<Integer>();
//		for(int i=0;i<list.size();i++)
//		{
//			set.add(list.get(i));
//		}
//		System.out.println(set);


	}

}
