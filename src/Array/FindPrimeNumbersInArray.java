package Array;

public class FindPrimeNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arry[]=new int[] {2,4,6,7,8,9};
		
		
		for(int i=0;i<arry.length;i++)
		{
			int fact=0;
			for(int j=1;j<=arry[i];j++)
			{
				if(arry[i]%j==0)
				{
					fact++;
				}
				else {
					continue;
				}
			}
			if (fact == 2) {
				System.out.println(arry[i]);
			}
		}

	}

}
