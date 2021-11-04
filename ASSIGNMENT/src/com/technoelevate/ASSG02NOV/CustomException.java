package com.technoelevate.assignment;

import java.util.Scanner;

public class CustomException {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();	
		
		try {
			if(age > 18) {
				System.out.println("You are eligible for marraige");
			}
		}catch(Exception e) {
			System.out.println("You are not eligible for marraige");
		}
		
	}

}
