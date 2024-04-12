
public class FindThePairOfGivenNumber2 {

	public static void main(String[] args) {
		int n[]=new int[] {1,2,3,4}; //
		int givenNumber = 6;
		
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]+n[j] == givenNumber) {
					System.out.println(" "+i+" "+j);
				}
			}
		}
	}
}
