package com.training.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			System.out.println(2 / 0);
		} catch (Exception e) {
			System.out.println(e.getMessage() + " error");
		} finally {
			System.out.println("Always Executes finally");
		}

		int arr[] = new int[5];
		try {
			System.out.println(arr[7]); // trying to access out of bound element
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
