package com.training.oop.overloading.exercise.trainer;

public class TrainerDriver {

	public static void main(String[] args) {
		JavaTrainer jt = new JavaTrainer("Lakshman", "Bangalore");
		PHPTrainer pt = new PHPTrainer("Arun", "Chennai");
		PythonTrainer pyt = new PythonTrainer("Rajesh", "Raichur");

		train(jt);
		train(pt);
		train(pyt);
	}

	private static void train(PythonTrainer pyt) {
		System.out.println("Name : " + pyt.getTrainerName());
		System.out.println("Location : " + pyt.getLocation());
		System.out.println("This Trainer can teach only Python");
		System.out.println("-----------------------------------");
	}

	private static void train(PHPTrainer pt) {
		System.out.println("Name : " + pt.getTrainerName());
		System.out.println("Location : " + pt.getLocation());
		System.out.println("This Trainer can teach only PHP");
		System.out.println("-----------------------------------");
	}

	private static void train(JavaTrainer jt) {
		System.out.println("Name : " + jt.getTrainerName());
		System.out.println("Location : " + jt.getLocation());
		System.out.println("This Trainer can teach only java");
		System.out.println("-----------------------------------");
	}

}
