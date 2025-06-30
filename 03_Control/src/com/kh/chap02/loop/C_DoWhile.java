package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
	/*
	 * * do while문
	 * 
	 * do{
	 * 		반복적으로 실행할 코드(조건에 상관없이 무조건 한 번 실행! 후 검사)
	 * }while(조건식);
	 * 
	 * * 기존의 for / while문과의 차이점
	 * for / while문 같은 경우에는 조건 검사 후 true여야만 수행
	 * 근데 do-while문은 조건 검사 없이 무조건 한 번은 수행!
	 */

	
	public void method1() {
		int num = 1;
		
		do {
			System.out.println("num: " + num);
		}while(false); // 그럼에도 수행 : num : 1
	}
	
	public void method2() {
		// 1 2 3 4 5
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;//이거 없으면 1 무한 반복
		}while(i<=5);
	}
	
	public void method3() {
		// 1부터 사용자가 입력한 수까지 총합 (=누적합)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		do {
			sum += i; // 누적합
			i++; // 이거 없으면 1만 계속 더해짐
		}while(i<=num);
		
		
		System.out.println("합계 : " + sum);
		
	}
}
