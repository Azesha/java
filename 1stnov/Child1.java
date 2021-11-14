package com.technoelevate.polymo;

public class Child1 extends Parent1 {

	@Override
	void play1() {
		System.out.println("play more");
	}

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.play1();

	}

}
