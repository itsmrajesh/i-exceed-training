package com.training.execise;

public class PyramidOddPrint {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i < n+4; i += 2) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
