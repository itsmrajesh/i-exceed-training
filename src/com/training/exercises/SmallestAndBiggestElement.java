package com.training.exercises;

public class SmallestAndBiggestElement {
// Find the smallest and biggest element in a given array
	public static void main(String[] args) {
		int arr[] = { 11, 2, 3, 4, 5, 6, 7, 8, 9, -1 };
		int small = arr[0], big = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println("Smallest Element : " + small);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > big) {
				big = arr[i];
			}
		}
		System.out.println("Biggest Element : " + big);

	}

}
