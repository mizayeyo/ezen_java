package com.mycompany.ch03;

public class Logical1OperatorTr {

	public static void main(String[] args) {
		
		
		int a =65; // 변수 a를 65로 초기화

		
			    // 조건: a가 65 이상 70 이하일 때
				if(a >= 65 && a <= 70) { 
					// 논리 AND 연산자 (&&) 양쪽 조건이 모두 true 일때 true 반환
					System.out.println("&&; True"); // 둘다 참이므로 true 출력
			}
			    // 조건: a가 65 이상이고 70 이하일 때
				if(a >= 65 & a <= 70) { 
					// 비트연산자 AND(&) 양쪽 조건이 모두 true 일때 true 반환 
					System.out.println("&&; True");	// 둘다 참이므로 true 출력
				
			}   // 조건: a가 65 이상이거나 70 이하일때
				if(a >= 65 || a <= 70) {
					// 논리 OR 연산자 (||) 한개의 조건이라도 true 이면  전체 조건이 true 
					System.out.println("&&; True");	// 둘다 참이르모 true 출력
				
			}   // 조건: a가 65이상이거나 70 이하일 때
				if(a >= 65 | a <= 70) {
					// 비트연산자 OR (|) 한개의 조건이라도 true 이면 전체 조건이 true
					System.out.println("&&; True");	
				
			}
	

	}

}
