package com.basics;

import java.util.Scanner;

public class MaxiumumFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 double integers seperated by spaces : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		double result = maxiumumFinder(x,y,z);
		System.out.printf("%n Maximum number : %f%n",result);
	}
	
	static double maxiumumFinder(double num1, double num2,double num3){
		double maximumNumber = 0.0;
		maximumNumber = num1; //Assuming max number = num1
		if (num2 > maximumNumber) {
			maximumNumber = num2;
		}
		if (num3 > maximumNumber) {
			maximumNumber = num3;
		}
		return maximumNumber;
	}
}
