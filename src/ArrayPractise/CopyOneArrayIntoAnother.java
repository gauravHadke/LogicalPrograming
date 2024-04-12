package ArrayPractise;

import java.util.Arrays;

public class CopyOneArrayIntoAnother {

	public static void main(String[] args) {
		
		int array1[] = new int[]{1,2,3};
		int array2[] = new int[]{2,4,5};
		int array3[] = new int[array1.length+array2.length];
		
		for(int i=0;i<array1.length;i++) {
			array3[i] = array1[i];
		}
		for(int i=0;i<array2.length;i++) {
			array3[i+array1.length] = array2[i];
		}
		
		System.out.println(Arrays.toString(array3));
	}
}
