package com.technoelevate.assignment;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int x = sc.nextInt();
		System.out.println("Enter another value");
		int y = sc.nextInt();
		int sum = x + y;
		int sub = x - y;

		int mul = x * y;
		System.out.println(sum);
		System.out.println(sub);

		System.out.println(mul);
		try {

			int div = x / y;
			System.out.println(div);

		} catch (ArithmeticException a) {
			System.out.println("Exception handled for division");

		}

	}

}
