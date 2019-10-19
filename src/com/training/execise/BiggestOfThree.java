package com.training.execise;

public class BiggestOfThree {

	public static void main(String[] args) {
		int a, b, c, big = 0;
		a = 20;
		b = 20;
		c = 20;
		if (a > b && a > c) {
			big = a;
		} else if (b > a && b > c) {
			big = b;
		} else if (c > a && c > b) {
			big = c;
		} else if (a == b && a == c) {
			System.out.println("All are equal ");
			big = a;
		}
		System.out.println("Biggest is " + big);
	}

}
