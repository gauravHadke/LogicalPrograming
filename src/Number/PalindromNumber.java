package Number;

import java.util.Scanner;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt()  ;
		
		int temp=0;
		int flag=n;
		
		while (n>0) {
			int i=n%10;
			temp=temp*10+i;
			n=n/10;			
		}   
		
		if(temp==flag)
		{
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
	}

}
