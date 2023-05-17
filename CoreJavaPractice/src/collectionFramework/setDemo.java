package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashset does'nt maintain order
		Set<String> set=new HashSet<String>();
		set.add("vw");
		set.add("xuv");
		set.add("m2");
	//	int size=set.size();
	//	System.out.println("Size of list is:" +size);
		System.out.println("Hash set elements are :" +set);
		
		//LinkedHashSet maintains order in which elements are added in set
		Set<String> set1=new LinkedHashSet<String>();
		set1.add("vw");
		set1.add("xuv");
		set1.add("m2");
		System.out.println("LinkedHash set elements are :" +set1);
		
		//Treeset maintains the natural sorting
		Set<String> set2=new TreeSet<String>();
		set2.add("vw");
		set2.add("xuv");
		set2.add("m2");
		System.out.println("Tree set elements are :" +set2);
	}

}
