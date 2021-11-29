package com.queue;

import java.util.LinkedList;

public class Queue {

LinkedList<Integer> queue = new LinkedList<Integer>();
	
	public void enqueue(int data) {
		queue.addLast(data);
	}
	
	public void dequeue() {
		if (queue.size() < 1) 
			System.out.println(" Queue is empty!");
		else
			queue.remove();
	}
	
	public void display() {
		for (Integer i : queue) {
			System.out.println(" " + i);
		}
		System.out.println();
	}
}
