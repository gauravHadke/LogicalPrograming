package Missleneous;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupOfCityOnBasisOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Pune,Mumbai,Pune,mumbai,hydrabad,";
		
		string = string.toLowerCase();
		
		String[] string1 = string.split(",");
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		for(String string2 :  string1)
		{
			if(!map.containsKey(string2)) {
				map.put(string2, 1);
			}else {
				Integer count = map.get(string2);
				map.put(string2, count+1);
			}
		}
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		
		Map<Integer,List<Entry<String,Integer>>> collect = entrySet.stream()
							.collect(Collectors.groupingBy(e->e.getValue()));
		System.out.println(collect);
	
//		for(Entry<String, Integer> entry  :entrySet) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
	}

}
