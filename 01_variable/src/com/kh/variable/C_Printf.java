package com.kh.variable;

public class C_Printf {

	// System.out.print(출력하고자 하는 값); => 출력만 함(줄바꿈 발생X)
	// System.out.println(출력하고자 하는 값); => 출력 후 줄바꿈 발생O
	
	// System.out.printf("출력을 하고자하는 형식(포맷)", 출력하고자 하는 값);
	// 출력하고자 하는 값을 제시한 형식에 맞춰서 출력만 진행(줄바꿈X);
	
	/*
	 * 포맷 안에서 쓰일 수 있는 키워드
	 * %d : 정수
	 * %c : 문자(한 글자)
	 * %s : 문자열(한 글자 포함)
	 * %f : 실수
	 */
	
	public void printTest(){
		int iNum1 = 10;
		int iNum2 = 20;
		
	//10 20
	System.out.println(iNum1 + "," + iNum2);
	System.out.printf("%d %d", iNum1, iNum2);
	System.out.println();
	
	// 10 20%
	
	System.out.printf("%d %d%%", iNum1, iNum2);
	System.out.println();
	
	//System.out.printf("%d %d", iNum1); // 에러
	System.out.printf("%d %d", iNum1, iNum2, 30); // 30은 그냥 무시됨
	System.out.println();
	
	double dNum1 = 1.23456789;
	double dNum2 = 4.53;
	
	//System.out.printf("%f %f", dNum1, dNum2); // 무조건 소숫점 6자리까지
	System.out.printf("%.2f %.2f\n", dNum1, dNum2); // 정상. 개행: \n
	
	char ch = 'a'; //문자는 홑따옴표
	String str = "Hello";
	
	System.out.printf("%c %s %s\n", ch, str, ch);
	System.out.printf("%C %S %S\n", ch, str, ch);
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
