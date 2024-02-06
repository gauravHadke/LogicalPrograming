package Missleneous;

import java.util.HashMap;

public class CountCharInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string="i am invinsible";
		String string2 = string.toLowerCase().replaceAll(" ","");
		
		System.out.println(string2);
		for(int i=0;i<string2.length();i++)
		{
			int count=1;
			for(int j=i+1;j<string2.length();j++)
			{
				if(string2.charAt(i) == string2.charAt(j)) {
					count++;
				}
			}
			System.out.println(string2.charAt(i)+" "+count);
		}
		System.out.println("---------------------------------");
		//---------------------------------------------------------------------
		//int count=0;
		for(char ch = 'a'; ch<='z';ch++)
		{
			int count=0;
			for(int i=0;i<string2.length();i++) {
				if(ch == string2.charAt(i))
				{
					count++;
					
				}
			}
			if(count!=0)
				System.out.println(ch+" "+count);
		}
		//-----------------------------------------------------------------------------------------
		System.out.println("--------------------------------------------------------");
		HashMap<Character, Integer> map = new HashMap<>();
		char[] array = string2.toCharArray();
		for(char ch : array)
		{
			if(!map.containsKey(ch))
			{
			map.put(ch,1);
			}
			else {
				Integer count = map.get(ch);
				map.put(ch, count+1);
			}
		}
		System.out.println(map);

	}

}
