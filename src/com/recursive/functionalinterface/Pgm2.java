package com.recursive.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pgm2 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Prajwal", "Harshith", "Supreeth", "Ramesh", "Suresh", "Rakesh");
		Comparator<String> descComp1 = new Comparator<String>() { // Anonymous Inner Class

			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		};
		Collections.sort(list1, descComp1);
		System.out.println(list1);

		List<String> list2 = Arrays.asList("Prajwal", "Harshith", "Supreeth", "Ramesh", "Suresh", "Rakesh");
		Comparator<String> descComp2 = (o1, o2) -> -o1.compareTo(o2);
		Collections.sort(list2, descComp2);
		System.out.println(list2);

		Comparator<String> descComp3 = (o1, o2) -> -Integer.compare(o1.length(), o2.length());
		Collections.sort(list2, descComp3);
		System.out.println(list2);

	}
}
