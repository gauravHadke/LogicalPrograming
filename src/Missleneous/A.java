package Missleneous;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= new int[]{1,2,4};
		
		int sum1=0;
		for(int i=0;i<array.length;i++)
		{
			sum1=sum1+array[i];
		}
		System.out.println("Total sum of elements is : "+sum1);
		int sum2=0;
		for(int i=1;i<=array[array.length-1];i++) 
		{
			sum2=sum2+i;
		}
		System.out.println("Total sum of range is : "+sum2);
		
		System.out.println("Missing element from given array is : "+(sum2-sum1));
		System.out.println("-------------------------------------------------------");
		
		//----------------------------------------------------------------------------------------
		
		int b[]=new int[array.length];
		int prod=1;
		for(int i=0;i<array.length;i++)
		{
			prod=prod*array[i];
		}
		System.out.println("Product of all elements in given array : "+prod);
		for(int i=0;i<array.length;i++)
		{
			b[i] = prod/array[i];
		}
		System.out.println("product array except self : "+Arrays.toString(b));
	}

}
