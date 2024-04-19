package com.java_training.basic;

public class Arraysex {//immutable
//	int a = 1;
//	int b = 2;
//	int c = 3;
//	int[]arr = {1,3,6,9,12,15,18,21};
	
	public static void main(String[] args) {
		String s1 = "hello"; //Stringpool
		String s2 = "hello";
		String s3 = new String("hello");//heap
		
		System.out.println(s1==s2);//true //reference
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true //value
	}
}
  //premitive datatype having corresponding wrapper class
//final keyword, it cant be inherit



//int  -    Integer
//boolean - Boolean
//byte -    Byte
//short -   Short
//char -    Character
//float -   Float

//Autoboxing:- coversion of primitive to wrapper class called Autoboxing
//Auto unboxing :- Coversion of wrapper to primitive caller auto unboxing