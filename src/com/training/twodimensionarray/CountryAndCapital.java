package com.training.twodimensionarray;

public class CountryAndCapital {

	public static void main(String[] args) {
		String country[] = { "India", "Nepal", "USA" };
		String capital[] = { "New Delhi", "kathamandu", "WashingTon DC" };
		int i = 0;
		for (i = 0; i < country.length; i++) {
			if (country[i].equalsIgnoreCase(args[0])) {
				break;
			}
		}
		if (i < country.length) {
			System.out.println(args[0]+" Capital is " + capital[i]);
		} else
			System.out.println("Country not found");
	}

}
