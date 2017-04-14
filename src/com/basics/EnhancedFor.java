package com.basics;
public class EnhancedFor {
	public static void main(String[] args) {
		int[] numbers = new int[2000];
		for (int i = 0;i < 2000;i++ ) {
			numbers[i] = i;	
			}
		//Enhanced forloop
		for (int item : numbers ) {
		System.out.println("The position of i :" + item);	
		}
	}
}