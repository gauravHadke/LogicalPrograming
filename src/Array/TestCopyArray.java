package Array;

public class TestCopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[]=new int[]{2,5,6,7,7,9,5};
		int array2[]=new int[array1.length];
		
		for(int i=0;i<array1.length;i++) {
			array2[i]=array1[i];
		}
		System.out.println("Array1 is :");
		
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]);
		}
		
		System.out.println("Array2 is :");
		
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array2[i]);
		}
	}

}
