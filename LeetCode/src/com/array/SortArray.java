package com.array;


public class SortArray{
  
  public static void main(String args[]){
	  
	  int a[] = {2,5,7};
	  for(int i=0; i<a.length; i++) {
		  if(a[i] > 5){
		  	a[i] = 0;
		  }
		  System.out.println(a[i]);
	  }
	  
    System.out.println("This program sorts the input array"); 
  }
  
}
