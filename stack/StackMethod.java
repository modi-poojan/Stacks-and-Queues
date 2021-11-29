package com.stack;

import java.util.LinkedList;

public class StackMethod {

	LinkedList<Integer> stack = new LinkedList<>();
	
	public void push(int data) {
		stack.add(0, data);
	}
	
	public void display() {
		System.out.println("The Stack is\n\n");
		for (Integer i : stack) {
			System.out.println(" " + i);
		}
		System.out.println();
	}
	
}

