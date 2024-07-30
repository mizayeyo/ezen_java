package com.mycompany.ch03;

public class CompareOperatorTr {

	public static void main(String[] args) {
		
		int a = 10; // 변수 a를 10으로 초기화
		int b = 20; // 변수 b를 20으로 초기화
		
		// a와 b가 같은지 비교
		boolean result1 = (a == b ); // 같지 않다.
		System.out.println("result: " + result1);
		
		// a와 b가 다른지 비교
		boolean result2 = (a != b ); // 다르다 = 참
		System.out.println("result: " + result2);
		
		// a가 b보다 작은지 비교
		boolean result3 = (a < b); // 10은 20보다 작다 = 참
		System.out.println("result: " + result3);
		
		// a가 b보다 작거나 같은지 비교
		boolean result4 = (a <= b); // 10은 20보다 작다 = 참
		System.out.println("result: " + result4);
		
		// a가 b보다 큰지 비교
		boolean result5 = (a > b); // 10은 20보다 작다 = 거짓
		System.out.println("result: " + result5);
		
		// a는 b보다 크거나 같은지 비교
		boolean result6 = ( a >= b); // 10은 20보다 작다 = 거짓
		System.out.println("result: " + result6);

	}

}
