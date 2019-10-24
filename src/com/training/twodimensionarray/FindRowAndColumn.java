package com.training.twodimensionarray;

public class FindRowAndColumn {
  // given row and column find the student who sitting 
	public static void main(String[] args) {
		String arr[][] = { { "Jani", "Achal", "Mrudulla", "Manju", "Sourav", "Saila", "Sujith" },
				{ "Aftab", "Megha", "Aswathy", "Darshini", "Aranya", "Ankit", "Divya" },
				{ "jayeesh", "Kushboo", "Sangeetha", "Samarth" }, { "Monisha", "Ajay", "Meghana", "Rajesh" },
				{ "Soumya", "Daisy" } };
		int row = Integer.parseInt(args[0]); // input is from command line arguments
		int col = Integer.parseInt(args[1]); // input is from command line arguments
		int rowMax = arr.length;
		int colMin = 0, colMax = 0;
		for (int i = 0; i < arr.length; i++) {
			int len = arr[i].length;
			if (len > colMax)
				colMax = len;

		}
		System.out.println(rowMax);
		System.out.println(colMin);
		System.out.println(colMax);
		System.out.println(row);
		System.out.println(col);
		if (row < rowMax && (col >= colMin && col < colMax))
			System.out.println(
					"Student Sitting at position row : " + row + " Column : " + col + " : is " + arr[row][col]);
		else
			System.out.println("Out of Postion");
	}

}
