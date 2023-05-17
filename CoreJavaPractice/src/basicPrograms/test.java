package basicPrograms;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrlist=new ArrayList<>(Arrays.asList("Test1","Test2","Test3"));
		for(int i=0;i<arrlist.size();i++)
		{
			if(arrlist.get(i).equals("Test2"))
			{
				arrlist.set(i, "replaced");
			}
		}
	
	System.out.println(arrlist);
	}

}
