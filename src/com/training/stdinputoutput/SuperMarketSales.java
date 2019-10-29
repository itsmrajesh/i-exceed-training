package com.training.stdinputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SuperMarketSales {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		double sale = 0.0, totalSale = 0.0;
		int count = 0, noOfProducts = 10;
		double[] sales = new double[noOfProducts];
		System.out.println("Welcome manager :");
		while (count < noOfProducts) {
			System.out.println("Enter sale " + (count + 1) + " : ");
			sale = Double.parseDouble(br.readLine());
			sales[count++] = sale;
			totalSale += sale;
		}
		Arrays.sort(sales);
		System.out.println("Total Sale for " + noOfProducts + " days : " + totalSale);
		double lowestSale = getLowestSale(sales);
		System.out.println("Lowest Sale : " + lowestSale);
		double highestSale = gethighestSale(sales);
		System.out.println("Highest Sale : " + highestSale);
		System.out.println("-----------------------------");
		showSalesBelow(sales);
		System.out.println("-----------------------------");
		showSalesAbove(sales);
		System.out.println("-----------------------------");
	}

	private static void showSalesAbove(double[] sales) {
		System.out.println("Sales above 200");
		for (int i = 0; i < sales.length; i++) {
			if (sales[i] >= 200.00) {
				System.out.println(sales[i]);
			}
		}
	}

	private static void showSalesBelow(double[] sales) {
		System.out.println("Sales below 200");
		for (int i = 0; i < sales.length; i++) {
			if (sales[i] <= 200.00) {
				System.out.println(sales[i]);
			}
		}
	}

	private static double gethighestSale(double[] sales) {
		return sales[sales.length - 1];
	}

	private static double getLowestSale(double[] sales) {
		return sales[0];
	}

}
