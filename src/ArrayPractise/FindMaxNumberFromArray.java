package ArrayPractise;

public class FindMaxNumberFromArray {
	
	public static void main(String[] args) {
		
		int n[] =new int[] {3,2,1,6,9};
		int max=0;
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]<n[j]){
					max=n[j];
				}
			}
		}
		System.out.println(max);
	}

}
