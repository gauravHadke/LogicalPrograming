package ArrayPractise;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] =  new int[]{1,2,3,4,5};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Maximum -> "+a[0]);
		  
		//----------------------------------------------
		
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Max => "+max);
	}

}
