package com.datatype.practise;

public class IsSortedMethod {

	public static void main(String[] args) {
		
		int[] array = {29,30,31,51,56};
		
		boolean result = isSorted(array);
		System.out.println(result);
	
		
	}
	static boolean isSorted(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]){
				return false;
			}
			
		}
		return true;
		
	}
	
	
}
