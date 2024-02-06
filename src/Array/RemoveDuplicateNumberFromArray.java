package Array;

import java.util.Arrays;

public class RemoveDuplicateNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] ={1,3,4,5,5,7};
		int newArray[]=new int[array.length];
		int j=0;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i] != array[i+1])
			{
				newArray[j] = array[i]; //array[j] = array[i]
				j++;
			}
			newArray[j] = array[array.length-1];
		}
		System.out.println(Arrays.toString(newArray));
		for(int i : newArray) {
			if(i!=0) {
				System.out.print(i+" ");
			}
		}
	}

}
