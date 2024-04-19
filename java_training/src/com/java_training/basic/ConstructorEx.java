package com.java_training.basic;

public class ConstructorEx {
// to create object reference of a class with new keyword.
//ConstructorEx c = new ConstructorEx();
//types: Default constructor and User define constructor

	
	public ConstructorEx(){// default
		System.out.println("This is default constructor");
	}
	public ConstructorEx(int a){// user defined
		System.out.println("This is user defined constructor");
	}
	public ConstructorEx(int a, int b){
		System.out.println("This is double constructor");
	}
	
	
	public static void main(String[] args) {
		ConstructorEx c = new ConstructorEx();
		ConstructorEx c1 = new ConstructorEx(100);// with parameter
		ConstructorEx c2 = new ConstructorEx(100,200);
		//syntax: class name variable = keyword ConstructorEx();
	
	}
	
	
	
	
	
}




