package com.java_training.basic;

public class Chilly extends Veg {

	public void bajji() {
		System.out.println("Need to prepare bajji");
	}
	public static void main(String[] args) {
		Chilly v = new Chilly();
		v.wash();
		v.chop();
		v.bajji();
		
	}
}

