package com.hukkz.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Example2 {

	public static void main(String[] args) {
		Vector arraylist = new Vector();
		arraylist.add(101);
		arraylist.add("vignesh");
		arraylist.add(20.75);

		Iterator itr = arraylist.iterator();

		System.out.println("inside iterator");
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		ListIterator itr1 = arraylist.listIterator();

		System.out.println("inside listiterator");
		while (itr1.hasNext()) {
			System.out.println(itr1.next());

		}
	}
}
