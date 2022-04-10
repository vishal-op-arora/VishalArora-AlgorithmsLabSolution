package com.greatlearning.paymoney;

public class Transaction {
	
	static void transaction(int array[], int targetValue) {
		
		int index = 0, value = 0;
		boolean targetAchieved = false;
		
		for(int arr : array) {
			index ++;
			value = value + arr;
			if(value >= targetValue) {
				targetAchieved = true;
				break;
			}
		}
		
		if(targetAchieved) {
			System.out.println("Target achieved after " + index + " transactions");
		}
		else {
			System.out.println("Given target is not achieved");
		}
	}
}
