package com.hukkz.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		BankAccount e1 = new BankAccount(101, "vignesh", 20100.00f);
		BankAccount e2 = new BankAccount(102, "Surya", 25000.22f);

		Map map = new HashMap();
		map.put(e1,24);
		map.put(e2, 42);

		Set set = map.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Entry entry = (Entry) itr.next();
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());

		}

	}
}
