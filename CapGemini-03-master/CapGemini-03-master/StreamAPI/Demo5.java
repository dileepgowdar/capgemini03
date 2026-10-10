package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=Arrays.asList("laptop","cell","phone","mobile");
		List<String> result=a.stream().limit(3).toList();
		System.out.println("product names:"+result);
	}

}
