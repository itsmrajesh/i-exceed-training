package com.training.execise;

public class MultipleOfSeven {

	public static void main(String[] args) {
		int n = 7, i = 0;
		System.out.print("Using for loop : ");
		for (i = 1; i <= 10; i++) {
			System.out.print(n * i + " ");
		}
		n = 7;
		i = 1;
		System.out.println("\nUsing while loop");
		while (i <= 10) {
			System.out.print(n * i + " ");
			i++;
		}
	}

}
