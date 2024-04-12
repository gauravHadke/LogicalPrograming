package Array;

import java.util.Arrays;
import java.util.spi.LocaleNameProvider;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,9,3,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp = 0;
					temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Max Element is :-> "+a[0]);
		//----------------------------------------------------------------
	
		int b[]=new int[] {1,2,7,4};
		int max = b[0];
		for(int i=1;i<b.length;i++) {
			if(b[i]>max) {
				max = b[i];
			}
			//System.out.println(max);
		}
		
		System.out.println("Maximum element of given array is : "+max);
	}
	


}
