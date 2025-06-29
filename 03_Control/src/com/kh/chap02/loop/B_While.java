package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 * * while문
	 * 
	 * [표현법]
	 * 
	 * [초기식;] 
	 * While(조건식){
	 * 			반복적으로 실행할 코드;
	 * 			[증감식]
	 * }
	 */
	
	public void method1() {
		// 1 2 3 4 5
		int i = 1;
		while( i <= 5) {
			System.out.print(i + " ");
			i++;
		}
	}
	
	public void method2() {
		//1~10 홀수만
		
		int i = 1;
		while(i<11) {
			if(i % 2 == 1) {
				System.out.print(i +" ");
			}
			i++;
		}
	}
	
	
	
	
	public void method3() {
		// 1부터 랜덤값(1~100) 까지의 총합계
		int random =(int)(Math.random() *100 + 1); 
		// *100 -> 0.0 이상 100.00 미만 : 1부터 100까지 나와야되는데?
		// *100 + 1 -> 1.0 이상 101.00미만 : 1.0 부터 100.99 => 소숫점 제외 1부터 100까지
		// int로 강제형변환을 해주면 소숫점 자리는 지워져서 정수만 완벽하게 사용 가능
			
		int sum = 0;
		int i = 1; // 초기식
		while(i<=random) {
			sum += i;// 누적값 공식
			i++;
		}
		
		System.out.println("1부터" + random + "까지의 합 :" + sum);
			
		}
	
	
	
	
	
	public void method4() {
		// A_for에 있는 메소드 10번을 while문으로 바꾸기
		
		/* 10번
		 * 
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
		
		  System.out.println("문자열의 길이: " + str.length());
		  
		  for(int i=0; i<str.length(); i++) {
			  System.out.println(str.charAt(i));
		  }
		}
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = sc.nextLine();
		System.out.println("문자열의 길이 : " + str.length());
		
		int i = 0; // 문자열 세는 거니까 0부터 시작
		while (i<str.length()){ // 0 1 2 3 4 
			
			System.out.println(str.charAt(i) + " ");
			i++; //System.out.println(str.charAt(i++));로 가능
		}
		
		
		
	}
	
	
	
	
	}


