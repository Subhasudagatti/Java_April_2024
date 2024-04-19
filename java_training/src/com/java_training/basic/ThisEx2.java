package com.java_training.basic;

public class ThisEx2 {

	public ThisEx2() {//6
		System.out.println("default parameter");//7
	}

	public ThisEx2(int a) {//4
		this();//5
		System.out.println("single parameter constructor");//8
	}

	public ThisEx2(String a, String b) {//2
		this(2);//3
		System.out.println("double parameter constructor");//9
	}

	public static void main(String[] args) {
		ThisEx2 t = new ThisEx2("Subhas", "Udagatti");//1 //10
	}
}
