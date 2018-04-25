package com.hukkz.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeStringExample {
	
	public static void main(String[] args) {
		
		Set set = new TreeSet<>(new StringComparator());
		
		set.add("vignesh");
		set.add("balaji");
		set.add("raja");
		System.out.println(set);
	}

}
