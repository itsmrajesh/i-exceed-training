package com.training.twodimensionarray;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayOfColors {

	public static void main(String[] args) throws NumberFormatException, Exception {
		String[][] arr = { { "red", "orange", "red" }, { "green", "green", "green" }, { "orange", "white", "red" } };
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter rows and colmns");
		int row = Integer.parseInt(br.readLine());
		int col = Integer.parseInt(br.readLine());
		boolean valid = isValid(row, col, arr);
		String color1 = "", color2 = "";// = arr[row][col];
		if (valid) {
			color1 = arr[row][col];
		} else {
			System.out.println("Given location is out of range, give within the range ");
		}
		row = Integer.parseInt(br.readLine());
		col = Integer.parseInt(br.readLine());
		valid = isValid(row, col, arr);
		if (valid) {
			color2 = arr[row][col];
		} else {
			System.out.println("Given location is out of range, give within the range ");
		}
		if (valid)
			if (color1.equalsIgnoreCase(color2)) {
				System.out.println("Winner");
			} else {
				System.out.println("Better Luck next time");
			}
	}

	private static boolean isValid(int row, int col, String[][] arr) {
		if (row < arr.length && col < arr[0].length) {
			return true;
		}
		return false;
	}

}
