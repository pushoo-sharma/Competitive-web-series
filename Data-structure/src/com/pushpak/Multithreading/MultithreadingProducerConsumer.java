package com.pushpak.Multithreading;

//class Food 
//{
//	int bread;
//	
//	public void createBread(int bread) {
//		System.out.println("Producer produces bread no. "+ bread);
//		this.bread = bread;
//	}
//	
//	public void consumeBread() {
//		System.out.println("Consumer consumes bread no. "+ this.bread);
//	}
//}

class Food 
{
	int bread;
	boolean valueSet = false ;
	public synchronized void createBread(int bread) {
		while(valueSet) {
			try { wait(); } catch(Exception e) {}
		}
		System.out.println("Producer produces bread no. "+ bread);
		this.bread = bread;
		valueSet = true ;
		notify();
	}
	
	public synchronized void consumeBread() {
		while(valueSet) {
			System.out.println("Consumer consumes bread no. "+ this.bread);
			valueSet = false ;
		}
		notify();
	}
}

class Producer implements Runnable
{
	Food br;

	public Producer(Food br) {
		this.br = br;
		Thread t1 = new Thread(this,"Producer");
		t1.start();
	}

	@Override
	public void run() {
		int i = 0;
		while(true) {
			br.createBread(i++);
			try { Thread.sleep(1000); } catch( Exception e ) { System.out.println(e); }
		}
	}
	
}

class Consumer implements Runnable
{
	Food br;

	public Consumer(Food br) {
		this.br = br;
		
		Thread t2 = new Thread(this,"Consumers");
		t2.start();
	}

	@Override
	public void run() {
		while(true) {
			br.consumeBread();
			try { Thread.sleep(5000); } catch( Exception e ) { System.out.println(e); }
		}
	}
	
}




public class MultithreadingProducerConsumer {

	public static void main(String[] args) {
		
		Food bread = new Food();
		new Producer(bread);
		new Consumer(bread);
		
		
	}

}
