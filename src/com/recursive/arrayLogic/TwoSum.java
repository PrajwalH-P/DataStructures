package com.recursive.arrayLogic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6};
		int target  = 9;
		int[] res = twoSum(ar,target);
		System.out.println(Arrays.toString(res));
	}

	public static int[] twoSum(int[] ar, int target) {
	
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<ar.length;i++) {
			int need = target-ar[i];
			if(map.containsKey(need)) {
				return new int[] {map.get(need),i};
			}
			map.put(ar[i], i);
		}
		return new int[] {}; 
	}

}
