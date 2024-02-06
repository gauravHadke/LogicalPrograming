package Array;

public class FindMaximumNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[]{2,4,2,1,6};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum element of an array is : "+max);
	}

}
