package com.hukkz.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set set = new TreeSet<>(new NumberComparable());

		set.add(123);
		set.add(432);
		set.add(1);
		set.add(3);
		
		System.out.println(set);

	}
}
