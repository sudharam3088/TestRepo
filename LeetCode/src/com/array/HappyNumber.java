package com.array;

public class HappyNumber {
	
	public static void main(String args[]) {
		int n=100;
		int sum=0;
		String s = n+"";
	    
	   while(sum!=1){
		   
		    String c[] = s.split("");
	        for(int i=0; i<c.length; i++) {
	        	sum = sum + (Integer.parseInt(c[i]) * Integer.parseInt(c[i]));
 	
	        }
	        if(sum != 1) {
	        	s = sum+"";
	        	sum = 0;
    	
	        }
	    }

	   
	   System.out.println(n + " is a happy number");
	    
	}
	

}
