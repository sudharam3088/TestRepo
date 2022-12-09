package com.array;

public class RemoveElement {
	
	public static void main(String args[]) {
		int nums[] = new int[] {0,1,2,1};
		int val=1;
		int arrLength = nums.length;
	    int index=0;
	   for(int i=0; i<arrLength; i++){
	        if(nums[i] == val && nums[arrLength-1] !=val){
	            nums[i] = nums[arrLength-1];      
	            arrLength --;
	            index++;
	        }else {
	    }
	   }
	   System.out.print(nums.length-index);
	}
       

}
