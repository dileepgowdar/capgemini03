package com.tns.Multithreadingprogram;

class Whatsapp implements Runnable{

	@Override
	public void run() {				//runnable state
		for(int i=0;i<5;i++) {
			System.out.println("Eclipse id :"+""+Thread.currentThread().getId());
		}
		
	}
	
}



public class ImplementingRunnable {
public static void main(String[] args) {
	Whatsapp w=new Whatsapp();
	Thread obj=new Thread(w);		//new state
	obj.start();					//running state
	System.out.println("Mainid :"+""+Thread.currentThread().getId());
}
}
