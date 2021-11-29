package com.queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enqueue(56);
		q.display();
		q.enqueue(30);
		q.display();
		q.enqueue(70);
		q.display();
	}
}
