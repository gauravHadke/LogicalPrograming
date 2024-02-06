package Array;

public class TestDuplicateElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[]{2,3,4,5,6,2,6};
		//int newArray[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					
				}
			}
		}

		
	}

}
