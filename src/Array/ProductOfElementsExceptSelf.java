package Array;

import java.util.Arrays;

public class ProductOfElementsExceptSelf {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[] {2,4,6,1};
		int b[]=new int[a.length];
		
		int prod=1;
	
		for(int i=0;i<a.length;i++)
		{
			prod=prod*a[i]; 
		}
		
		System.out.println(prod);
		for(int i=0;i<a.length;i++)
		{
			b[i]=prod/a[i];
		//	System.out.print(" "+b[i]);
		}		
		System.out.print(Arrays.toString(b));
	}

}
