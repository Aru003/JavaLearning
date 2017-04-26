package com.basics;

import java.util.Scanner;

public class ClassAverage2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Intilization
		int total = 0;
		int gradeCounter = 0;
		System.out.print("Enter the grade or -1 to quit :");
		int grade = sc.nextInt();
		while (grade != -1) {
			total = total + grade;
			System.out.print("Enter the grade or -1 to quit :" );
			grade = sc.nextInt();
			gradeCounter++;
		}
		
		if (grade != 0) {
			double average = (double) total / gradeCounter;
			System.out.printf("%nTotal of %d grades entered is%d",gradeCounter,total);
			System.out.printf("%nAverage of %d grades is %.2f",gradeCounter,average);
		}
		else {
			System.out.println("No grade was Entered");
		}
	}
}
