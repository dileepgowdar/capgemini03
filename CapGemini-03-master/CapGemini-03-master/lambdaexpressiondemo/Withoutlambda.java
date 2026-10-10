package com.tns.lambdaexpressiondemo;

@FunctionalInterface
interface Drawable{
	public void draw();
}

class Test implements Drawable{
int width =20;
	@Override
	public void draw() {
		System.out.println("draging :"+width);
		
	}
}
public class Withoutlambda {
	public static void main(String[] args) {
		Drawable d=new Test();
		d.draw();
	}
}
