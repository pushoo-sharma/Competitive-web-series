package com.pushpak.Multithreading;

class PromptMessage{
	public void showMessage() {
		for(int i = 0 ;i<5 ;i++) {
			System.out.println("Prompt Message");
			try {
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class PromptResponse{
	public void showMessage() {
		for(int i = 0 ;i<5 ;i++) {
			System.out.println("Prompt Response");
			try {
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

public class MultithreadingIntro {

	public static void main(String[] args) {
		PromptMessage m1 = new PromptMessage();
		PromptResponse r1 = new PromptResponse();
		
		m1.showMessage();
		r1.showMessage();
	}

}
