package com.basics;

public class ContinueTest {
	public static void main(String[] args) {
		for(int count = 1;count <=3;++count){
			if (count ==2) {
				continue;
			}
			System.out.printf("%s : %d %n","The value of count",count);
		}
		System.out.printf("%nUsed continue to skip the counter at 5%n");
	}
}
