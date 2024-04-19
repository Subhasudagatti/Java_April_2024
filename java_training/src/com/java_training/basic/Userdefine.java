package com.java_training.basic;

import java.util.Scanner;

public class Userdefine {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the two values");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	
	System.out.println("addition" + (a+b));
	System.out.println("substraction" + (a-b));
	System.out.println("multiplicatin" + (a*b));
	System.out.println("division" + (a/b));
}
}
