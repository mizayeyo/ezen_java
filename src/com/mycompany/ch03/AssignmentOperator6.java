package com.mycompany.ch03;

public class AssignmentOperator6 {

	public static void main(String[] args) {
		
		// 대입 연산자 ( +=, -=, *=, ....)
		
		int result1 = 1;
		int result2 = 2;
		int result3 = 3;
		int result4 = 4;
		int result5 = 5;
		
		
		result1 += 10; //result1 =  result1 + 10; = 11
		System.out.println("result: " + result1);
		
		result2 -= 10;
		System.out.println("result: " + result2); // result2 = result2 - 10; = -8
		
		result3 *= 10;
		System.out.println("result: " + result3); // result3 = result3 * 10; = 30
		
		result4 /= 10;
		System.out.println("result: " + result4); // result4 = result4 / 10; = 0 (정수의 나눗셈. 0 이하 버림)
		
		result5 %= 10;
		System.out.println("result: " + result5); // result5 % = result % 10; = 5(5/10 은 0.5지만 소수점이하버림+기존값 출력)
		
		
		
		
		
		

	}

}
