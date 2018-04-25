package com.hukkz.collections;

import java.util.List;
import java.util.Stack;

public class ArrayListExample {

	public static void main(String[] args) {

		List list = new Stack();
		list.add(101);
		list.add("vignesh");
		
		list.add(23.78);
		list.add(101);
		list.add("vignesh");
		list.add(null);
		list.remove("vignesh");

		System.out.println(list);
		
		for(Object object: list)
		{
			System.out.println(object);
		}

	}
}
