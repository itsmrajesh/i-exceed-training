package com.training.oop.interfaces;

public interface Vote {
	int minAge = 18;

	boolean isAllowed(int age);

	void doVote();
}
