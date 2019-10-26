package com.training.stdinputoutput.product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDriver {

	public static void main(String[] args) throws IOException, SQLException {
		int c = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String name;
		double price;
		String category;
		Product product;
		ArrayList<Product> list = new ArrayList<Product>();
		while (c < 2) {
			System.out.println("Count : " + (c + 1));
			System.out.println("Enter product name : ");
			name = br.readLine();
			System.out.println("Enter product price :");
			price = Double.parseDouble(br.readLine());
			System.out.println("Enter product category :");
			category = br.readLine();
			product = new Product(name, price, category);
			list.add(product);
			c++;
		}
		printArrayList(list);
		findCheapestProduct(list);
		findCostliestProduct(list);
		insertIntoDB(list);
	}

	private static void insertIntoDB(ArrayList<Product> list) throws SQLException {
		ConnectDB db = new ConnectDB();
		for (int i = 0; i < list.size(); i++) {
			db.insert(list.get(i));
		}
	}

	private static void printArrayList(ArrayList<Product> list) {
		Product product;
		System.out.println("Displaying all products information");
		for (int i = 0; i < list.size(); i++) {
			product = list.get(i);
			product.showProductInfo();
		}
	}

	private static void findCostliestProduct(ArrayList<Product> list) {
		double price = 0.0, p = 0.0;
		Product product, costliestProduct = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			product = list.get(i);
			p = product.getPrice();
			if (p > price) {
				p = price;
				costliestProduct = product;
			}
		}
		System.out.println("Costliest Product details : ");
		costliestProduct.showProductInfo();
	}

	private static void findCheapestProduct(ArrayList<Product> list) {
		double price = list.get(0).getPrice(), p = 0.0;
		Product product, cheapestProduct = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			product = list.get(i);
			p = product.getPrice();
			if (p < price) {
				p = price;
				cheapestProduct = product;
			}
		}
		System.out.println("Cheapest Product details : ");
		cheapestProduct.showProductInfo();
	}

}
