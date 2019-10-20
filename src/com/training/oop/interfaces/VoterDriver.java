package com.training.oop.interfaces;

public class VoterDriver {

	public static void main(String[] args) {
		CentralVote vote = new VoterImpl(17);
		vote.doVote();
		vote = new VoterImpl(20);
		vote.doVote();
		vote.getCandiate();

	}

}
