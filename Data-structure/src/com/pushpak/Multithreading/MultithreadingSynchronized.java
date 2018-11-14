package com.pushpak.Multithreading;


// Use synchronized keyword 
// to make it happen :)
class Counter 
{
	int counter ;
	
	public void increment() {
		counter++ ;
	}
}

public class MultithreadingSynchronized {

	public static void main(String[] args) throws Exception {
		
		Counter c1 = new Counter();
		
		Thread t1 = new Thread(()-> {
			for(int i = 0 ; i< 500 ; i++) {
				c1.increment();
			}
		});
		
		Thread t2 = new Thread(()-> {
			for(int i = 0 ; i< 500 ; i++) {
				c1.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("I m main Thread");
		
		System.out.println("Counter is "+ c1.counter);

	}

}
