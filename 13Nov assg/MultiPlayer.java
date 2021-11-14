package com.technoelevate.musicplayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MultiPlayer {
	   static ArrayList<String> list = new ArrayList<String>();
	   
	
	   
	public static void main(String[] args) {
		list.add("Cooler than me");
		list.add("Trempoline");
		list.add("OutOf");
		   
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to play a song or 2 to search a song  or 3 to operate on multiplayer");
		int i = sc.nextInt();
		switch(i) {
		case 1:System.out.println("play a song");
		 MultiPlayer out = new MultiPlayer();
		 out.play();
		break;
		
		case 2: System.out.println("Search a song");
		MultiPlayer multiPlayer = new MultiPlayer();
		multiPlayer.search();
		break;
		
		case 3: System.out.println("Operate on multiplayer");
		MultiPlayer multiPlayer2 = new MultiPlayer();
		multiPlayer2.operate();
		break;
		default: System.out.println("enter a valid input");
		
		}
		
	}
	void play() {
		
		System.out.println("Enter 1 or 2 or 3");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		switch(p) {
		
		case 1: System.out.println("play all song");
		for(int i =0; i < list.size();i++) {
			System.out.println(list.get(i));
		}       
		break;
		
		case 2: System.out.println("play a random song");
		Collections.shuffle(list);
		System.out.println(list.get(1));
		break;
		
		case 3: System.out.println("play a specific song enter 1 or 2 or 3");
		int i = sc.nextInt();
		if(i == 1) {
			System.out.println(list.get(0));
		}else if (i == 2) {
			System.out.println(list.get(1));
			
		}else if (i == 3) {
			System.out.println(list.get(2));
			}
		
		break;
		         
		}
	}
	
	void search() {
		System.out.println("which song you want to search 1.Cooler than me 2.Trempoline 3.OutOf");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		
		
		switch(i) {
		
		case 1: System.out.println("searching for first song");
		if(i == 1) {
		 System.out.println("The first song is present at:" +" "+list.indexOf("Cooler than me"));
		}
		 break;
		 
		case 2: System.out.println("searching for second song");
		 System.out.println("The second song is present at: "+" "+ list.indexOf("Trempoline"));
		 break;
		 
		case 3: System.out.println("searching for third song");
		 System.out.println("The second song is present at:" +" "+list.indexOf("OutOf"));
		 break;
		
		
		
		
	}

	}
	
	void operate() {
		System.out.println("press 1 to add a song and press 2 to delete a song");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i == 1) {
			System.out.println("Enter the song name: ");
			String s = sc.next();
			list.add(i, s);
			System.out.println("Now the updated list is"+ list);
		}else {
			System.out.println("enter the name you want to delete");
			String s = sc.next();
			if(list.contains(s)) {
				list.remove(i);
				System.out.println("Now the updated list is"+ list);
			}else {
				System.out.println("The song is not present");
			}
		}
		
	}
	}



