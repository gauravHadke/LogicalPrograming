package Array;

import java.util.HashSet;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] ={1,2,3,3,4,5};
		
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i=0;i<array.length;i++)
		{
			int j = array[i];
			hashSet.add(j);
		}  
		for(int a : hashSet)
		{
			System.out.print(" "+a);
		}
	}   

}
