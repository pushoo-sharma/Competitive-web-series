package com.pushpak.Multithreading;

class ShowMessage extends Thread{
	// overriding run() method in java
	public void run() {
		for(int i = 0 ;i<5 ;i++) {
			System.out.println("Show Message");
			try {
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class ShowResponse extends Thread{
	// overriding run() method in java
	public void run() {
		for(int i = 0 ;i<5 ;i++) {
			System.out.println("Show Response");
			try {
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

public class MultithreadingProcess {

	public static void main(String[] args) {
		
		ShowMessage m1 = new ShowMessage();
		ShowResponse r1 = new ShowResponse();
		
		m1.start();
//		Important Statement
//		try { Thread.sleep(50); }catch(Exception e) { System.out.println(e); }
		r1.start();

	}

}
