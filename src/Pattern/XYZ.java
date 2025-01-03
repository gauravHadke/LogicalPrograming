package Pattern;

import java.util.Scanner;

public class XYZ {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i = 1; i<= n; i++) {
			System.out.println("");
			for(int j =i; j<= i; j++) {
				System.out.print(" "+j);
			}
			
		}
		
		
	}
}
