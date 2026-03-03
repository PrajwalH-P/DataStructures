package com.recursive.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pgm1 {
	static class DescComp implements Comparator<Integer> { // static nested class

		@Override
		public int compare(Integer o1, Integer o2) {
			return -o1.compareTo(o2);
		}

	}

	class DescComparator implements Comparator<Integer> { // nonstatic nestedclass

		@Override
		public int compare(Integer o1, Integer o2) {

			return -o1.compareTo(o2);
		}

	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23, 34, 54, 21, 54, 23, 432, 22);
		Comparator<Integer> descComp = new DescComp();
		Collections.sort(list, descComp);
		System.out.println(list);

		List<Integer> list1 = Arrays.asList(23, 34, 54, 21, 54, 23, 432, 22);
		Comparator<Integer> descComp1 = new Pgm1().new DescComparator();
		Collections.sort(list1, descComp1);
		System.out.println(list1);

		List<Integer> list2 = Arrays.asList(23, 34, 54, 21, 54, 23, 432, 22);
		Comparator<Integer> descComp2 = new Comparator<Integer>() { // Anonymous Class

			@Override
			public int compare(Integer o1, Integer o2) {

				return -o1.compareTo(o2);
			}
		};
		Collections.sort(list2, descComp2);
		System.out.println(list2);

		List<Integer> list3 = Arrays.asList(23, 34, 54, 21, 54, 23, 432, 22);
		class DescendingComparator implements Comparator<Integer> { // Local Inner Class

			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}

		}
		Comparator<Integer> descComp3 = new DescendingComparator();
		Collections.sort(list3, descComp3);
		System.out.println(list3);

	}
}
