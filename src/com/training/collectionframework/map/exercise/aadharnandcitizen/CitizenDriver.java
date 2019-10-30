package com.training.collectionframework.map.exercise.aadharnandcitizen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CitizenDriver {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		Map<Long, Citizen> map = new HashMap<>();
		List<Citizen> list = new ArrayList<Citizen>();

		long aadharID;
		String name;
		String panNumber;
		int flatNo;
		String city;
		String streetName;
		int pinCode;
		Citizen citizen = null;
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter details for Citizen : " + (i + 1));
			System.out.println("Enter aadhar number : ");
			aadharID = Long.parseLong(br.readLine());
			System.out.println("Enter Name : ");
			name = br.readLine();
			System.out.println("Enter PanNumber : ");
			panNumber = br.readLine();
			System.out.println("Enter FlatNumber : ");
			flatNo = Integer.parseInt(br.readLine());
			System.out.println("Enter streetName : ");
			streetName = br.readLine();
			System.out.println("Enter city : ");
			city = br.readLine();
			System.out.println("Enter pincode : ");
			pinCode = Integer.parseInt(br.readLine());
			citizen = new Citizen(aadharID, name, panNumber, flatNo, city, streetName, pinCode);
			map.put(aadharID, citizen);
			list.add(citizen);
		}
		System.out.println("Displaying all info :");
		for (Citizen c : list) {
			c.displayInfo();
		}
		System.out.println("----------**************************----------------------------");
		for (int i = 0; i < map.size(); i++) {
			System.out.println("Enter aadhar ID to search : ");
			aadharID = Long.parseLong(br.readLine());
			citizen = findUsingAadharID(map, aadharID);
			if (citizen != null) {
				System.out.println("Citizen details for aadhar id : " + aadharID);
				citizen.displayInfo();
			} else {
				System.out.println("No Data found for aadhar id : " + aadharID);
			}

		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println("Enter PAN Number to search : ");
			panNumber = br.readLine();
			citizen = findUsingPanNumber(list, panNumber);
			if (citizen != null) {
				System.out.println("Citizen details for PAN Number  : " + panNumber);
				citizen.displayInfo();
			} else {
				System.out.println("No Data found for PAN Number  : " + panNumber);
			}
		}
		
		System.out.println("Thank you using our application!!!!!");

	}

	private static Citizen findUsingPanNumber(List<Citizen> list, String panNumber) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPanNumber().equalsIgnoreCase(panNumber)) {
				return list.get(i);
			}
		}
		return null;
	}

	private static Citizen findUsingAadharID(Map<Long, Citizen> map, long key) {
		return map.get(key);
	}

}
