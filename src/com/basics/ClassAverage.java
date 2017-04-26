package com.basics;

import java.util.Scanner;

public class ClassAverage {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int total = 0;
		int gradecounter = 1;
		
		//Processing
		while (gradecounter <= 10) {
			System.out.printf("%s%d%s","Enter the ", gradecounter, " out of 10 grade :");
			total = total + sc.nextInt();
			gradecounter++;
		}
		
		int average = total / 10;
		System.out.printf("%s%d%n","Class total grade value :",total);
		System.out.printf("%s%d%n","Class average value :",average);
	}
}
