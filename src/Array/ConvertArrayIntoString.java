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
	
	
	//String builder
	String[] strArray = { "Convert", "Array", "With", "Java" };
	StringBuilder stringBuilder = new StringBuilder();
	for (int i = 0; i < strArray.length; i++) {
	    stringBuilder.append(strArray[i]);
	}
	String joinedString = stringBuilder.toString();
	System.out.println(joinedString);
  }
}