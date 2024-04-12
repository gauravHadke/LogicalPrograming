package ArrayPractise;

import java.util.Scanner;

public class Chocolate {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of persons came to party : ");
		int n = scanner.nextInt();
		int p[] = new int[n];
		System.out.println("Number of chocolates with them :");
		for(int a=0;a<n;a++) {
			p[a] = scanner.nextInt();
		}
		int totalChoc = 0;
		for(int i=0;i<n;i++) {
			totalChoc = totalChoc+p[i];
		}
		System.out.println("Total chocolates "+totalChoc);
		scanner.close();
	}

}
