package Array;

import java.util.Arrays;

//redeuce time complexity
public class FindThePairOfIndexesOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {2,7,4,2,9};
		int sum=11;
		int low=0;
		int high=array.length-1;
		
		System.out.println("Given array :");  //{2,7,4,2,9}
		for(int i: array)
		{
			System.out.print(i+" ");
		}
		System.out.println("");
		
		Arrays.sort(array);
		
		System.out.println("After sorting :");
		for(int i: array)
		{
			System.out.print(i+" ");   //{2,2,4,7,9}
		}
		System.out.println("");
		
		//logic
		System.out.println("The index pair :");
		int count=0;
		while(low<high)
		{
			if(array[low]+array[high]<sum)
			{
				low++;
			}
			else if(array[low]+array[high]>sum)
			{
				high--;
			}
			else if(array[low]+array[high] == sum)
			{
				System.out.println(array[low]+" "+array[high]);
				count++;
				low++;
				high--;
			//	System.out.println("the count is :"+count);
			}
		}
		System.out.println("the count is :"+count);
	}

}
