package com.pushpak.Multithreading;

class DisplayMessage implements Runnable{
	// overriding run() method in java
	public void run() {
		for(int i = 0 ;i<5 ;i++) {
			System.out.println("Display Message");
			try {
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class DisplayResponse implements Runnable{
	// overriding run() method in java
	public void run() {
		for(int i = 0 ;i<5 ;i++) {
			System.out.println("Display Response");
			try {
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

public class MultithreadingRunnableInterface {

	public static void main(String[] args) {
		
		// can be done by this
		
//		DisplayMessage m1 = new DisplayMessage();
//		DisplayResponse r1 = new DisplayResponse();
		
		// can be done by using Creating Reference of Interface and Create object of class
		
		Runnable m1 = new DisplayMessage();
		Runnable r1 = new DisplayResponse();
		
		
		// Runnable Does not contain start() method
		// Therefore we need to create the Thread
		
//		m1.start();
//		try { Thread.sleep(50); }catch(Exception e) { System.out.println(e); }
//		r1.start();
		
		
		Thread t1 = new Thread(m1); // WE BIND OBJ HERE
		Thread t2 = new Thread(r1);
		
		// If we call start it will call start method of Thread ITSELF not of CLASS
		// WE NEED BIND THREAD WITH OBJECT
		t1.start();
		try { Thread.sleep(50); }catch(Exception e) { System.out.println(e); }
		t2.start();

	}

}
