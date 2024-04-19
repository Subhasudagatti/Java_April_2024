package com.javatraining.java8;

interface Cal{
	int sum(int a,int b); 
}


public class LambdaEx2 {
public static void main(String[] args) {
	Cal c = (a,b)->(a+b);
	
	System.out.println(c.sum(30, 60));
}
}