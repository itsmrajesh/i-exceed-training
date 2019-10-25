package com.training.collectionframework.map;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>(); // key-value pairs and maintains data
																					// insertion order
		map.put("16cs057", "Rajesh");
		map.put("16cs058", "Manju");
		map.put("16cs066", "Mrudulla");
		map.put("16cs013", "Sachin");
		System.out.println(map);

	}

}
