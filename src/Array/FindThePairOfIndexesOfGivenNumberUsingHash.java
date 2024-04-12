package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//????????????????
public class FindThePairOfIndexesOfGivenNumberUsingHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {2,1,4,3};
		int sum=5;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<array.length;i++)
		{
			if (map.containsKey(sum-array[i])) {
				System.out.println(map.get(array[i]));
			}
			else {
				map.put(array[i],i);
			}
		}
		
		System.out.println(map);
	}

}
