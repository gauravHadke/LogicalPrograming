package Number;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;

		if(n<=0 && n==1)
			System.out.println("Given number is not prime number");
		else 
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0 && n%n==0)
					count++;
				else 
					continue;
			}
			if(count==2)
				System.out.println("Given number is prime number");
			else {
				System.out.println("given nummber is not prime number");
			}
		}
	}

}
