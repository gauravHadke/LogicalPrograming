package Number;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList<>();
		for(int n=1;n<=100;n++)
		{
			int count=0;
			for(int i=n;i<=n;i++) 
			{
			  if(n%i==0 && n%n==0)
					count++;
			if (count==2) 
				list.add(n);
			else 
				continue;
			}
		}
		System.out.println(list);
	}

}
