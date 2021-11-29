package com.stack;

public class StackMain {

	public static void main(String[] args) {
	
		StackMethod call = new StackMethod();
		call.push(70);
		call.push(30);
		call.push(56);
		call.display();
		call.pop();
		call.peek();
		call.pop();
		call.pop();
		call.pop();
		call.display();
		
	}
	
}
