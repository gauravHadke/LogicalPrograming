package Array;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[] {1,2,3,4,5};
		int b[]=new int[] {6,7,8};
		
		int c[]=new int[a.length+b.length];
		
		//stored 1st array value 
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			System.out.print(c[i]);//
		}
		System.out.println("-----------------");
		for(int i=0;i<b.length;i++)
		{
			//already we stored 1st 4 indexes now have to store after that
			c[i+a.length]=b[i];
		}
		
		System.out.println(Arrays.toString(c));
	}

}
