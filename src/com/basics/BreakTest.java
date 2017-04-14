package com.basics;

public class BreakTest {
	public static void main(String[] args) {
		int count;
		for(count = 1;count <= 10; count++){
			if (count ==5) {
				break;
			}
			System.out.printf("%s :%d %n","The value of count",count);
		}
		System.out.printf("%n Loop breaks at count = %d%n",count);
	}
}
