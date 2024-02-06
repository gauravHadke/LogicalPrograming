package Missleneous;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//A=80 B=81
public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String string ="DEF";
    HashMap<Character, Integer> map = new HashMap<>();
    char[] charArray = string.toCharArray();
   
    	int count =80;
    	for(char ch = 'A';ch<='Z';ch++) {
    		map.put(ch, count);
    		count++;
    	}
    	System.out.println("-----------");
    	Set<Entry<Character,Integer>> entrySet = map.entrySet();
    	entrySet.forEach(s->System.out.println(s.getKey()+" "+s.getValue()));
    	System.out.println("-----------------");
    	for(char ch : charArray)
    	{
    		System.out.print(map.get(ch));
    	}
     
	}

}
