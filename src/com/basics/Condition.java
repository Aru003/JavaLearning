package com.basics;

import java.util.Scanner;

public class  Condition {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.printf("%s","Enter the age :");
			int age = sc.nextInt();
			//System.out.println();
			System.out.printf("%s","Enter the Gender MALE or Female : ");
			int Gender = sc.nextInt();
			if (age >= 65) {
				if (Gender == 1) {
					System.out.println("Senior male citizen");
				} else if(Gender == 2){
					System.out.println("Senior female citizen");
				}
			}
	/*		if ((Gender == 2 ) && (age >= 65) || ((Gender == 1) && (age >= 65))) {
				System.out.println("Senior  citizen");
	
			} */
		}


}