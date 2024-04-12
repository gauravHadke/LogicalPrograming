package ArrayPractise;

public class FindDuplicateElement {

	public static void main(String[] args) {
		
		int n[] =new int[]{1,2,2,3,5,5};
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i] == n[j]) {
					System.out.println(n[i]);
				}
			}
		}
	}
}
