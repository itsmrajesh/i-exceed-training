 	package com.training.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Bangalore");
		hs.add("Chennai");
		hs.add("Pune");
		hs.add("Mangalore");
		hs.add("Bangalore");
		System.out.println("Hashset 1 : " + hs);
		HashSet hs2 = new HashSet();
		hs2.add("raichur");
		hs2.add("chickballpur");
		hs2.add("devanahalli");
		System.out.println("Hashset 2 : " + hs2);
		hs.addAll(hs2);
		System.out.println("Hashset 1 and 2 : " + hs);
		/*
		 * Iterator it = hs.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		hs.clear(); // removes all elements in set
		String[] arr = { "Bangalore", "Chennai", "Pune", "Mangalore", "Bangalore", "Mangalore" };
		System.out.println("Hashset 1 before adding new elements : " + hs);
		hs2.clear(); // removes all elements in set
		System.out.println("------------------------------");
		for (String s : arr) {
			if (hs.add(s)) {
			} else {
				hs2.add(s);
			}
		}
		System.out.println("------------------------------------");
		System.out.println("Hashset 1 after elements added : " + hs);
		System.out.println("Duplicated cities : " + hs2);

	}

}
