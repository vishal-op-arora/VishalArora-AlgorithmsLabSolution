package com.greatlearning.paymoney;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of transaction array :: ");
		int transactionCount = scan.nextInt();
		
		System.out.println("\nEnter the transaction values of array ");
		int[] transactions = new int[transactionCount];
		
		int index = 0;
		while(transactionCount != 0 ) {
			System.out.print(" Enter the " + (index + 1) + " transaction :: ");
			transactions[index] = scan.nextInt();
			transactionCount--;
			index++;
		}
	
		System.out.print("\nEnter the total no of targets that needs to be achieved :: ");
		int targetCount = scan.nextInt();
	
		int target = 1;

		while(target <= targetCount) {
			System.out.print("\nEnter the value of " + target + " target :: ");
			int targetValue = scan.nextInt();
			Transaction.transaction(transactions, targetValue);
			target++;
		}
	}	
}
