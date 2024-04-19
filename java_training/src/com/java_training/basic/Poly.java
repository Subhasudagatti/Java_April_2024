package com.java_training.basic;

public class Poly {//compile time polymorphism with methods overloading
	// multiple methods with same name but diff in signature
	public void run() {
		System.out.println("Method with no parameters");
	}
	public void run(double a) {
		System.out.println(a);
	}

	public void run(int a, int b) {
		System.out.println(a+b);
	}

	public void run(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Poly p = new Poly(); // object reference of a class
		p.run();
		p.run(2, 3);
		p.run(7.2);
		p.run("Hello");
	}
	
}
