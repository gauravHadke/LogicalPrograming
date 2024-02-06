package Number;

import java.util.Scanner;

// Take a number and return increment of that given number
public class PreIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number :");
		int i = scanner.nextInt();
		if(i>=0) {
			++i;
		}
		System.out.println("Increment by 1 :"+i);
	}

}
