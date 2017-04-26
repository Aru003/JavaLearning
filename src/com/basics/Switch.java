package com.basics;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Integer :");
		int i = sc.nextInt();
		switch (i % 2) {
		case 0:
			System.out.printf("The value entered %d is even%n",i);
			break;
		case 1:
			System.out.printf("The value entered %d is odd%n",i);
			break;
		default:
			System.out.println("Oops it broke");
			break;
		}
	}
}
