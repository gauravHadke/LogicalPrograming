package Array;

import java.util.Arrays;

public class ConvertArrayIntoString {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,5,6};
		System.out.println("@@"+Arrays.toString(a));
		String revString   = "";
		for(int i=0;i<a.length;i++) {
			revString = revString+a[i];
		}
		System.out.println(revString);
	}

}
