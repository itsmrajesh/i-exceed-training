package com.training.collectionframework.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet(); // maintains user data order
		ls.add("Bangalore");
		ls.add("Mysore");
		ls.add("Chikmanagalur");
		ls.add("Pune");
		System.out.println(ls);
	}

}
