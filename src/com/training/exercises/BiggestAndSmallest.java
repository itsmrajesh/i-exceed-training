package com.training.exercises;

public class BiggestAndSmallest {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Smallest : " + findSmallest(a, b));
		System.out.println("Big : " + findBiggest(a, b));
	}

	private static int findSmallest(int a, int b) {
		return a > b ? b : a;
	}

	private static int findBiggest(int a, int b) {
		return a > b ? a : b;
	}

}
