package com.pushpak.Multithreading;

// NOTE : We can't instantiate Obj from interface we can only do it with class
// Here we are using Anonymous class 


public class MultiThreadingLamdaExpression {

	public static void main(String[] args) {
		
		// Anonymous Class
		
//		Runnable m1 = new Runnable() {
//			public void run() {
//				for(int i = 0 ;i<5 ;i++) {
//					System.out.println("Display Message");
//					try {
//						Thread.sleep(500);
//					}catch(Exception e){
//						System.out.println(e);
//					}
//				}
//			}
//		};
//		
//		
//		Runnable m2 = new Runnable() {
//			public void run() {
//				for(int i = 0 ;i<5 ;i++) {
//					System.out.println("Display Response");
//					try {
//						Thread.sleep(500);
//					}catch(Exception e){
//						System.out.println(e);
//					}
//				}
//			}
//		};
		
		// We can even use Lambda Expression BECAUSE RUNNABLE IS FUNCTIONAL INTERFACE (SEE DOCUMENTATION FOR DETAIL)
		
		Runnable m1 = () -> {
				for(int i = 0 ;i<5 ;i++) {
					System.out.println("Display Message");
					try {
						Thread.sleep(500);
					}catch(Exception e){
						System.out.println(e);
					}
				}
		};
		
		
		Runnable m2 = () -> {
				for(int i = 0 ;i<5 ;i++) {
					System.out.println("Display Response");
					try {
						Thread.sleep(500);
					}catch(Exception e){
						System.out.println(e);
					}
				}
		};
		
		// WE CAN EVEN MAKE IT SHORTER BY REPLACING m1 and m2 With Lambda Expression
		
		
		Thread t1 = new Thread(m1); // WE BIND OBJ HERE
		Thread t2 = new Thread(m2);
		
		
		t1.start();
		try { Thread.sleep(50); }catch(Exception e) { System.out.println(e); }
		t2.start();

	}

}
