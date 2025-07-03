package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringtTokenizer {
	
	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		// 구분자를 기준으로 문자열을 분리시키는 방법
		// 방법1. 분리된 문자열들을 String[] 배열에 담고자 할 때
		// 		 String 클래스에서 제공하는 split 메소드 이용
		// 		 문자열.split(구분자) : String[]
		
		String[] arr = str.split(",");
		System.out.println("arr배열의 길이: " + arr.length);
		/* 단순 for문
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 인덱스 : " + arr[i]);
		}
		*/
		// 향상된 for 문
		// a에는 arr1번 2번...
		int count = 0;
		for(String a :arr) {
			System.out.println(count + "번째 인덱스: " + a );
			count++;
		}
		
		// 방법2. 분리된 문자열들을 각가 토큰으로써 관리하는 방법
		// 		 java.util.StringTokenizer 클래스를 이용하는 방법
		
		StringTokenizer stn= new StringTokenizer(str, ",");
		System.out.println("분리된 문자열 개수 : " + stn.countTokens());
//		System.out.println(stn.nextToken()); // Java
//		System.out.println(stn.nextToken()); // Oracle
//		System.out.println(stn.nextToken()); // JDBC
//		System.out.println(stn.nextToken()); // HTML
//		System.out.println(stn.nextToken()); // CSS
//		System.out.println(stn.nextToken()); // Spring
		//System.out.println(stn.nextToken()); - > 오류 : NoSuchElementException
		// - 더 이상의 요소가 없다. 다 뽑으면 끝남. 일회용
		
//		for(int i=0; i<stn.countTokens(); i++) {
//			System.out.println(stn.nextToken());
//		}
		/*
		 * i = 0   i < 6  출력(Java)
		 * i = 1   i < 5  출력(Oracle)
		 * i = 2   i < 4  출력(JDBC)
		 * i = 3   i < 3  작지 않다.. false => 반복문 끝
		 * 
		 */
		
		// 해결방법1. 
		/*
		int count1 = stn.countTokens(); // 6
		for (int i= 0; i<count1; i++);
		System.out.println(stn.nextToken());
		*/
		
		// 해결방법2. 토큰이 있는지?
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());		
		}
		
		
		
	}

}
