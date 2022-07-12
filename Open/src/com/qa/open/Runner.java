package com.qa.open;

public class Runner {
public static void main(String[] args) {
		
		CasualGreeting casual = new CasualGreeting();
		FormalGreeting formal = new FormalGreeting();
		
		//Greeting hello = new Greeting();
		
		Greeter casualgreeter = new Greeter(casual);
		Greeter formalgreeter = new Greeter(formal);
		//Greeter greeter = new Greeter(hello);
		
		System.out.println(casualgreeter.greet());
		System.out.println(formalgreeter.greet());
		//System.out.println(greeter.greet());
	}
}
