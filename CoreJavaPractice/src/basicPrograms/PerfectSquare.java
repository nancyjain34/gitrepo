package basicPrograms;

public class PerfectSquare {

		public static void main(String[] args) {
			//find if number is perfect square
			
			int num=49; //7*7 or 100=10*10
			double sqrtnum=Math.sqrt(num);
			if(Math.ceil(sqrtnum)-sqrtnum==0)
			{
				System.out.println("This is a perfect square");
			}
			else
				System.out.println("Not a perfect sqaure of any number");
	}


	}

