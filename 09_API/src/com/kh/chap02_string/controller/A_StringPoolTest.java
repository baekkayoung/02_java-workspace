package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		/*
		int a = 10; // 기본 자료형
		String s = "안뇽"; // 참조자료형
		*/
		
		//1. 생성자를 통해 문자열 생성
		String str1 = new String("hello"); // 매개변수 생성자
		String str2 = new String("hello"); // 매개변수 생성자
		
		System.out.println(str1.toString());
		System.out.println(str2);
		// 스트링 클래스에 투스트링 메소드가 이미 오버라이딩 되어있음!
		
		// 동등비교
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2)); // 주소값 비교 아님
		// String 클ㄹㅐ스에 equals() 메소드가 이미 오버라이딩 돼있음
		// 원래 Object 클래스 확인해보면 원래는 주소값을 동등 비교하는 메소드임
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//String 클래스에 hashCode 메소드가 이미 오버라이딩 되어있음!
		//다른 주소값인데 왜 같은 해쉬코드??
		//주소값이 아닌 실제 담겨있는 문자열을 가지고 해쉬코드 만듦
		
		//근데 난 주소값을 알고 싶다?
		//system.identityHashCode(객체); 10진수
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	public void method2() {
		
		String str = new String("hello"); // new로 만들면 주소값이 각각 생김
		
		
		//2. 문자열 값을 리터럴 값으로 생성하는 것
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2); // 엥 ? 왜 true 주소값이 일치함
		
		System.out.println("str1 의 주소값 : " + System.identityHashCode(str1));
		System.out.println("str2 의 주소값 : " + System.identityHashCode(str2)); // 같게 나옴
		
		System.out.println("str 의 주소값 : " + System.identityHashCode(str)); // 혼자 다름
		
		String str3 = "hi";
		System.out.println(str1 == str3); // false
		System.out.println("str3의 주소값 : " + System.identityHashCode(str3));
		
		// String 클래스 == 불변클래스 (변하지 않는 클래스)
		// 그럼 값을 못 바꾸는 건가요? 아님..
		// 변경이 가능하기는 하나 그 자리에서 수정되는 개념이 아님.
		
		
		str3 = "bye" ;
		System.out.println("str3의 주소값 : " + System.identityHashCode(str3)); // 다른 주소값으로 바뀜!
		
		str3 = "hello";
		System.out.println("str3의 주소값 : " + System.identityHashCode(str3)); // str1, 2 의 "hello"의 주소값으로 바뀜
		// == 으로 잘 안 됨 하지마셈
		
		
		
		
		
		
		
	}
}
