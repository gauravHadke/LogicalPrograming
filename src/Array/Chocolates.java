  package Array;

import java.util.Scanner;

public class Chocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Number of persons came to solo's party :");
		int n = scanner.nextInt();
		int persons[]=new int[n];
		System.out.println("Persons came no chocolates");
	
		  for(int i=0;i<n;i++)
		  { 
			//System.out.print(" "+i);
			persons[i] = scanner.nextInt();
		  }
		System.out.println("Total chocolates :");
		int totalChocolates=0;
		for(int i=0;i<n;i++)
		{
			totalChocolates=totalChocolates+persons[i];
		}
		System.out.println(totalChocolates);
		System.out.println("add extra line to edit in git hub");
		scanner.close();
	}
}
