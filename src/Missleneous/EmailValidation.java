package Missleneous;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;    
public class EmailValidation{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
       emails.add("java@ibm.com");
       emails.add("jj@gmail.com");
       emails.add("k@yahoo.com");
       emails.add("haje@fomain.com");
        //Regular Expression   
      //  String regex = "^(.+)@(.+)$"; 
        String regex = "[a-z]+[@][gmail]{1}[.][com]{1}";  		
           //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  