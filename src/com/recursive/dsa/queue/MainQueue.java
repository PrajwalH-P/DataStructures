package com.recursive.dsa.queue;

public class MainQueue {
	public static void main(String[] args) {
		MyQueue mq = new MyQueue(5);
		mq.enqueue(10);
		mq.enqueue(20);
		mq.enqueue(30);
		mq.enqueue(40);
		System.out.println(mq);
		System.out.println(mq.size());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		System.out.println(mq);
	}

}
