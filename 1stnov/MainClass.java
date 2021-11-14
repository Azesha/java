package com.technoelevate.encapsulation;

public class MainClass extends Encap {
	public static void main(String[] args) {
		Encap encap = new Encap();
		System.out.println(encap.getCompany());
		System.out.println(encap.setTiming(5));
		encap.getTopic();

	}

}
