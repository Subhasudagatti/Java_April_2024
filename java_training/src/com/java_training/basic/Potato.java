package com.java_training.basic;

public class Potato extends Veg {

	public void chips() {
		System.out.println("Need to prepare chips");
	}
	public static void main(String[] args) {
		Potato v = new Potato();
		v.wash();
		v.chop();
		v.chips();
	}
}

