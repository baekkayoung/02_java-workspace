package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		/*
		 * * Wrapper 클래스
		 * => 기본 자료형을 객체로 포장할 수 있는 클래스가 랩퍼클래스 
		 * int a = 10; /  a.length => x
		 * 
		 * 기본 자료형 <--------> Wrapper 클래스
		 * boolean			   Boolean
		 * char				   Character *
		 * byte				   Byte
		 * short			   Short
		 * int				   Integer *
		 * long				   Long
		 * float			   Float
		 * double			   Double
		 * 
		 * => 기본 자료형을 객체로 취급해야하는 경우. 해야하는 이유?
		 *   : 메소드 호출해야될 때. 객체여야하는데.
		 *   : 메소드의 매개변수로 기본 자료형이 아닌 객체타입만이 요구될 때
		 *   : 다형성을 적용시키고자 할 때
		 */

		
		// Boxing 기본자료형 => Wrapper 클래스 자료형  :  변환
		
		int num1 = 10;
		int num2 = 15;
		
//		System.out.println(num1 == num2); // 값이 달라서 false
		
		// 1. 객체 생성 구문을 통한 방법
		
		Integer i1 = new  Integer(num1); // 결국
		Integer i2 = new  Integer(num2); // 주소값
		
		System.out.println(i1 == i2); // 주소값이 달라서 false
		
		// 객체화 시키면 메소드 호출 가능
		System.out.println(i1.equals(i2)); // 값이 false
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞쪽이 크면 1 뒤쪽이 크면 -1 반환, 같으면 0
		
		// 2. 객체 생성 따위 하지 않고 곧바로 대입하는 방법 (AutoBoxing)
		Integer i3 = num1; // 자동으로 integer로 변환
		System.out.println(i3.toString()); // 오버라이딩 안되어있으면 주소값인데 되어있어서 10으로 잘 나옴
		
		// 객체 생성을 통해서 반드시 변환해야 되는 경우 = > 문자열을 Integer 타입으로!!
//		Integer i4 = "123"; 문자열은 자동 오토박싱 안됨
		Integer i4 = new Integer("123"); // 이렇게는 가능.
		System.out.println(i4); // 123
		
		// UnBoxing : Wrapper 클래스 자료형 => 기본 자료형
		
		// 1. 해당 Wrapper 클래스에서 제공하는 메소드를 통해 xxxValue()
		int num3 = i3.intValue(); // 주소값을 가지고 있던 객체를.
		int num4 = i4.intValue();
		
		// 2. 메소드 따위 사용하지 않고 바로 대입하는 방법(AutoUnBoxing)
		int num5 = i1;
		
		// 이거 왜 하는 걸까?
		// 웹 개발을 할 때 값을 입력하면 무조건 !! 문자열로 날라옴!
		
		System.out.println("==================================");
		
		// 만약
		String age = "19";
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // 1015.3 문자열 + 문자열 = 하나의 문자열 이거 원하는 거 아니야
		
		// 1. String 문자열 --> 기본 자료형으로 바꿔야 함
		// "10" --> 10
		// "15.3" --> 15.3
		
		int i = Integer.parseInt(str1); //int로 바꿔줌
		double d =Double.parseDouble(str2);
		System.out.println( i + d ); // 더 큰 double 따라가서 25.3
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
