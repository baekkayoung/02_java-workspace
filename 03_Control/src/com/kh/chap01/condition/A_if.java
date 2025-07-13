package com.kh.chap01.condition;

import java.util.Scanner;

public class A_if {
	Scanner sc= new Scanner(System.in);

	public void method1() {
		/*
		 * 단독 if문
		 * 
		 * [표현법]
		 * if(조건식){
		 * 		..실행을시키고자 하는 코드..
		 * }
		 * 
		 * if는 조건식이랑 친하다!
		 * 
		 * => 조건식이 참(true)일 경우 => 중괄호 블럭 안의 코드 실행
		 * => 조건식이 거짓(false)일 경우 => 중괄호 블럭 안의 코드 무시하고 넘어감
		 * 
		 */
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.print("양수다.");
		}
		if(num <= 0) {
			System.out.print("양수가 아니다.");
		}
		
	}
	
	
	public void method2() {
		/*
		 *  if - else문
		 *  
		 *  [표현법]
		 *  if(조건식){
		 *  		.. 실행코드1 ..
		 *  }else{
		 *  		.. 실행코드2 ..
		 *  }
		 *  
		 *  조건식의 결과가 참(true)일 경우 실행코드1 수행 후 if - else문 빠져나감
		 *  단, 결과가 거짓(false)일 경우 무조건 실행코드2 수행
		 */
		
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.print("양수다.");
		}else{
			System.out.print("양수가 아니다.");
		}

	}
	
	public void method3() {
		/*
		 * if- else if - else문
		 * 
		 * 같은 비교 대상으로 여러개의 조건을 제시해야 될 경우
		 * 
		 * [표현식]
		 * if(조건식){
		 * 		.. 실행코드1 ..
		 * }else if(조건식){
		 * 		.. 실행코드2 ..
		 * }else if(조건식){
		 * 		.. 실행코드3 ..
		 * }else{
		 * 		.. 실행코드4 ..
		 * }
		 * 
		 * else는 생략 가능
		 */
		
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("양수다.");
		}else if(num == 0 ) {
			System.out.println("0이다.");
		}else { //없어야 함
			System.out.println("음수다");
		}
	}
	
		public void method4() {
			// 나이 입력받아
			// 13세 이하 : 어린이
			// 13세 초과~ 19세 이하 : 청소년
			// 19살 초과 : 성인
		
			System.out.println("나이: ");
			int age = sc.nextInt();
			
			String result;
			if(age <= 13) {
				result = "어린이";
			}else if(age<20){
				result = "청소년";
			}else{
				result = "성인";
			}
			
			System.out.println(result);
	}
		public void method5() {
			// 이름
			// 성별 (M/f)
			// 차은우님은 남학생입니다.
			
			System.out.println("이름: ");
			String name = sc.nextLine();
			
			System.out.print("성별(M/F):");
			char gender = sc.nextLine().charAt(0);
			
			String result = ""; //변수를 미리 셋팅할 때 초기화하는 습관

			if(gender == 'M' || gender =='m'){
				result = ("남학생");
			}else if(gender == 'F' || gender == 'f') {
				result = ("여학생");
			}else {
				System.out.println("잘못입력했음");
				return; // 메소드 5번이 부름.  // 해당 이 메소드 자체를 빠져나가는 구간
				//나를 호출햇던 메소드5로 돌아가고 이후 코드가 없기때문에 긑남. 실행파일run쪽으로 감.
				
				//모르는거라고 알려주고 여기서 멈추게 하려고 return
				
				// method5()에서 return;을 만나면 더 이상 아래 코드는 실행되지 않고
				
				//다시 main()의 "main 메소드 계속 실행" 부분으로 이동합니다.
			}
			System.out.println(name + " 님은 " + result + "입니다.");
			
		}
	public void method6() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		/*
		 
		 * if(name == "차은우") {
			System.out.print("차은우님 반갑습니다");
		}else{
			System.out.print("차은우님이 아니신가보네요... 안녕히가세요.");
		}
		
		*/

		
		/*				1		1	  2	     4	  8		4		8	  2
		 * 기본자료형 : boolean, byte, short, int, long, float, double, char
		 * 참조자료형 : String
		 * 
		 * 기본자료형들끼리 동등 비교시 ==, != 사용가능. (정상적으로 비교됨)
		 * 단, 참조자료형은 동등비교시 ==, != 사용시 정상적으로 비교가 안 됨.
		 * 		=> equals() 메소드를 이용해서 비교해야 됨
		 * 		문자열.equals(문자열)
		 */
		
		if(name.equals("차은우")) {
			System.out.print("차은우님 반갑습니다");
		}else{
			System.out.print("차은우님이 아니신가보네요... 안녕히가세요.");
		}
		
		// 조건문 중첩 사용 가능
		
	}
		public void method7() {
			
			System.out.print("정수(양수만): ");
			int num = sc.nextInt();
			
			if(num > 0) { // 양수일 경우
				
				if(num % 2 == 0) { // 양수이고 짝수일 경우
					System.out.println("짝수입니다.");
				}else { // 양수는 맞고 홀수일 경우
					System.out.println("홀수입니다.");
				}
				
			}else { // 양수가 아닐 경우
				System.out.println("양수가 아닙니다. 잘못 입력했습니다");
				
			
		}
		
	}
		














}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

