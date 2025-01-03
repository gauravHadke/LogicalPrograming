package Pattern;

/*
 
 *
*^*
*^^*
*^^^*
*****
 
 
 */


public class ComplexStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		System.out.println("*");
		for(int i=1;i<=n-2;i++)
		{
			System.out.print("*");
			for(int j=1;j<=i;j++)
			{
				System.out.print("^");
			}
		    System.out.println("*");
			
		}
		for(int k=1;k<=n;k++)
		{
			System.out.print("*");
		}
	}

}
