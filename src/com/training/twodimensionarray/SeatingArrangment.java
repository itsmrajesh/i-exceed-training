package com.training.twodimensionarray;

public class SeatingArrangment {

	public static void main(String[] args) {
		String arr[][] = { { "Jani", "Achal", "Mrudulla", "Manju", "Sourav", "Saila", "Sujith" },
				{ "Aftab", "Megha", "Aswathy", "Darshini", "Aranya", "Ankit", "Divya" },
				{ "jayeesh", "Kushboo", "Sangeetha", "Samarth" }, { "Monisha", "Ajay", "Meghana", "Rajesh" },
				{ "Soumya", "Daisy" } };

		String minString = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j].length() < minString.length())
					minString = arr[i][j];
			}
		}

		System.out.println("Minimum String : " + minString);
	}

}
