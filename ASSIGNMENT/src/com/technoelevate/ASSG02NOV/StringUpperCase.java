package com.technoelevate.assignment;

public class StringUpperCase {
	public static void main(String[] args) {
		String str = "abc xyz hij";
		String words[] = str.split("\\s");
		String capitalizeStr = "";
		for(String word:words) {
			String firstletter = word.substring(0,1);
			String remainingLetter = word.substring(1);
			capitalizeStr+=firstletter.toUpperCase()+remainingLetter+" ";
			
		}
		System.out.println(capitalizeStr);
		
	}

}
