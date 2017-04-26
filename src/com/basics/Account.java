package com.basics;

public class Account {
	private String name;
	private double balance;

	// constructor 1
	public Account(String name) {
		setName(name);
	}

	// Constructor 2
	public Account(String name, double balance) {
		this.name = name;

		if (balance > 0.0) {
			setBalance(balance);
		}
	}
	
	//deposit
	public void deposit(double depositAmount){
		if (depositAmount > 0.0){
			balance = balance + depositAmount;
		}
		
	}

	// get name
	public String getName() {
		return name;
	}

	// set name
	public void setName(String name) {
		this.name = name;
	}

	//get Balance
	public double getBalance() {
		return balance;
	}

	//Set balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
