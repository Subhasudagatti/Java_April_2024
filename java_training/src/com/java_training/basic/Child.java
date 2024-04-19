package com.java_training.basic;

public class Child extends Parent {

	public void money() {
		System.out.println("2 lakh rupees");

	}
	public static void main(String[] args) {
		Child a =new Child();
		a.House();
		a.Land();
		a.money();
		a.gold();
	}
}

