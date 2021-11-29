package com.stack;

import java.util.LinkedList;

public class StackMethod {

	LinkedList<Integer> stack = new LinkedList<>();
	
	public void push(int data) {
		stack.add(0, data);
	}
	
	public void pop() {
		if(stack.size() > 0)
			stack.remove(0);
		else {
			System.out.println(" Stack empty");
			return;
		}
		
		peek();
	}
	
	public void peek() {
		if(stack.size() < 1) {
			return;
		}
		System.out.println(stack.get(0));
	}
	
	public void display() {
		if (stack.size() > 0) {
		System.out.println("The Stack is\n\n");
		for (Integer i : stack) {
			System.out.println(" " + i);
		}
		System.out.println();
	}
		else {
			System.out.println("The Stack is Empty");
		}
	
}
}

