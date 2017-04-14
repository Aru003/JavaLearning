package com.basics;

public class LogicOperators1 {
	public static void main(String[] args) {
		System.out.println("Conditional && operator");
		System.out.printf("%s%b%n","false&&false :",(false&&false)  );
		System.out.printf("%s%b%n","false&&true  :",(false&&true) );
		System.out.printf("%s%b%n","true&&false  :",(true&&false) );
		System.out.printf("%s%b%n%n","true&&true :",(true&&true) );
		
		System.out.println("Conditional || operator");
		System.out.printf("%s%b%n","false||false :",(false||false)  );
		System.out.printf("%s%b%n","false||true  :",(false||true) );
		System.out.printf("%s%b%n","true||false  :",(true||false) );
		System.out.printf("%s%b%n%n","true||true :",(true||true) );	

		
		System.out.println("Boolean & operator");
		System.out.printf("%s%b%n","false&false :",(false&false)  );
		System.out.printf("%s%b%n","false&true  :",(false&true) );
		System.out.printf("%s%b%n","true&false  :",(true&false) );
		System.out.printf("%s%b%n%n","true&true :",(true&true) );

		System.out.println("Boolean | operator");
		System.out.printf("%s%b%n","false|false :",(false|false)  );
		System.out.printf("%s%b%n","false|true  :",(false|true) );
		System.out.printf("%s%b%n","true|false  :",(true|false) );
		System.out.printf("%s%b%n","true|true   :",(true|true) );
		
		//reverse 
		System.out.println("reverse(!) operator");
		System.out.printf("%s%b%n","!false :",(!false)  );
		System.out.printf("%s%b%n","!true :",(!true)  );
	}
}
