package com.java_training.basic;

public class New {
	public static void main(String[] args) {
		System.out.println("New");
		New c = new New();// object reference of a class
		c.add(30, 10);
		c.sub(30, 10);
		c.multi(30, 10);
		c.div(30, 10);

	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void multi(int a, int b) {
		System.out.println(a * b);
	}

	public void div(int a, int b) {
		System.out.println(a / b);
	}

}
