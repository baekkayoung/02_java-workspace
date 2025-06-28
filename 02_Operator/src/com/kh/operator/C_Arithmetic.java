package com.kh.operator;

public class C_Arithmetic {

	public static void main(String[] args) {
		
		/*
		 * * 산술 연산자
		 * + - * / %
		 * 
		 *  * / % > + - 
		 */

	}
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 : " + (num1 + num2)); // 문자열과 숫자는 개별로
		System.out.println("num1 - num2 : "  + (num1 - num2));
		System.out.println("num1 * num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2)); // 나누기 했을 때 몫
		System.out.println("num1 % num2 : " + (num1 % num2)); // 나누기 했을 때 나머지
		
		//값 % 2 == 0 짝수
		// 값 % 2 == 1 홀수

		// 값 % 5 == 0 5의 배수
		// 값  % 3 == 0 3의 배수
	}

}
