package com.pushpak.Multithreading;

public class MultithreadingIsAliveAndJoin{

	public static void main(String[] args) throws Exception {

		
		Thread t1 = new Thread(() -> {
			for(int i = 0 ;i<5 ;i++) {
				System.out.println("Display Message");
				try {
					Thread.sleep(500);
				}catch(Exception e){
					System.out.println(e);
				}
			}
		}); 
		
		Thread t2 = new Thread(() -> {
			for(int i = 0 ;i<5 ;i++) {
				System.out.println("Display Response");
				try {
					Thread.sleep(500);
				}catch(Exception e){
					System.out.println(e);
				}
			}
		});
		
		
		t1.start();
		try { Thread.sleep(50); }catch(Exception e) { System.out.println(e); }
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println(t1.isAlive());
		
		System.out.println("I am Main Thread");

	}

}
