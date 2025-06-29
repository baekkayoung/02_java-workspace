package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * *논리연산자 (이항연산자)
	 * 두개의 논리값을 연산해주는 연산자
	 * 
	 * 논리값 && 논리값 : 왼쪽과 오른쪽 둘 다 true일 경우 결과값은 true
	 * 논리값 || 논리값 : 왼쪽과 오른쪽 둘 중 하나라도 true일 경우 결과값은 true
 	 */
	
	public void method1(){
		
		// 사용자가 입력한 정수값이 1부터 100사이의 값인지 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//boolean result = (1 <= num <= 100);
		boolean result = (num >=1) && (num <=100);
		
		System.out.println("사용자가 입력한 값이 1~100 사이 입니까? : " + result);
		
		// && : 두 개 조건 모두가 true여야 결과값이 최종적으로 true
		//		둘 중 하나라도 false가 있을 경우 && 연산의 결과값은 false
	}
	
	public void method2() {
		// 사용자가 입력한 문자값이 영어 대문자인지 확인
		// 'A' ~ 'Z' 65~90
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		//boolean result = (ch >= 65) && (ch <= 90);
		boolean result = (ch >= 'A') && (ch <= 'Z'); //int랑 char는 쌍방향
		
		System.out.print("대문자냐 ? : " + result);
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력 (M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'F') || (gender == 'f');
		System.out.print("사용자가 여자 입니까? : " + result);
		
		// || : 두 개의 조건 중 하나라도 true가 있다면 연산의 결과값은 true
		//		두 개 조건 모두 false일 경우 연산의 결과값은 false
	}
	
	public void method4() {
		/*
		 * && : 두 개의 조건 모두 true여야 결과값이 true임 (AND == ~이고, 그리고, ~이면서)
		 * 
		 * true && true => true
		 * true && false => false
		 * false && true => false 
		 * false && false => false
		 * 
		 * ** && 연산자를 기준으로 앞의 결과가 false일 경우 뒤에 조건은 굳이 실행하지 않는다! **
		 * 
		 * || : 두 개의 조건 중 하나라도 true라면 결과값이 true임. (or == 또는, ~이거나)
		 * 
		 * true || true => true
		 * true || false => true
		 * false || true => true
		 * false || false => false
		 * 
		 * ** || 연산자를 기준으로 앞의 결과가 true일 경우 뒤에 조건까지 실행하지 않는다!
		 */
		
		int num = 10;
		boolean result1 = (num > 5) && (++num > 0);
		
		System.out.println("result1 : " + result1);
		System.out.println("num의 값: " + num);
		
		int num2 = 10;
		boolean result2 = true || (++num2 > 0); // ++num2를 읽지 않아서 계속 10 = dead code(절대 실행될 일 없는 코드)
		System.out.println("result2 : " + result2);
		System.out.println("num2의 값 : " + num2);
	}
	
	
	
	

}
