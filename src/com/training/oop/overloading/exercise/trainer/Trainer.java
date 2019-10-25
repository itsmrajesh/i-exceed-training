package com.training.oop.overloading.exercise.trainer;

public class Trainer {
	String trainerName;
	String location;

	public Trainer(String trainerName, String location) {
		super();
		this.trainerName = trainerName;
		this.location = location;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public String getLocation() {
		return location;
	}

}
