package com.training.stdinputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BiggestInArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int big = 0, num = 0, c = 10;
		System.out.println("Enter 10 elements ");
		while (c > 0) {
			num = Integer.parseInt(br.readLine());
			if (num > big) {
				big = num;
			}
			c--;
		}
		System.out.println("Biggest in array : " + big);

	}

}
