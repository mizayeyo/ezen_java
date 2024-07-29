package com.mycompany.ch02;

public class PromotionEx {

	public static void main(String[] args) {
		
		byte byteVal = 10;
		
		short shortVal = byteVal;
		System.out.println("shortVal: " + shortVal);
		
		int intVal = shortVal;
		System.out.println("intVal: " + intVal);
		
		int longVal = intVal;
		System.out.println("longval: " + longVal);
		
		float floatVal = intVal;
		System.out.println("floatVal: " + floatVal);
		
		double doubleVal = floatVal;
		System.out.println("doubleVal: " + doubleVal);
		

	}

}
