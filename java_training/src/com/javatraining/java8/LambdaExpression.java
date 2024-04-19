package com.javatraining.java8;

interface Hello{
	public String greet();

}

public class LambdaExpression {
// it is biggest feature of java8
// if provides functional inrface programming and simplified the development a lot
	// parameter -> {body}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Hello h= ()->{
    	return "hello world";
    };
    
    System.out.println(h.greet());
	}
	

}
