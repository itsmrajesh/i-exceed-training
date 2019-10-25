package com.training.exercises;

public class PrintEvenOrOdd {

	public static void main(String[] args) {
		int lowerBound = 11, higherBound = 20, i = 0;
		for (i = lowerBound; i <= higherBound; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		while (lowerBound <= higherBound) {
			if (lowerBound % 2 != 0) {
				System.out.print(lowerBound + " ");
			}
			lowerBound++;
		}
	}

}
