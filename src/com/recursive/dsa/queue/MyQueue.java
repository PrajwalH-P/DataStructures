package com.recursive.dsa.queue;

public class MyQueue {
	int[] queue;
	int capacity;
	int front,rear;
	
	public MyQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
		front = rear = -1;
	}
	public void enqueue(int ele) {
		if(rear==capacity-1) {
			System.out.println("Queue is overflow");
			return;
		}
		if(front==-1) {
			front=0;

		}
		queue[++rear]= ele;
	}
	
	public int dequeue() {
		if(front==-1) {
			System.out.println("Queue is empty");
			return 0;
		}
		int ele = queue[front++];
		if(front>rear)
			front=rear=-1;
		
		return ele;
	}
	
	public String toString() {
		String str = "[";
		for(int i=front;i<=rear;i++) {
			str = str+queue[i]+" ";
		}
		return str.trim()+"]";
	}
	
	public int size() {
		if(front==-1)
			return 0;
		return rear-front+1;
	}

}
