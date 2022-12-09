package com.string;

public class Palindrom {
	
	public static void main(String[] args) {
		
		System.out.println("Check for palindrom");
		
		String s="0P";
		String str="";
		String rev = "";

		for (int i=0;i<s.length();i++)  
		{  	
			char c =s.charAt(i);
			if ((c >= 'A' && c <= 'Z') ||
                    (c >= 'a' && c <= 'z') ||
                    (c >= '0' && c <= '9')) //returns true if both conditions returns true  
			{  
			
				str=str+Character.toLowerCase(s.charAt(i));  
				rev = Character.toLowerCase(s.charAt(i))+rev;
				
			}  
			

		}
		System.out.println(rev);
		if(str.equals(rev))
			System.out.println("YES");
		else
			System.out.println("NO");
		
		
		// Another solution
		StringBuilder builder = new StringBuilder();
		
		for(char ch : s.toCharArray()){
			if (Character.isLetterOrDigit(ch)) {
		        builder.append(Character.toLowerCase(ch));
		      }
        }
		 String filteredString = builder.toString();
		 String reversedString = builder.reverse().toString();

		    if( filteredString.equals(reversedString))
		    	
		    	System.out.println("YES");
		
		    else
		    	System.out.println("NO");
		    
	}
	    

}
