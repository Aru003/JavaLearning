package com.basics;

public class Student {
	private String name;
	private double average;
	
	
	//constructor
	public Student(String name, double average) {
		super();
		this.name = name;
		if(average > 0.0)
		{
			if (average <= 100.00)
			{
				this.average = average;
			}
		}
	}
	
	//Determine student grade 
	public String getStudentGrade(){
		String letterGrade =null;
		if (average >= 90.0) {
			letterGrade = "A";
		}
		else if (average >= 80.0) {
			letterGrade = "B";
		}
		else if (average >= 70.0) {
			letterGrade = "C";
		}		
		else if (average >= 60.0) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		return letterGrade;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}
	/**
	 * @param average the average to set
	 */
	public void setAverage(double average) {
		if(average > 0.0)
			if (average <= 100.00)
				this.average = average;
	}
	
}
