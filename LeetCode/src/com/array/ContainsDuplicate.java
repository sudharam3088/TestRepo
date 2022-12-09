package com.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	
	public static void main(String args[]) {
		
		int nums[] = new int[] {0,1,2,7};
		Map<Integer,Integer> hashMap = new HashMap();
	    for(int i=0; i<nums.length; i++){
	        if(hashMap.containsKey(nums[i])){
	            System.out.println("Has duplicate");
	        }else{
	            hashMap.put(nums[i], 1);
	        }
	    }  
	    
	}

	}
