package com.basics;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		
		//scanner object to get input
		Scanner sc = new Scanner(System.in);
		
		//First Account object
		System.out.print("Enter the Account name :");
		Account account = new Account(sc.nextLine());
		
		//Amount to be deposited 
		account.deposit(10.0);
		
		//2nd account object
		System.out.print("Enter the 2nd Account name with default deposit amount 5.0:");
		Account account2 =new Account(sc.nextLine(),5.0);
		
		//deposit more in 2nd account ?
		System.out.print("Do you want to deposit more in 2nd account(Y or N ?");
			if(sc.nextBoolean() == true){
		System.out.print("Enter the additional deposit amount :");
		account2.deposit(sc.nextDouble());
		}
		else{
			
		}
		
		//Print
		System.out.printf("%s %s%s%.2f%n","Name in the Account object is :" , account.getName()," balance",account.getBalance());
		System.out.printf("%s%s%s%.2f%n", "Name in account2 object is :" , account2.getName()," balance",account2.getBalance());
	}
}
