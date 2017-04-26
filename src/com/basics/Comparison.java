package com.basics;

import java.util.Scanner;

public class Comparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first integer :");
		int number1 = sc.nextInt();
		System.out.print("Enter the 2nd integer :");
		int number2 = sc.nextInt();
		
		//comparison
		if (number1 == number2) {
			System.out.printf("%d == %d%n",number1,number2);
		}
		else if (number1 != number2) {
			System.out.printf("%d != %d%n",number1,number2);
		}
		else if (number1 < number2) {
			System.out.printf("%d < %d%n",number1,number2);
		}
		else if (number1 > number2) {
			System.out.printf("%d > %d%n",number1,number2);
		}
		else if (number1 <= number2) {
			System.out.printf("%d <= %d%n",number1,number2);
		}
		else if (number1 >= number2) {
			System.out.printf("%d >= %d%n",number1,number2);
		}		
		
	}
}
