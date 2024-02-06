/*

* 
*^*
*^^*
*^^^*
*^^^^*
******

*/

package Pattern;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("*");
		for (int i=1; i<=n-2; i++)
        {
            
            System.out.print("*");
          
            for (int k=1; k<=i; k++)
            {
                System.out.print("^");
            }
           System.out.println("*");
        }
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		
	}

}
