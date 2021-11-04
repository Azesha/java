package com.technoelevate.assignment;

public class EligibleForVote {
	int age;

	public EligibleForVote(int age) {

		this.age = age;
	}

	public void check(int age) throws notEligible {
		if (age > 18) {

			System.out.println("You can Vote");

		}else {
			throw new  notEligible("you are not 18");
		}
	}
	
	public static void main(String[] args) {
		EligibleForVote eligibleForVote = new EligibleForVote(9);
		
	}

}
