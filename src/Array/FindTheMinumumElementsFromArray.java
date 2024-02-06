package Array;

public class FindTheMinumumElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[]{2,4,2,1,6};
		
		int min = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum number of an Array is : "+min);
	}

}
