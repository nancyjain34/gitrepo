package basicPrograms;

public class countDuplicates {

		public static void countDuplicate(int arr[])
		{
			int count=0;
			int len=arr.length;
					for(int i=0;i<len;i++)
					{
						for(int j=i+1;j<len;j++)
						if(arr[i]==arr[j])
								count++;
					}
											
					
					System.out.println(count);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[]={-1,2,3,-4,2,-1};
			countDuplicate(a);
			
	}
	}

