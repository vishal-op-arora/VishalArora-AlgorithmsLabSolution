package com.greatlearning.utils;

public class Sorting {
	
	public static void bubbleSort(int[] array) {
		int arrayLength = array.length; 
		for (int index = 0; index < arrayLength -1 ; index ++ ){
			int tempNumber = 0;
			for(int i = 0; i < arrayLength-index-1; i++){
				if(array[i] > array[i+1]){
					tempNumber = array[i];
					array[i] = array[i+1];
					array[i+1] = tempNumber;
				}				
			}
		}
	}
}