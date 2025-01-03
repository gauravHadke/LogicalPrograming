package Number;

import java.util.Scanner;

public class FibonancciSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Input number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
	}
}
