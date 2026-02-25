package com.recursive.arrayLogic;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ArrayFrequencyCount {
	public static void main(String[] args) {
		int[] arr = {23,45,65,65,34,23,5,32};
		
		frequencyCount(arr);
	}

	public static void frequencyCount(int[] arr) {
		if(arr.length==0)
			System.out.println("No elements");
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			for(int i : arr) { 
			
					map.put(i,map.getOrDefault(i, 0)+1);
				
			}
			int mfe = 0;
			int frq = 0;
			
			for(int key:map.keySet()) {
				if(map.get(key)>frq) {
					mfe = key;
					frq = map.get(key); 
				}
			}
			System.out.println(map); 
			System.out.println("Most Frequently used element is : "+mfe);
	}
}
 