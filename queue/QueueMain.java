package com.queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue call = new Queue();
		
		call.enqueue(56);
		call.display();
		call.enqueue(30);
		call.display();
		call.enqueue(70);
		call.display();
		
		call.dequeue();
		call.display();
	}
}
