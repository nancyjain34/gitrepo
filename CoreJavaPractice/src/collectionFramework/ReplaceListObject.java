package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceListObject {

	public static void main(String[] args) {
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

