package ArrayPractise;

import java.util.Arrays;

public class ResverArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[] {1,2,3,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp;
					temp= a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
