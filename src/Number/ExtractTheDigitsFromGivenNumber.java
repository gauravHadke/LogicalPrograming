package Number;

import java.util.Scanner;

public class ExtractTheDigitsFromGivenNumber {

	//OOO@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n =  scanner.nextInt();
		
		while (n>0) {
			
			int d=n%10;
			System.out.println(d);
			n=n/10;
		}

	}

}
