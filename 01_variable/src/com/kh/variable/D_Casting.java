package com.kh.variable;

import java.util.Scanner;

public class D_Casting {

	/*
	 * 형변환 : 값의 자료형을 바꾸는 것
	 * 
	 * *컴퓨터에서의 값 처리 규칙
	 * 1. 대입연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형 이어야 한다!!
	 * => 즉, 같은 자료형에 해당하는 값만 대입 가능!
	 * => 즉, 다른 자료형의 값을 대입하고자 한다면 형변환이 필수적임!!
	 * 
	 * 자료형 변수명 = (자료형)값;
	 * 
	 * 2. 같은 자료형 끼리만 연산이 가능
	 * 
	 * 값 + 값 => 계산 결과도 같은 자료형으로 나옴!
	 * 
	 * *형변환 종류
	 * 1. 자동 형변환 => 자동으로 형변환이 이뤄져서 우리가 형변환을 할 필요가 없음!
	 * 2. 강제(명시적) 형변환 => 자동 형변환이 안돼서 우리가 해야함!
	 * 
	 * [표현법] 
	 * 자료형 변수명 = (자료형)값;
	 * 
	 * *boolean은 형변환이 불가능
	 * 
	 */
	public void autoCasting() {
		
		/*
		 * 자동형변환
		 * 값의 범위가 작은 자료형과 큰 자료형간의 연산시 
		 * 자동으로 범위가 작은 자료형을 큰 자료형으로 변환 후 처리해 줌
		 */
		
		//1. int(4byte) => double(8byte)
		int i1 = 12;
		
		double d1 = /*(double)*/i1;
		System.out.println("d: "+ d1);
		
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = i2 + d2; // 12.0 + 3.3 => 15.3
		
		System.out.println("result : " + result);
		
		// 2. int(4byte) => long(8byte)
		
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		
		
		// 3. float(4byte) => double(8byte)
		float f4 = 1.0f;
		double d4 =/*(double)*/ f4;
		
		
		// ======특이케이스====== :보통 작은 게 큰 걸 따라가는데 예외.
		// 4. long(8byte) => float(4byte)
		// float 형이 실수형이기 때문에 long 보다 표현 가능한 수의 범위가 더 넓다.
		// long은 1, float는 1.0 1.00 1.000,...)
		
		long l5 = 1000000L;
		float f5 =l5;
		
		// 5. char(2byte) <=> int(4byte)
		int num = 'C'; //
		System.out.println("num:" + num);
		
		char ch = 55153;
		System.out.println("ch :" + ch);
		
		/*
		 * 각 문자들 마다 고유한 숫자가 지정되어 있기 때문에
		 * 쌍방향으로 형변환 가능!
		 * char 변수는 음수값 저장 불가!!
		 * 0~65535값의 범위!	
		 */
		
		// 6. byte간의 연산
		byte b1 = 1;
		byte b2 = 10;
		//byte b3 = b1 + b2; // byte는 연산 결과가 무조건 int형으로 저장됨
		
		}
	public void forceCasting(){
		// 강제형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것
		
		// double(8byte) = > float(4byte)
		double d1 =4.0;
		float f1 = (float)d1;
		// 강제형변환 안 해주면 오류남
		
		// double(8byte) =>int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum +dNum; 안됨
		
		// 방법 1. 연산 결과를 int 형으로 강제 형변환 // 은우 얼굴 살리려면 몸은 날아감
		int iSum1 = (int)(iNum +dNum);
		System.out.println("iSum1 : " + iSum1);
		
		// 방법 2. double형 값만을 int형으로 강제 형변환
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2);
		
		}
		public void calScore() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 : ");
			double kor = sc.nextDouble();
			
			System.out.print("영어 : ");
			double eng = sc.nextDouble();
			
			System.out.print("수학 : ");
			double math = sc.nextDouble();
			
			System.out.println("총점 : " + (int)(kor + eng + math)); //소수점으로 나오니까 int 붙여서 강제 형변환
			System.out.println("평균 : " + (int)((kor + eng + math)/3)); //
			
					
		
		
	
	
	}
	
	
	
	
	
	
}
