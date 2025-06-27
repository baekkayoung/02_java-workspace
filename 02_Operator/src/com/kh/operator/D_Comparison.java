package com.kh.operator;

import java.util.Scanner;

public class D_Comparison {
	
	/*
	 * *비교 연산자 / 관계 연산자 (이항 연산자)
	 *  두 값을 비교하는 연산자
	 *  비교연산자는 조건을 만족하면 true(참), 만족하지 않으면 false(거짓)을 반환
	 *  즉, 비교연산자의 결과값은 논리값
	 *  
	 *  대소비교 연산자 : < > <= >=
	 *  동등비교 연산자 : == !==
	 */
	
	public void method1() {
		int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b)); // false
		System.out.println("a <= b : " + (a <= b)); // true
		
		boolean result = a > b;
		System.out.println(result);
		
		System.out.println("a가 짝수인가 : " + (a % 2 == 0));
		System.out.println("a가 홀수인가 : " + (a % 2 == 1));
		System.out.println("a가 홀수인가 : " + !(a % 2 ==0)); // 논리 부정 연산자
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
	
		System.out.println("첫번째가 두번째보다 크냐? : " + (num1 > num2)); 
		System.out.println("첫번째 정수가 짝수입니까? : " + (num1 % 2 == 0 ));
		
		System.out.println( num2 < 'A'); // A = 65
	}

}
