package ArrayPractise;

import java.util.Arrays;

public class FindLargestPossibleNumber {
 
	public static void main(String[] args) {
		
		int n[]=new int[] {2,3,1,3,8};
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]<n[j]) {
					int temp=0;
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		System.out.println(" "+Arrays.toString(n));
		String string = "";
		for(int i=0;i<n.length;i++) {
			string=string+n[i];
		}
		System.out.println(string);
	}
}
