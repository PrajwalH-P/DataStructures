package com.recursive.arrayLogic;

import java.util.Arrays;

public class MoveZeroesToEnd {
	public static void main(String[] args) {
		int[] a = {1,2,0,45,0,32,4,53,0,78};
		
		int nonZeroIndex = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[nonZeroIndex] = a[i];
				nonZeroIndex++;
			}
		}
		while(nonZeroIndex<a.length) {
			a[nonZeroIndex]=0;
			nonZeroIndex++;
		}
		System.out.println(Arrays.toString(a));
	}
}
