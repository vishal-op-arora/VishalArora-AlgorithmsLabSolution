package com.greatlearning.currency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.greatlearning.utils.Sorting;

public class Currency {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter the size of currency denominations :: ");
		int currencyDenominationCount = scan.nextInt();
		
		System.out.println("Enter the currency denominations value");
		int[] currencyDenominationValues = new int[currencyDenominationCount];
		
		int index = 0;
		while(currencyDenominationCount != 0) {
			System.out.print("\t" + (index +1) + " currency denominations value :: ");
			currencyDenominationValues[index] = scan.nextInt();
			currencyDenominationCount--;
			index++;
		}
		
		System.out.print("Enter the amount you want to pay ::");
		int ammountToPay = scan.nextInt();
		
		paymentApproach(currencyDenominationValues,ammountToPay);
			
	}
	
	static void paymentApproach(int[] currencyDenominations, int ammountToPay ) {
		
		Sorting.bubbleSort(currencyDenominations);
		
		Map <Integer, Integer> currencyPayment = new HashMap <Integer, Integer>();
			
		for(int index = currencyDenominations.length - 1; index >=0; index--) {
			if(ammountToPay / currencyDenominations[index] >= 1) {
				
				try {
					currencyPayment.put(currencyDenominations[index], ammountToPay / currencyDenominations[index]);
				} catch (ArithmeticException e) {
					System.out.println("Divided by zero operation cannot possible. Currency denominations can't be zero.");
				}
				
				ammountToPay = ammountToPay % currencyDenominations[index];
			}
		}
		
		for(int index = 0; index < currencyDenominations.length -1; index++) {
			if(ammountToPay != 0) {
				if(ammountToPay < currencyDenominations[index]) {
					if(currencyPayment.containsKey(currencyDenominations[index])) {
						currencyPayment.put(currencyDenominations[index], currencyPayment.get(currencyDenominations[index]) + 1);
					}
					else {
						currencyPayment.put(currencyDenominations[index], 1);
					}
				}
			}
		}
		
		System.out.println("\n\nYour payment approach in order to give min no of notes will be :: ");
		
		for(int index = currencyDenominations.length - 1; index >=0; index--) {
			if(currencyPayment.containsKey(currencyDenominations[index])) {
				System.out.println(currencyDenominations[index] + " : " + currencyPayment.get(currencyDenominations[index]));
			}
		}		
	}
}
