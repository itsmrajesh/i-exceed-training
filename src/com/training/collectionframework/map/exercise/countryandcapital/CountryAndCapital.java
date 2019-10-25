package com.training.collectionframework.map.exercise.countryandcapital;

import java.util.HashMap;

public class CountryAndCapital {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		String country[] = { "India", "Nepal", "USA" };
		String capital[] = { "New Delhi", "kathamandu", "WashingTon DC" };
		int i = 0;
		for (i = 0; i < country.length; i++) {
			map.put(country[i], capital[i]);
		}
		System.out.println(map);
		String key = "Pakistan";
		if (map.get(key) != null) {
			System.out.println(key + "'s capital is " + map.get(key));
		} else {
			System.out.println("Country not found ");
		}
	}

}
