package com.array;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[] {2,2,1};
		Set<Integer> numSet = new HashSet();
		int indicator;
	    int num=-1;
	    
	        for(int i=0; i<nums.length; i++){	
	        	 indicator = 0;
	        	if(!numSet.contains(nums[i])) {
	        		System.out.println("Inside"+numSet.contains(nums[i]));
	        		for(int j=i+1; j<nums.length; j++){
		                if(nums[j] == nums[i]){
		                	numSet.add(nums[i]);
		                	System.out.println("Before break" + nums[i]);
		                	indicator = 1;
		                	System.out.println("Indicator" + indicator);
		                    break;
		                    
		                }
		            }
	        		System.out.println("Indicator" + indicator);
	        		
	        		 if(indicator!=1) {
			            	num = nums[i]; 
			            	 System.out.println(num);
			            }
		           
	        	}
	            
	               
	           
	            
	        }
	        
		System.out.print("Last" + num);

	}

}
