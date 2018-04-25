package com.hukkz.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumeratorExample {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add(101);
		vector.add("Vignesh");
		vector.add(20.44);

		Enumeration enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

		Iterator iterator = vector.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		ListIterator listiterator = vector.listIterator();
		while (listiterator.hasNext()) {
			System.out.println(listiterator.next());

		}
	}
}
