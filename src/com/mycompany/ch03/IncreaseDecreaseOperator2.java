package com.mycompany.ch03;

public class IncreaseDecreaseOperator2 {

	public static void main(String[] args) {
		
		int i = 7;
		int j = 8;
		
		++i;
		j++;
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("--------------------");
		
		int k = i++;
		int m = ++j;
		
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("k: " + k);
		System.out.println("m: " + m);
		
		--i;
		int z= ++i + j++;
		
		System.out.println(z);
		
		

	}

}
