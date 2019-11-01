package com.training.exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberInWords {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Number : ");
		int n = 0;// Integer.parseInt(br.readLine());
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("Enter only integer values ");
		}

		if (n >= 1 && n <= 99) {
			String res = displayToWord(n);
			System.out.println(res);
		} else {
			System.out.println("Input should be only 2 digit number and only postive number only ");
		}
	}

	private static String displayToWord(int n) {
		String res;
		int first = n / 10;
		int last = n % 10;
		String ones[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
		String arr[] = { "", "eleven", "twelve", "thirteen", "fourteen", "fiften", "sixteen", "seventeen", "eighteen",
				"nineteen", "twenty" };
		res = ones[first];
		if (n <= 10) {
			if (n == 10) {
				return "Ten";
			}
			return ones[first] + ones[last];
		}
		if (n > 20) {
			res += "ty " + ones[last];
		} else {
			res = arr[n - 10];
		}
		return res;
	}

}
