package com.tns.collectionFrameWork;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l=new LinkedList<>();
		
		l.add("google");
		l.add("youtube");
		l.add("github");
		l.add("python");
		l.add("java");
		
		System.out.println(l);
		
		l.addFirst("sql");
		l.addLast("mysql");
		
		System.out.println("first:"+l.peekFirst());
		System.out.println("removed:"+l.pollFirst());
		System.out.println(l);

	}

}
