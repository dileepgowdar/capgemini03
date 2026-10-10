package com.tns.collectionFrameWork;


import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
Vector<Integer> v=new Vector<>();
v.add(1);
v.add(2);
v.add(3);
v.add(5);
v.add(12);
System.out.println(v);
v.capacity();
System.out.println(v);
v.contains(22);
System.out.println(v);
v.remove(5);
System.out.println(v.toString());
	}
}