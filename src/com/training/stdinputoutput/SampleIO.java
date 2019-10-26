package com.training.stdinputoutput;

import java.io.*;

public class SampleIO {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		/*
		 * System.out.println("Enter your Name : "); String name = br.readLine();
		 * System.out.println("Welcome " + name);
		 */
		System.out.println("Enter two values to find sum : ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println("Sum : " + (a + b));
	}

}
