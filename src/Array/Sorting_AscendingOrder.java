package Array;

import java.util.Arrays;
import java.util.Iterator;

public class Sorting_AscendingOrder {

	public static void main(String[] args) {
		
		int b[]=new int[] {1,8,3,4,9,5};
		
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<args.length;j++) {
				if(b[i]>b[j]) {
					
				}
			}
		}
		
		Arrays.sort(b);
		
		System.out.println("Sorted ascending :- "+Arrays.toString(b));
	}
	
}
