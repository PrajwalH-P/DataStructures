package com.recursive.stack.dsa;

public class MyStack {
	int[] stk;
	int top = -1;
	int capacity;
	
	public MyStack(int capacity) {
		stk = new int[capacity];
		this.capacity = capacity;
	}
	
	void push(int ele) {
		if(top == capacity-1) {
			System.out.println("Stack is overflow");
			return;
		}
		stk[++top]=ele;
	}
	
	int pop() {
		if(top == -1)
		{
			System.out.println("Stack is underflow");
			return 0;
		}
		return stk[top--];
	}
	
	public String toString() {
		String s = "[";
		for(int i=0;i<=top;i++) {
			s = s+stk[i]+" ";
			if(i<top) {
				s=s+",";
			}
		}
		return s+"]";
	}
	
	int peek() {
		if(top == -1) {
			System.out.println("Stack is underflow");
			return 0;
		}
		return stk[top];
	}
	
	int size() {
		return top +1;
	}

}
