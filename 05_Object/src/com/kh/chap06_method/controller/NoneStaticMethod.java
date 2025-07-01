package com.kh.chap06_method.controller;

public class NoneStaticMethod {
	
	/*
	 * * 메소드
	 * 한 기능을 처리하기 위한 용도
	 * 
	 * 패키지명 : 소문자로 시작
	 * 클래스명 : 대문자로 시작
	 * 변수명 : 소문자로 시작
	 * 매소드명 : 소문자로 시작
	 * 
	 * *공통 낙타 표기법
	 * 
	 * 접근제한자 반환형 메소드명([매개변수,....]){
	 * 		수행내용;
	 * 		[return 결과값;]
	 * }
	 */
	
	// 1. 매개변수도 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없는 매소드 입니다.");
	}
	
	// 2. 매개변수는 없고 반환값은 있는 메소드
	
	public String method2(){
		System.out.println("매개변수는 없고 반환값은 있는 메소드 입니다.");
		return "아 집에 가고 싶다";
	}
	
	// 3. 매개변수는 있고 반환값은 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개변수는 있고 반환값은 없는 메소드 입니다.");
		
		if(num2 !=0) {
			System.out.println("num/num2:" + num1/num2);
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
	//4. 매개변수도 있고 반환값도 있는 메소드
	// 문자열, 정수값 하나식 전달받아서 해당 문자열의 해당 정수 인덱스의 문자를 뽑아서 반환
	// apple, 2 => p
	
	public char method4(String str, int index) {
		System.out.println("매개변수도 있고 반환값도 있는 메소드입니다.");
		return str.charAt(index);
		
	}

}
