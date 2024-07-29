package com.mycompany.ch02;

public class StringEx {

	public static void main(String[] args) {
		// String은 큰따옴표를 사용해야한다.
		// 작은따옴표는 오류가 발생한다.
		String var1 = "Misa";
	  //String var2 = 'Misa';
		
		System.out.println("var1.toLowerCase():" + var1.toLowerCase());
		
		// integer는 null 허용, int는 null 미허용
		Integer var3 = 10;
		int var4 = 10;
	
		// String 객체 안에는 매우 많은 기능들이 포함되어 있다.
		// String 객체 안에 있는 toLower()라는 기능을 사용하면 대문자를 모두 소문자로 변경시켜준다

	}

}
