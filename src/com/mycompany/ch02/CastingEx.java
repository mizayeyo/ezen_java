package com.mycompany.ch02;

public class CastingEx {

	public static void main(String[] args) {
		
		double doubleVal = 10;
		
		float floatVal = (float) doubleVal;
		System.out.println("floatVal: " + floatVal);
		
		long longVal = (long) floatVal;
		System.out.println("long: " + longVal);
		
		int intVal = (int) longVal;
		System.out.println("intVal: " + intVal);
		
		short shortVal = (short) intVal;
		System.out.println("shortVal: " + shortVal);
		
		byte byteVal = (byte) shortVal;
		System.out.println("byteVal: " + byteVal);
		
		
		String val = "10";
		int va12 = 10;
		int result = 0;
		
		//result - va1 + va12;
		result = Integer.parseInt(val) + va12;
		System.out.println("result: " +result);

	}

}
