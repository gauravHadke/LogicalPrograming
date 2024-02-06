package Number;

import java.util.Scanner;

public class SumOfDigitsInGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int n =  scanner.nextInt();
		int sum=0;
		
		while (n>0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		
		System.out.println("Sum of digits is :"+sum);
	}

}
