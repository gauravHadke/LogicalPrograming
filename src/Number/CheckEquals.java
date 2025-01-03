package Number;

import java.util.Scanner;

public class CheckEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x=10;
//		int y=10;
//		
//		System.out.println(y==x);
//		
//		System.out.println("");
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
	}

}
