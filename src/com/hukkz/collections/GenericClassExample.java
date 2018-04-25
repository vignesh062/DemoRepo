package com.hukkz.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericClassExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(100);
		list.add(42);
		list.add(52);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}
}
