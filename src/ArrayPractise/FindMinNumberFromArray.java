package ArrayPractise;

public class FindMinNumberFromArray {

	public static void main(String[] args) {
		
		int n[]= new int[] {6,4,3,9,1};
		int min=0;
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]>n[j]) {
					min=n[j];
				}
			}
		}
		System.out.println(min);
	}
}
