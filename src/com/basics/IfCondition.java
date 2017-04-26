package com.basics;

public class IfCondition {
	public static void main(String[] args) {
		int x,y =20;
		for(x = 0; x <10 ; x++ ){
			System.out.println("The value of x :" + x);
			System.out.println("The value of y :" + y);
			y--;
		}
		
		//conditional operator (?:) 
		System.out.println(x != y ? "x is not equal to y" : "x==y");
	}
}
