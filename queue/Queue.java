package com.queue;

import java.util.LinkedList;

public class Queue {

LinkedList<Integer> queue = new LinkedList<Integer>();
	
	public void enqueue(int data) {
		queue.addLast(data);
	}
	
	public void display() {
		for (Integer i : queue) {
			System.out.println(" " + i);
		}
		System.out.println();
	}
}
