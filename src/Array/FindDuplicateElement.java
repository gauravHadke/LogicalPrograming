package Array;

public class FindDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,5,6,3,6,5,8,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
