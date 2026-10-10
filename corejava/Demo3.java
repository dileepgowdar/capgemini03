package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> n=Arrays.asList(20,10,15,985,0,54,652,489);
		n.stream().sorted().forEach(number->{System.out.println(number);});
	}

}
