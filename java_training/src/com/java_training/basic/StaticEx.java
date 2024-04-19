package com.java_training.basic;

public class StaticEx {
	static int a;
	int b;

	public static void mobile() {
		System.out.println("IQOO NEO 7");

	}

	public void tab() {
		System.out.println("New Tab");

	}

	public static void main(String[] args) {
		a = 20;
		mobile();//static method= by using static keyword we can run method directly
		StaticEx s = new StaticEx();
		s.tab();//non static method= need to assign object reference when static keyword not used
		s.b = 30;

	}
}
