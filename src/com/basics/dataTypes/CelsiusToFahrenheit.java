package com.basics.dataTypes;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
// We can convert celsius to Fahrenheit	
		float celsius;
		double Fahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.print("please the celsius value :");
		celsius = sc.nextFloat();
		System.out.println("The celsius value entered : "+ celsius);
	//Calculating fahrenheit
		Fahrenheit = (celsius * 1.8) + 32;
		System.out.println("The fahrenheit value :" + Fahrenheit);
	}
}
