package com.java_training.basic;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();

		System.out.println("Enter the age");
		int age = sc.nextInt();

		System.out.println("Enter the cname");
		String cname = sc.next();

		System.out.println("Enter the mnumber");
		String mnumber = sc.next();

		System.out.println("Customer name is " + name);
		System.out.println("Customer age is " + age);
		System.out.println("Customer cname is " + cname);
		System.out.println("Customer mnumber is " + mnumber);
	}
}
