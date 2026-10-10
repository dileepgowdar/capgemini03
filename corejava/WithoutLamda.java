package com.tns.LamdaExpression;

 @FunctionalInterface
interface Drawable{
	public void draw();
}

class Test implements Drawable{
int width=20;
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw:"+width);
	}
	
}



public class WithoutLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=new Test();
		d.draw();
	}

}
