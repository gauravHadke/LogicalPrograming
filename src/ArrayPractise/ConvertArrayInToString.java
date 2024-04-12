package ArrayPractise;

public class ConvertArrayInToString {
	
	public static void main(String[] args) {
		int array[] = new int[]{1,2,3,4,5};
		String s = "";
		for(int i=0;i<array.length;i++) {
			s=s+array[i];
		}
		System.out.println(s);
	}

}
