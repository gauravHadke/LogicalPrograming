package Array;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElement {

	public static void main(String[] args) {

		//using for loop
		int a[] = { 4, 5, 6, 3, 6, 5, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
		//using hash map
		Map<Integer, Integer> hMap = new HashMap<>();
		
		for(int x:a) {
			if(!hMap.containsKey(x)) {
				hMap.put(x, 1);
			}
			else {
				hMap.put(x, hMap.get(x)+1);
			}
		}
		
		for(Integer i : hMap.keySet()) {
			if(hMap.get(i)>1) {
				System.out.println(i);
			}
		}
	}
	


}
