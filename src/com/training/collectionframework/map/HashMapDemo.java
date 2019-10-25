package com.training.collectionframework.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>(); // key-value pairs
		map.put("16cs057", "Rajesh");
		map.put("16cs066", "Mrudulla");
		map.put("16cs058", "Manju");
		map.put("16cs013", "Sachin");
		System.out.println(map);
		String key = "16cs057";
		System.out.println(map.get(key)); // one way
		Set<String> keys = map.keySet(); // second way
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(map.get(it.next()));
		}

		Set<Entry<String, String>> es = map.entrySet(); // third way
		for (Entry<String, String> kv : es) {
			if (kv.getValue().equalsIgnoreCase("sachin")) {
				System.out.println("Wonderful sachin we welcomes you");
			} else {
				System.out.println("Welcome buddy : " + kv.getValue());
			}
		}

	}

}
