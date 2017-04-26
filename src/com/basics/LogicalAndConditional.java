package com.basics;

public class LogicalAndConditional {
	public static void main(String[] args) {
		int i = 2;
		int y = 3;
		if (i <=2  & y <=3) { //true & true
			System.out.println("x is true and Y is false"); 
			}
		else if (i>2 && y == 3 ) {
			System.out.println("1st false , 2nd won't be evaluated");
		}
	}
}
