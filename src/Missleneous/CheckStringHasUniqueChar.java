package Missleneous;

public class CheckStringHasUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string ="i am i";
		string = string.replaceAll(" ","");
		int count = 1;
		for(int i=0;i<string.length();i++) {
			
			for(int j=i+1;j<string.length();j++) {
				if(string.charAt(i) == string.charAt(j))
					count++;
			}
			
		}
		if(count>1)
			System.out.println("String has not unique char");
		else 
			System.out.println("String has unique char");
	}

}
