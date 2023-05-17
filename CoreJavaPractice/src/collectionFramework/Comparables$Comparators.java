package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//sort arraylist using comparator and comparable
public class Comparables$Comparators
{
	public static void main(String args[])
	{
		//using Comparables
		ArrayList<Integer> arrlist=new ArrayList<Integer>(Arrays.asList(2,4,5,1,6));
		Collections.sort(arrlist);
		arrlist.forEach(System.out::println);
		
		//using Comparator
		ArrayList<Integer> arrlist2=new ArrayList<Integer>(Arrays.asList(3,4,7,1,6));
		arrlist2.sort(Comparator.naturalOrder());
		arrlist2.forEach(System.out::println);
		//OR
		Collections.sort(arrlist2,Comparator.naturalOrder());
		arrlist2.forEach(System.out::println);
		
	}
}