package com.training.exercises;

public class LongestString {
// Find the longest string in a given array of strings 
// Take input from command line 	
	public static void main(String[] args) {
		String s = "";
		for (int i = 0; i < args.length; i++) {
			if (args[i].length() > s.length()) {
				s = args[i];
			}
		}
		System.out.println("Longest : " + s);
	}

}
