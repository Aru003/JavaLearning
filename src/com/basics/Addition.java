package com.basics;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1;
		int number2;
		int sum;
		System.out.print("Enter first Integer :");
		number1 = sc.nextInt();
		System.out.println("Enter second Integer :");
		number2 = sc.nextInt();
		sum = number1 + number2;
		System.out.printf("%s%d%n","Total sum value :" , sum);
			
	}
}
