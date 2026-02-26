package com.recursive.arrayLogic;

import java.util.Map;
import java.util.TreeMap;

public class CharacterFrequency {
	public static void main(String[] args) {
		String str = "Hello";
		getCharacterFrequency(str);
	}

	public static void getCharacterFrequency(String str) {
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		int repeatedTimes = 0;

		char[] c = str.toCharArray();
		char mfe = c[0];
		for (char ch : c) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}
		for (char key : map.keySet()) {
			if (repeatedTimes < map.get(key)) {
				mfe = key;
				repeatedTimes = map.get(key);
			}
		}
		System.out.println(mfe);
		System.out.println(map);
		System.out.println(repeatedTimes);
	}

}
