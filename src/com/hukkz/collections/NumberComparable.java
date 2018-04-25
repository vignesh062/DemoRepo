package com.hukkz.collections;

import java.util.Comparator;

public class NumberComparable implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer id1 =(Integer) o1;
		Integer id2 =(Integer) o2;
		return id2-id1;
	}

}
