package ArrayPractise;

public class FindThePrimeNumbersFromGivenArray {

	public static void main(String[] args) {
		
		int array[]= new int[] {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<array.length;i++) {
			int fact=0;
			for(int j=1;j<=array[i];j++) {
				if(array[i]%j == 0) {
					fact++;
				}
				else {
					continue;
				}
			}
			
			if(fact == 2) {
				System.out.println("Prime numbers in given array are : "+array[i]);
			}
		}
	}
	
}
