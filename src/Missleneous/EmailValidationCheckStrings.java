package Missleneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class EmailValidationCheckStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<String> emails = new ArrayList<String>();  
	      emails.add("java@ibm.com");
	      emails.add("jj@gmail.com");
	      emails.add("k@yahoo.com");
	      emails.add("haje@fomain.com");
	      emails.add("jajas@rediffmail.com");
	      String s1 = "";
	      String s2 = "";
	      System.out.println(emails.size());
	      System.out.println(emails.get(0));
	     for (int i = 0; i < emails.size(); i++) {
	    	 String string = emails.get(i);
	    	 String[] split = string.split("@");
	    	  s1 = split[1];
			  for (int j = 1; j < emails.size(); j++) {
				String strinig1 = emails.get(i);
			    String[] split1 = string.split("@");
			    s2 = split1[1];
			}
			
		}
	     
	     System.out.println(s1);
	     
	      System.out.println("---------------------------");
	       
	       String string[]=new String[emails.size()];
	       
	       for(int i=0;i<=string.length-1;i++)
	       {
	    	   string[i] = emails.get(i);
	       }
	       System.out.println(Arrays.toString(string));
	       for (int i = 0; i < string.length; i++) {
	    	   String[] split = string[i].split("@");
	    	   for(String s : split)
	    	   {
	    		   System.out.println(s+" ");
	    	   }
		}
	      
//	       for (int i = 0; i < string.length; i++) {
//			  String[] split = string[i].split("@");
//			   String split2 = split[1];
//	    	   for (int j = i+1; j < string.length; j++) {
//	    		   String[] jsplit = string[i].split("@");
//				   String jsplit2 = jsplit[1];
//				   if(split2 == jsplit2)
//				   {
//					   System.out.println(string[i]+" true");
//				   }
//				   else {
//					System.out.println("false");
//				}
//			}
//	       }
	     
	      	      
	}

}
