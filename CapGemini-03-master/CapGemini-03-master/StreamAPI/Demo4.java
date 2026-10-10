package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> i=Arrays.asList(10,15,85,14,266,85,746,15,745,10,55,15,85);
		long count=i.stream().distinct().count();
		System.out.println("unique values:"+count);
	}

}
