package com.training.execise;

public class SeriesPrint {

	public static void main(String[] args) {
		int n = 10;
		int a = 0;
		for (int i = 1; i < n; i++) {
			 System.out.print(a+" ");
			for (int j = 0; j < i; j++) {
				a++;
			}
		}
		System.out.println("nth number is :" + a); // for nth number
	}

}
