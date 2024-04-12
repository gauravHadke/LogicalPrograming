package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ModSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Number :");
			int n = scanner.nextInt();
			int array[]=new int[n];
			int res[]=new int[n];
			System.out.println("Enter the elements of an array :");
			for(int i=0;i<n;i++)
			{
				array[i] = scanner.nextInt();
			}
			
			System.out.println(Arrays.toString(array));
			
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
				 res[i]=array[i]%array[j];
				}
			}
			System.out.println(Arrays.toString(res));
		}
		
		
		
	}

}
