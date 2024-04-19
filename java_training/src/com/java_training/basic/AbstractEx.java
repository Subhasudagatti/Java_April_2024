package com.java_training.basic;

public abstract class AbstractEx {
// abstraction: showing the functionalities and hiding the implementation
// add abstract keyword with less as well as method
	// abstract class is not a 100% abstract class because we can write abstract as well
	
	public abstract void add(int a, int b, int c);
	public abstract void delete(int a, int b);
	public abstract void update(int a, int b);
	public abstract void get(int a, int b);
	
	public void run(int a, int b){
	System.out.println(a+b);
	
}
	

}
