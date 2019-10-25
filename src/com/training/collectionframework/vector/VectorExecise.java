package com.training.collectionframework.vector;

import java.util.Vector;

public class VectorExecise {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Bangalore");
		v.add("Chennai");
		v.add("Pune");
		v.add("Mangalore");
		v.add("New Delhi");
		int len = v.size();
		System.out.println("Displaying in reverse order : ");
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		for (int i = 0; i < len; i++) {
			if (v.get(i).equals("Pune")) {
				System.out.println("Index : " + i);
			}
		}
		String max = "", city = "";
		for (int i = 0; i < len; i++) {
			city = v.get(i);
			if (max.length() < city.length()) {
				max = city;
			}
		}
		System.out.println("Longest City String : " + max);
	}

}
