package Array;

import java.util.Scanner;

public class Phone {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter number : ");
//		int n = scanner.nextInt();
//		
		int n;
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Array Size:");
			n=sc.nextInt();
			//----------------------------\\
			int[] array = new int[n];
			System.out.println("Enter Array elements: ");
			for(int i=0; i<n; i++)
			{
			    array[i]=sc.nextInt();
			}

			for (int i=0; i<n; i++)
			{
			    System.out.println(array[i]);
			}
		}
		
//		for(int i=1;i<=n;i++)
//		{
//		  int x = scanner.nextInt();
//		  int y = scanner.nextInt(); 
//			
//			if(x<y) {
//				System.out.println("Repair phone ");
//			}
//			else if (x > y) {
//				System.out.println("Replace phone");
//			}else {
//				System.out.println("Any");
//			}
//		}
		
		
	}

}
