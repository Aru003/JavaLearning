package com.basics;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		int total = 0;
		int gradeCounter = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the grades one by one :");
		while (sc.hasNext()) {
			int grade = sc.nextInt();
			total += grade;
			++gradeCounter;
			switch (grade/10) {
			case 9:
			case 10:
				++aCount;
				break;
			case 8:
				++bCount;
				break;
			case 7:
				++cCount;
				break;
			case 6:
				++dCount;
				break;
			default:
				++fCount;
				break;
			}
			
		}
		System.out.printf("Total scores %d%n",total);
		System.out.printf("Total grade counter %d%n",gradeCounter);
		System.out.printf("Total 'a' grade count %d%n",aCount);
		System.out.printf("Total 'b' grade count %d%n",bCount);
		System.out.printf("Total 'c' grade count %d%n",cCount);
		System.out.printf("Total 'd' grade count %d%n",dCount);
		System.out.printf("Total 'f' grade count %d%n",fCount);
	}
}
