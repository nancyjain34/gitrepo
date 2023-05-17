package basicPrograms;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char arr[]= {'a','b','a','c','d','b'};
int count=0;
for(int i=0;i<arr.length;i++)
{
	for (int j=i+1;j<arr.length;j++)
	{
	if (arr[i]==arr[j])
	{
		count++;
		System.out.println("duplicate char is "+ arr[i]);
	}
	}

}
System.out.println("Total duplicate count is " + count);


//Remove duplicate
Set<Character> set= new HashSet<Character>();
for(char ch: arr)
{
	set.add(ch);
}
System.out.println("Array after removing duplicates" +set);
	}
}
