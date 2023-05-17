package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(4);
		//OR List<Integer> list=new ArrayList<>(Arrays.asList(3,2,5,1,4));
		//Output-- 5 4 3 2 1
		System.out.println("Sorting usinf Collections class");
		Collections.sort(list); //output-- 1 2 3 4 5 
		//OR
		//Collections.sort(list, Comparator.naturalOrder()); //output-1 2 3 4 5
		//Ascending order
		System.out.println("Ascending Order");
		list.forEach(System.out::println);
		System.out.println("Descending Order");
		Collections.reverse(list);
		list.forEach(System.out::println);
		System.out.println("Sorting using Comparator interface");
		list.sort(Comparator.naturalOrder());
		list.forEach(System.out::println);
		list.sort(Comparator.reverseOrder());
		list.forEach(System.out::println);
	}

}
