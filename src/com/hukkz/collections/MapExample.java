package com.hukkz.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put(101, "vignesh");
		map.put(102, "balaji");
		map.put(103, "surya");

		Set set = map.keySet();

		Iterator itr = set.iterator();

		/*
		 * while (itr.hasNext()) { Object key = (Object) itr.next();
		 * System.out.println("key:" + key + "value: " + map.get(key)); }
		 */
		Set set1 = map.entrySet();

		Iterator itr1 = set1.iterator();
		while (itr1.hasNext()) {
			Entry entryset = (Entry) itr1.next();
			System.out.println("key: " + entryset.getKey() + " value: " + entryset.getValue());

		}

	}
}
