package com.basics.dataTypes;

public class Light {
	public static void main(String[] args) {
		int lightspeed;
		long distance;
		long days;
		long seconds;
		
		lightspeed = 186000; // light travels 186000 miles per second
		days = 1000; 
		seconds = days * 24* 60 * 60; 
		distance = lightspeed * seconds;
		System.out.print("In "+ days + " Light can travel " + distance + " Miles");
	}
}
