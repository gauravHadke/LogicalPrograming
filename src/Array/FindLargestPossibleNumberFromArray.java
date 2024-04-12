package Array;

import java.util.Arrays;

public class FindLargestPossibleNumberFromArray {
/*
 * ex : int a[] = {1,2,3,5,6};
 * 		result = 65321
 * 
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,5,6};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
				 int temp;
				 temp = a[i];
				 a[i] = a[j];
				 a[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		String reString = "";
		for(int i=0;i<a.length;i++) {
			reString = reString+a[i];
		}
		System.out.println(reString);
	}

}
