package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 *  반복문
	 *  
	 *  *for문
	 *  [표현법]
	 *  
	 *  for(초기식; 조건식; 증감식){ // 반복 횟수 결정하기 위해서 제시
	 *  	반복적으로 실행시키고자 하는 구문
	 *  }
	 *  
	 *  - 초기식 : 반복문이 수행될 때 "처음에 딱 한번만 실행되는 구문"
	 *  		(보통 반복문안에서 사용될 변수를 선언 및 초기화 하는 구문)
	 *  
	 *  - 조건식 : "반복문이 수행될 조건"을 작성하는 부분
	 *  		조건식이 true일 경우 해당 구문을 실행
	 *  		조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 *  		(보통 초기식에 제시된 변수를 가지고 조건식을 작성함)
	 *  
	 *  - 증감식 : 반복문을 제어하는 변수의 값을 증감 시키는 구문
	 *  		(보통 초기식에 제시된 변수를 가지고 증감연산자(++, --)를 사용함)
	 *  
	 *  for문 안에 초기식, 조건식, 증감식 생략 가능하긴 함 for(;;){} : 무한 반복
	 *  
	 */
	
	public void method1() {
		
		for(int i=1; i <=20; i++) {
			System.out.println("안녕하슈");
			
		}
		
		for(int i=1; i<=9; i+=2 ) { // 1 3 5 7 9
			System.out.println("잘가");
		}
		
		//System.out.println(i); for문 안에서. 
	}
	
	
	public void method2() {
		// 1 2 3 4 5
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {
		// 5 4 3 2 1 
		for (int i=5; i>=1; i--) {
			System.out.print(i+ " ");
		}
		
	}
	
	public void method4() {
		// 1 3 5 7 9 1~10까지의 홀수만.
		/*
		for(int i=1; i<10; i+=2) {
			System.out.print( i+ " ");
		}
		
		*/
		
		for(int i=1; i<11; i++) {
			if(i % 2 ==1) {
				System.out.print(i+" ");
			}
		}
	}
		public void method5(){
			// 1 2 3 4  .. 10까지 출력
			for(int i=0; i<=9; i++) {
				System.out.println((i+1)+" ");
				
			}
		}
		
		public void method6() {
			// 1에서 부터 10까지의 총 합계
			
			// 방법1. int sum = 1 + 2 + 3 + ..... + 10;
			
			// 방법2. 
			
			/*
			 * int sum = 0; 
			 * sum += 1 => sum = + 1 => 0 + 1
			 * sum += 2 => sum = + 2 = > 0 + 1 + 2
			 * sum += 3 => sum = + 3 => 0 + 1 + 2 + 3
			 * .
			 * .
			 * .
			 * sum += 10 = > sum = + 10 => 0 + 1 + 2 + .... + 10
			 * 
			 * 규칙을 찾아!
			 * sum 변수에 누적해서 합산하는 거 반복적으로 진행됨
			 * 단, 누적해서 더하고자 하는 값이 1에서 부터 10까지 1씩 증가되는 걸 파악할 수 있음
			 * 
			 */
			int sum = 0; 
			for(int i=1; i<11; i++) {
				sum += i; // = 누적합 공식 
			}
			
			System.out.println("1부터 10까지의 합 : " + sum ); // 반복문 밖에서
		}
		
		
		public void method7() {
			// 사용자에게 값을 입력 받은 수까지의 합계 출력
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			int sum = 0; // 합계를 저장할 박스 비워두기
			for(int i = 1; i<=num; i++) {
				sum += i;
			}
			
			System.out.print("합계: " + sum);
		}
		
		
		
		public void method8() {
			// 1에서 부터 어떤 랜덤값(1~10 사이의 랜덤값) 까지의 총합계
			
			// 자바에서 제공하고 있는 클래스 (Math)
			
			/*
			 * java.land.Math 클래스에서 제공하는 random() 메소드를 호출해서 
			 * 매번 다른 랜덤값을 얻어낼 수 있음.
			 * Math.random(); 이런 식으로 호출 = > 0.0 ~ 0.999999 사이의 랜덤값 발생
			 * 
			 */
			
			// int random = Math.random() 매스랜덤이 double 형이라서 안됨
			//               0.0 ~ 1.0    0.0 ~ 0.99999
			
			// int random = Math.random() * 10;
			//				0.0 ~ 10.0    0.0 ~ 9,9999
			
			// int random = Math.random() * 10+1;
			//				1.0 ~ 11.0	  1.0 ~ 10.099999999
			
			
			int random = (int)(Math.random() * 10+ 1);
			
			//				 1<= random <11  : 1~10
			System.out.println("1~10사이의 랜덤값 : " + random);
			
			int sum = 0 ;
			for(int i=1; i<=random; i++) { 
				sum += i; // 누적합 공식
			}
			
			System.out.println("1부터" + random + "까지의 합계: " + sum);
		}
		
		public void method9() {
			//각 인덱스별 문자를 뽑아서 출력
			/*
			 * H  => str.charAt(0)
			 * e  => str.charAt(1)
			 * 
			 * 
			 * o  => str.charAt(4)
			 */
			
			String str = "Hello";
			
			for(int i=0; i<5; i++) {
				System.out.println(str.charAt(i));
			}
			
		}
		
		public void method10(){
		
			
			// apple의 길이 : 5글자
			// 01234
			
			// kiwi의 길이 : 4글자
			// 0123
			
		  Scanner sc = new Scanner(System.in);
				
		  System.out.print("문자열 입력 : ");
		  String str = sc.nextLine();
			
		  System.out.println("문자열의 길이: " + str.length());
		  
		  for(int i=0; i<str.length(); i++) {
			  System.out.println(str.charAt(i));
		  }
		}
		
		public void method11() {
			// 구구단 출력
			// 2단 출력하기
			
			/*
			 *  2 x 1 = 2
			 *  2 x 2 = 4 
			 *  2 x 3 = 6
			 *  ..
			 *  2 x 8 = 16
			 *  2 x 9 = 18
			 */
			
			
			for (int i = 1; i<10 ; i++ ) {
				System.out.printf("%d x %d = %d\n", 2, i, 2 * i); // 인자 준 만큼 
			}
		}
		
		
		
		
		public void method12() {
			// 2~9 까지의 랜덤수 발생시켜서 랜덤단 출력
			
			int dan = (int)(Math.random() * 8 + 2); // 시작수는 더하고 단 수는 곱하기 // 더블이니까 강제형변환
					System.out.println("===" + dan + "단===");
					
					for(int i=1; i<10; i++) {
						System.out.printf("%d x %d = %d\n", dan, i , dan*1);
					}
		}
		
		
		// 중첩 for 문
		public void method13() {
			// 1 2 3 4 5
			// 1 2 3 4 5
			// 1 2 3 4 5

			for(int j=1; j<=3; j++) { // n번 반복하고 싶으면 그 안에 그냥 넣으면 됨. 전체 사이클
				
				for(int i = 1 ; i<=5 ; i++) {
					
					System.out.print(i + " ");
					
				}
				System.out.println(); // 개행
			}	
		}
		
		
		public void method14() {
			// 2단부터 9단까지 다 출력
			for(int dan=2; dan<10; dan++) {
				
				for(int i=1 ; i<=10; i++) {
					System.out.printf("%d + %d = %d\n" , dan, i, 2*dan);
				}
				System.out.println(); // 개행
			}
			
		}
		
		
	}
	
	
	
	
	

