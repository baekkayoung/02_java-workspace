package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 * * while문
	 * 
	 * [표현법]
	 * 
	 * [초기식;] 생략 가능하나 무조건 쓰
	 * While(조건식){
	 * 			반복적으로 실행할 코드;
	 * 			[증감식] 생략 가능하나 
	 * }
	 */
	public void method1() {
		// 1 2 3 4 5
		int i = 1;
		while( i <= 5) {
			System.out.println(i + "");
			i++;
		}
	}
	
	public void method2() {
		//1~10 홀수만
		
		int i = 1;
		while(i<11) {
			if(i % 2 == 1) {
				System.out.println(i +" ");
			}
			i++;
		}
	}
	
	public void method3() {
		// 1부터 랜덤값(1~100) 까지의 총합계
		int random =(int)(Math.random() *100 + 1);
			
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
		
		/*
		 * 
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
		
			
			// apple의 길이 : 5글자
			// 01234
			
			// kiwi의 길이 : 4글자
			// 0123
			
		  System.out.println("문자열의 길이: " + str.length());
		  
		  for(int i=0; i<str.length(); i++) {
			  System.out.println(str.charAt(i));
		  }
		}
		 */
		/*
		 * int i = 1;
			while( i <= 5) {
			System.out.println(i + "");
			i++;
		}
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		String str = sc.nextLine();
		
		int i = 0;
		while (i<str.length()){
			System.out.println(str.charAt(i));
			i++;
			/*
			 * sysout(str.charAt(i++));로 가능
			 */
		}
		
		
	}
	
	
	
	
	}


