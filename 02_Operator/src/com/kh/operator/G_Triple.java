package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * 삼항연산자 (항이 3개)
	 * 
	 * [표현법] 
	 * (조건식) ? 조건식이 참일 경우 돌려줄 결과값 : 조건식이 거짓일 경우 돌려줄 결과값
	 * 
	 * 이때, 조건식은 반드시 true, false가 나오도록 작성해야됨!!
	 * 주로 비교연산자, 논리연산자를 통해 작성을 하는 경우가 많다.	 
	 * 
	 */
	
	public void method1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//String result = 조건 ? 참일때 : 거짓일때돌려줄까
		String result = (num > 0 ) ? "양수입니다." : "양수가 아닙니다."; // 0보다 num이 크면 양수입니다, 아니면 양수가 아닙니다
		System.out.print(num + "은 " + result);
	}
	
	public void method2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0 )? "짝수입니다." : "홀수입니다.";
		System.out.print(num + "은 " + result);
	}
	
	public void method3(){
		// 삼항연산자 중첩
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수입니다." : (num == 0 ) ? "0입니다." : "음수입니다.";
		System.out.print(num + "는 " + result);
	}
	
	public void method4() {
		// 사용자에게 두 개의 정수를 입력 받고
		// 연산자입력(+ 또는 -) 입력받아서 그에 맞는 연산결과를 출력하는 프로그램
		// 단, +또는 - 외의 다른 문자를 입력했을 경우 "잘못입력했습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine(); // 버퍼에 남아있는 빈 칸 제거
		
		System.out.print("연산자 + 또는 -를 입력하시오 :");
		char op = sc.nextLine().charAt(0);
			
		String result = (op == '+') ? (num1+ num2 + "") : (op == '-') ? (num1 - num2 + "") :"잘못입력했습니다."; // "" < 문자열로 바꿔줌
		
		System.out.println("결과 : " + result);

		
		
		
	
		
	}
	
}
