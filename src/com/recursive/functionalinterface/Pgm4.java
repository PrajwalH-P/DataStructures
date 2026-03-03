package com.recursive.functionalinterface;

import java.util.function.Predicate;

public class Pgm4 {
	public static void main(String[] args) {
		Predicate<Integer> isPrimeChecker = (n)->{
			if(n<=1) return false;
			for(int i=2;i*i<=n;i++) {
				if(n%i==0)return false;
			}
			return true;
		};
		System.out.println(isPrimeChecker.test(16));
		System.out.println(isPrimeChecker.test(3));
	}

}
