package com.basics;

public class StudentTest {
	public static void main(String[] args) {
		Student account1 = new Student("Arumugam", 75.00);
		Student account2 = new Student("Shalu", 98.56);
		//Redefine name 
		account1.setName("Arumugam Shanmugam");
		System.out.printf("%s's letter grade is :%s%n", account1.getName(),account1.getStudentGrade());
		System.out.printf("%s's letter grade is :%s%n", account2.getName(),account2.getStudentGrade());
	}
}
