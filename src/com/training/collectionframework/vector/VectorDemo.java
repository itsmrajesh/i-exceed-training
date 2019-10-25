package com.training.collectionframework.vector;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// Creating vector of Heterogeneous
		Vector vector = new Vector(5, 2); // 5 is initial capacity and 2 is increment
		vector.add("Rajesh");
		vector.add("Mrudulla");
		vector.add("Achal");
		vector.add("Manju");
		vector.add("Sujith");
		System.out.println(vector);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		vector.add("Guru");
		vector.add("Hemanth");
		vector.add("Gokul");
		vector.add("Divya");
		vector.add("Divya");
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i)+",");
		}
		

	}

}
