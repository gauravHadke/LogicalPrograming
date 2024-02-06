package Array;

import java.util.Iterator;

public class CopyOneArrayIntoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[]=new int[]{1,2,3,4,5,6};
		int a2[]=new int[a1.length];
		
		for(int i=0;i<a1.length-1;i++)
		{
			a2[i]=a1[i];
		}
		
		
		System.out.println("Array1........");
		for(int i=0;i<a1.length-1;i++)
		{
			System.out.print(a1[i]);
		}
		System.out.println("*********************************************************");
		
		System.out.println("Array2........");
		for(int i=0;i<a1.length-1;i++)
		{
			System.out.print(a2[i]);
		}
	}

}
