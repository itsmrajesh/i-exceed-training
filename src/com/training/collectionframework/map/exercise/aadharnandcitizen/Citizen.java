package com.training.collectionframework.map.exercise.aadharnandcitizen;

public class Citizen {
	private long aadharID;
	private String name;
	private String panNumber;
	private int flatNo;
	private String city;
	private String streetName;
	private int pinCode;

	public Citizen(long aadharID, String name, String panNumber, int flatNo, String city, String streetName,
			int pinCode) {
		super();
		this.aadharID = aadharID;
		this.name = name;
		this.panNumber = panNumber;
		this.flatNo = flatNo;
		this.city = city;
		this.streetName = streetName;
		this.pinCode = pinCode;
	}

	public long getAadharID() {
		return aadharID;
	}

	public void setAadharID(long aadharID) {
		this.aadharID = aadharID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public void displayInfo() {
		System.out.println("---------------------");
		System.out.println("Name : " + name);
		System.out.println("Aadhar : " + aadharID);
		System.out.println("Pan : " + panNumber);
		System.out.println("Flat no : " + flatNo);
		System.out.println("City : " + city);
		System.out.println("Pincode : " + pinCode);
		System.out.println("---------------------");		
	}
}
