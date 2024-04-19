package com.java_training.basic;

public class ThisEx {
	// this keyword used to access the instance variable and instance method
	// it can used inside the method or constructor.
	// this() not a keyword which is used to invoke or call overload constructor of
	// the same class
	String name;// global variable for multiple methods//subhas
	int age;// global variable//30

	public ThisEx(String name, int age) {// local variable
		this.name=name;//subhas
		this.age=age;//30
	}
	void display() {
		System.out.println("name : " + name + " age : " + age);
	}
	public static void main(String[] args) {
		ThisEx t = new ThisEx("subhas",30);
		t.display();
	}
}
