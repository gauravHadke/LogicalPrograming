  package Missleneous;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1,2,4,5,6,7};
		int sum1=0;
		for(int i=0;i<array.length;i++)
		{
			sum1=sum1+array[i];
		}
		System.out.println("Sum of elements in array : "+sum1);
		int sum2=0;
		for(int i=1;i<=array[array.length-1];i++) {
			sum2=sum2+i;
		}
		System.out.println("Sum of range of element : "+sum2);
		
		System.out.println("Missing number is : "+(sum2-sum1));
	}

}
