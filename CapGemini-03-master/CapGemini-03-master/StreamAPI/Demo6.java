package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=Arrays.asList(10,15,18,50,66);
		a.stream().filter(n->n%5==0).forEach(System.out::println);
	}

}
