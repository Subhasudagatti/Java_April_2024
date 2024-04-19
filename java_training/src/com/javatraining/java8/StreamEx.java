package com.javatraining.java8;

import java.util.Arrays;
import java.util.List;

public class StreamEx {
public static void main(String[] args) {

	// stream api in java proviedes a powerful and expressive way to process collection of a data in functional and declarative manner. it allows you to perform various operation on the elements of collection such as filtering, mapping,  reducing and more 
	
	
	List<Integer> c = Arrays.asList(1,6,8,3,5,2,9);
	
	int a = c.stream().filter(n->n%2==0).mapToInt(n->n).sum();
	
	System.out.println(a);
}
}