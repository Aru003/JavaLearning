package com.basics;

import java.util.Scanner;

public class SimpleAndCompoundInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principle amount :");
		double amount = sc.nextDouble();
		System.out.print("Enter the Rate of Interest :");
		double roi = sc.nextDouble();
		System.out.print("Enter Total number of years :");
		int totalYears = sc.nextInt();
		System.out.print("Enter '1' for simple ,'2' for compound Interest :");
		int type = sc.nextInt();
		for (int year = 1; year <= totalYears; year++) {
			double total = 0;
			if (type == 1) {
				total = amount + (amount * roi *  year)/100;
			}
			else if (type == 2) {
				total = amount * Math.pow((1+(roi/100)), year);
			}
			
			System.out.printf("Total amount in %d year :%.2f%n",year,total);
		}
	}
}
