package com.tns.Abstract;

abstract class Whatsapp{
	abstract void sendMessage(String message);
	
}

class MsgSend extends Whatsapp{

	@Override
	void sendMessage(String message) {
		// TODO Auto-generated method stub
		int Number=1234567891;
		System.out.println("sending msg To :"+Number );
		System.out.println("message :"+message);
	}
	
}



public class NotificationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MsgSend b=new MsgSend();
		b.sendMessage("hiiiii");

	}

}
