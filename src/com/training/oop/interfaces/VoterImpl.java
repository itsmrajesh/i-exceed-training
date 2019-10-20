package com.training.oop.interfaces;

public class VoterImpl implements CentralVote {
	int age;

	public VoterImpl(int age) {
		super();
		this.age = age;
	}

	@Override
	public boolean isAllowed(int age) {
		if (age >= Vote.minAge)
			return true;
		return false;
	}

	@Override
	public void doVote() {
		if (isAllowed(age))
			System.out.println("You have submitted your vote succesfully");
		else
			System.out.println("Your are under age to vote");
	}

	@Override
	public void doLocalVote() {
		if (isAllowed(age)) {
			doVote();
		}
	}

	@Override
	public void getCandiate() {
		System.out.println("Here is list of Candindates");
	}

}
