package Array;

import java.util.HashMap;

public class FindEvenElementFromGivenArray {

	public static void main(String[] args) {
			
		int array[]= new int[] {2,3,4,5,6,7,8};
		for(int i=0; i<array.length; i++) {
			if(array[i]%2 == 0) {
				System.out.println(array[i]);
			}
		}
	}
}
