package com.tns.collectionframework;

import java.util.Vector;

public class Vectordemo {
public static void main(String[] args) {
	Vector<Integer> v=new Vector<>();
	
	v.add(1);
	v.add(5);
	v.add(90);
	v.add(90);
	v.add(35);
	v.add(55);
	
	System.out.println(v);
	
	v.capacity();
	System.out.println(v);
	
	v.contains(2);
	System.out.println(v);
	
	v.removeFirst();
	System.out.println(v);
	
	for(int h:v) {
		System.out.println(h);
	}
	
	v.clear();
	System.out.println(v);
}
}
