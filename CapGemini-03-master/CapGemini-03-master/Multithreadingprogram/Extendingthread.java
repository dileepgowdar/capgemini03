package com.tns.Multithreadingprogram;

//Demo for Multi-threading

class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse id :"+""+Thread.currentThread().getId());
	}
}
class Onenote extends Thread{
	public void run() {
		System.out.println("Onenote id :"+""+Thread.currentThread().getId());
	}
}
class Chrome extends Thread{
	public void run() {
		System.out.println("Chrome id :"+""+Thread.currentThread().getId());
	}
}
class Youtube extends Thread{
	public void run() {
		System.out.println("Youtube id :"+""+Thread.currentThread().getId());
	}
}
public class Extendingthread {
public static void main(String[] args) {
	Eclipse e=new Eclipse ();
	e.start();
	
	Onenote o=new Onenote();
	o.start();
	
	Chrome c=new Chrome();
	c.start();
	
	Youtube y=new Youtube();
	y.start();
	
	for(int i=0;i<3;i++) {
		System.out.println("Mainid :"+""+Thread.currentThread().getId());
	}
}
}
