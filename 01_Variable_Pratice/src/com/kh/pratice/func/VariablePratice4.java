package com.kh.pratice.func;

import java.util.Scanner;

public class VariablePratice4 {

	public void inputTest4(){
		
		Scanner sc = new Scanner(System.in);
		/*
		 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
		 */
		
		System.out.print("문자열을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + name.charAt(0));
		System.out.println("두 번째 문자 : " + name.charAt(1));
		System.out.println("세 번째 문자 : " + name.charAt(2));
		
		

	}

}
