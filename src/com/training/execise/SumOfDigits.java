package com.training.execise;

public class SumOfDigits {
// Find the sum of given digits Input : 12345 Output will be : 15
	public static void main(String[] args) {
		int n = 12345;
		int rem, sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum += rem;
			n /= 10;
		}
		System.out.println("Sum of given digits : " + sum);
	}

}
