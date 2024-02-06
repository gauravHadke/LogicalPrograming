package Array;

public class FindTheIndexOfGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//int res=0;
		int count=0;
		int array[]={2,1,4,3};
		for(int i=0;i<array.length;i++)
		{
			//int count = 0;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]+array[j]==n)
				{
					System.out.println("Pair of sum of given number is :"+i+" "+j);
				}
				//
			}
		}
		
		//System.out.println("Count of pair is : "+res);
	}

}
