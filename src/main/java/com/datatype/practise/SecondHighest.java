package com.datatype.practise;

public class SecondHighest {

	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34,55,67,90,89,48,90,32};
		
		//System.out.println(Math.round(arr.length/2));
		
		//com.practise.pages.Arrays.sort(arr); //Sort any Array like this
		
		//Swap Elements in an Array and Reverse Array Program
//		for (int i =0;i<Math.round(arr.length/2);i++) {
//			int temp = arr[i];
//			arr[i]= arr[arr.length-i-1];
//			arr[arr.length-i-1] = temp;
//			
//			
//		}
		//System.out.println(com.practise.pages.Arrays.toString(arr));
		
		
		
		
		
		
int[] arr1 = {1, 3, 4, 2, 7, 3, 5, 1,99,99,87,98,5};
		
		
		int largest =arr[0];
		int second =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				second=largest;
				
				largest=arr[i];
			}
			else if(arr[i] > second  && arr[i] != largest) {
				second =arr[i];
			}
			
		}
		System.out.println(largest);
		System.out.println(second);
		
		
		
		
	}

}
