package com.tns.LamdaExpression;

@FunctionalInterface
interface draw{
	public void draw();
}



public class WithLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=20;
		draw d2=()->{System.out.println("draw"+width);};
		d2.draw();
	}

}
