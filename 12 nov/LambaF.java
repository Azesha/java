package com.technoelevate.no2;

public class LambaF extends Thread{
	
	
	@Override
	public void run() {
		System.out.println("Run method");
		
	}
	public static void main(String[] args) {
		Itr itr =()->{
			System.out.println("This is the unimplemented method for eat");
		};
		
		
		
		itr.eat();
		LambaF f = new LambaF();
		f.start();
		
		 
		
	}
	

}
