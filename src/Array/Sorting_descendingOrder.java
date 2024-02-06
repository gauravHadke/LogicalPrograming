package Array;

import java.util.Arrays;

public class Sorting_descendingOrder {

	public static void main(String[] args) {
		
		int b[]=new int[] {1,2,3,4,9,5};
		
		System.out.println("Array before sort Descending : - "+Arrays.toString(b));
		
		for(int a=0;a<b.length;a++) {
			for(int c=a+1;c<b.length;c++) {
				if(b[a]<b[c]) {
					int temp=0;
					temp = b[a];
					b[a] = b[c];
					b[c] = temp;
				}
			}
		}
		
		System.out.println("Array after sort Descending : - "+Arrays.toString(b));
	}
}
