package com.java_training.basic;

public class Carrot extends Veg {

	public void halwa() {
		System.out.println("Need to prepare halwa");
	}
	public static void main(String[] args) {
		Carrot v = new Carrot();
		v.wash();
		v.chop();
		v.halwa();
		
		
		
	}
}
