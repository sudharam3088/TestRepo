package com.array;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
	
	// 
	public static int[] sumOfTowNumbers(int numb[], int target){

	    for(int i=0; i<numb.length;i++){
	        for(int j=i+1; j<numb.length; j++){
	            if(target == (numb[i]+numb[j])){
	                return new int[] {i,j};
	            }     	                 
	        }
	       
	    }
		return null;

	}

	
	public static int[] sumOfTowNumbers2(int numb[], int target){

		Map<Integer, Integer> numbsMap = new HashMap<>();
	    for(int i=0; i<numb.length;i++){
	    	numbsMap.put(numb[i], i);
	       
	    }
	    
	    for(int j=0; j<numb.length; j++) {
	    	int numb2 = target - numb[j];
	    	if(numbsMap.containsKey(numb2) && numbsMap.get(numb2) != j)
	    		return new int[] {j, numbsMap.get(numb2)};
	    }
		return null;

	}
	
	public static int[] sumOfTowNumbers3(int numb[], int target){

		Map<Integer, Integer> numbsMap = new HashMap<>();
	    
	    for(int i=0; i<numb.length; i++) {
	    	int numb2 = target - numb[i];
	    	if(numbsMap.containsKey(numb2))
	    		return new int[] {numbsMap.get(numb2), i};
	    	else
	    		numbsMap.put(numb[i], i);
	    }
		return null;

	}
	
	
 }
	
	
