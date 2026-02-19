package com.recursive.stack.dsa;

public class MainStack {
	public static void main(String[] args) {
		MyStack ms = new MyStack(5);
		ms.push(34);
		ms.push(35);
		ms.push(36);
		ms.push(37);
		
		System.out.println(ms);
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms);
		System.out.println(ms.peek());
		System.out.println(ms.peek());
		System.out.println(ms);
		System.out.println(ms.size());
		
		
	}

}
