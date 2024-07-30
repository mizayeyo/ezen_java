package com.mycompany.ch03;

public class IncreaseDecreaseOperator2Tr { //증감연산자

	public static void main(String[] args) {


		int a = 1;   // 변수 'a'를 정수 1로 초기화 
		int b = 2;   // 변수 'b'를 정수 2로 초기화
		
		++a; // Prefix Operator 전위 증가 연산자: 'a'의 값을 1증가시켜서 2가 됨
		--b; // Postfix Operator 후위 증감 연산자: 'b'의 값을 1 감소시켜서 1이 됨
		
		System.out.println("a: " + a); // a: + a의 값 = a: + 2
		System.out.println("b: " + b); // b: + b의 값 = b: + 1
		
		
		int i = 7;
		int j = 8;
		
		++i; // 8
		j++; // 9
		
		System.out.println("i: " + i); // i = 8
		System.out.println("j: " + j); // j = 9
		System.out.println("--------------------");
		
		int k = i++; // 9 
		int m = ++j; // 10
		
		
		System.out.println("i: " + i); // i = 9
		System.out.println("j: " + j); // j = 10
		System.out.println("k: " + k); // k = 
		System.out.println("m: " + m);
		
		--i;
		int z= ++i + j++;
		
		System.out.println(z);
		
		
		
		public class Main {
		    public static void main(String[] args) {
		        int i = 7; // 정수형 변수 'i'를 7로 초기화
		        int j = 8; // 정수형 변수 'j'를 8로 초기화
		        
		        ++i; // 전위 증가 연산자: 'i'의 값을 1 증가시킵니다. (i는 8이 됩니다)
		        j++; // 후위 증가 연산자: 'j'의 현재 값을 반환한 후, 'j'의 값을 1 증가시킵니다. (j는 9가 됩니다)
		        
		        System.out.println("i: " + i); // 'i'의 현재 값 8을 출력
		        System.out.println("j: " + j); // 'j'의 현재 값 9를 출력
		        System.out.println("--------------------");
		        
		        int k = i++; // 후위 증가 연산자: 'i'의 현재 값 8을 'k'에 할당한 후, 'i'의 값을 1 증가시킵니다. (i는 9가 되고, k는 8이 됩니다)
		        int m = ++j; // 전위 증가 연산자: 'j'의 값을 먼저 1 증가시킨 후, 증가된 값을 'm'에 할당합니다. (j는 10이 되고, m은 10이 됩니다)
		        
		        System.out.println("i: " + i); // 'i'의 현재 값 9를 출력
		        System.out.println("j: " + j); // 'j'의 현재 값 10을 출력
		        System.out.println("k: " + k); // 'k'의 값 8을 출력
		        System.out.println("m: " + m); // 'm'의 값 10을 출력
		        
		        --i; // 전위 감소 연산자: 'i'의 값을 1 감소시킵니다. (i는 8이 됩니다)
		        int z = ++i + j++; // 전위 증가 연산자와 후위 증가 연산자가 결합된 식입니다:
		                          // 1. `++i`를 먼저 평가하여 'i'를 8에서 9로 증가시키고, 9를 반환합니다.
		                          // 2. `j++`는 현재의 'j' 값을 반환하고, 그 후 'j'를 1 증가시킵니다. ('j'는 10에서 11로 증가)
		                          // 3. 따라서, 'z'는 9 (증가된 i의 값) + 10 (현재 j의 값) = 19가 됩니다.

		        System.out.println(z); // 'z'의 값 19를 출력.
		        System.out.println( z + z);
		    }
		}

		
	}

}
