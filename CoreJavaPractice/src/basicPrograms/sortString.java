package basicPrograms;

public class sortString {

	public static void sortmethod(String name)
	{
		char arr1[]=name.toCharArray();
		for (int i=0;i<arr1.length;i++)
		{
			for (int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					char temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		System.out.println(arr1);
	}
	
	public static void sortnumber(int arr[])
	{
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i=0;i<arr.length;i++)
		{
		
		System.out.print(arr[i]);
		}
	}
	
	public static void sortchar(char arr[])
	{
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\n");
		System.out.println(arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sortmethod("cba");
int a[]= {3,2,1};
char b[]= {'a','c','b'};
sortnumber(a);
sortchar(b);
	}

}
