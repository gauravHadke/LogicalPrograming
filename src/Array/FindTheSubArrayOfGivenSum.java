package Array;

public class FindTheSubArrayOfGivenSum {
	
	public static void main(String[] args) {
		
		int a[] = {2,3,4,3,5,6,7,8,9,3};
		int givenSum = 12;
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum= a[i];
			for(int j=i+1; j<a.length; j++) {
				sum = sum + a[j];
				if(sum == givenSum) {
					//for subarray
					for(int k=i; k<=j; k++) {
						System.out.print("  "+a[k]+" ");
					}
					System.out.println();
				}else if (sum > givenSum) {
					break;
				}
			}
		}
		
	}

}
