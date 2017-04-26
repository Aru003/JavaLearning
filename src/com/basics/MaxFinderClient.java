package com.basics;

public class MaxFinderClient {
	public static void main(String[] args) {
		double x = 1.23;
		double y = 2.345;
		double z = 0.456;
		double result = MaxiumumFinder.maxiumumFinder(x, y, z);
		System.out.println("Result using MaxFinder :" + result);
		System.out.println("Result using Math.Max " + Math.max(x, Math.max(y,z)));
		//MaxiumumFinder.main(args);
		System.out.println("Absolute value of result is :" + Math.ceil(result));
	}
}
