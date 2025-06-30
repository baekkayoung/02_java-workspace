package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * break; : 반복문 안에 사용되는 분기문 // 스위치(조건문) break;와 다름 !
	 * 			break;가 실해오디는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 * 
	 */

	Scanner sc = new Scanner(System.in);
	public void method1() {
		// 랜덤값(1~100) 발생시키고 그 랜덤값 출력(무한반복)
		// 단, 발생된 랜덤값이 3의 배수일 경우 반복문을 빠져나와보기
		
		while(true) { // 트루면 무한 반복
			
			int random = (int)(Math.random() * 100 + 1); //* 개수 +시작수 
			System.out.println("random : " + random);
			
			if(random % 3 == 0) {
				break;
			}
		}
		
	}
	
	public void method2() {
		// 사용자가 문자열 입력하다가
		// "exit"를 입력하면 끝내기
		
		while (true) {
			System.out.print("문자열을 입력하시오 : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break; // 반복문 빠져나오는 break; if문을 빠져나오는 것이 아님
			}else {
				System.out.println("문자열의 길이 : " + str.length());
			}
		}
		
		
		
		
	}
}
