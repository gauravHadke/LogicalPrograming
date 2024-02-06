package Number;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println("Given year is leap year");
		}
		else {
			System.out.println("Given year is not leap year");
		}
		
	}

}
