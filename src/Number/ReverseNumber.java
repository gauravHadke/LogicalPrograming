package Number;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n =  scanner.nextInt();
		
		System.out.println("Revese number is :");
		int rev=0;
		while (n>0) {
			int d=n%10;
			//System.out.print(""+d);
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println(rev);
		
	}

}
