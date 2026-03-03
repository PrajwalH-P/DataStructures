package com.recursive.functionalinterface;

import java.util.function.Predicate;

public class Pgm3 {
	public static void main(String[] args) {
	
		Predicate<Integer> evenOrOdd = (t)->t%2==0;
		System.out.println(evenOrOdd.test(10));
		
		System.out.println(evenOrOdd.test(3));
	}

	

}
