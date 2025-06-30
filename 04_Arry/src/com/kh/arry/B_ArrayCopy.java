package com.kh.arry;

import java.util.Arrays;

public class B_ArrayCopy {

	public void method1() {
		int[] origin = { 1, 2, 3, 4, 5 };

		// 1 2 3 4 5
		System.out.println("==== 원본 배열 ====");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}

		System.out.println();// 프린트는 개행 안되니까 개행 해주고

		int[] copy = origin; // 주소값이 같아짐! 여기서 origin은 배열이 아니라 오리진의 주소

		System.out.println("==== 복사본 배열 ====");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		copy[2] = 99;
		System.out.println("== 복사본 배열 값 변경 후 ==");

		System.out.println("==== 원본 배열 ====");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		// copy만을 바꿨는데 왜 원본도 바뀌어있는지?
		// ->origin이랑 copy가 같은 곳을 참조하고 있기 때문.
		
		System.out.println("orgin 주소값: " + origin.hashCode());
		System.out.println("copy 주소값: " + copy.hashCode());
		
		// 얕은 복사 : 주소값을 복사
		
		System.out.println("==== 복사본 배열 ====");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}
	
	public void method2() {
		// 1. for문 이용
		int[] origin = {1,2,3,4,5};
		
		int[] copy = new int[5];
		/*
		 * copy[0] = origin[0];
		 * copy[1] = origin[1]; // 숫자빼고 고정
		 */
		
		for(int i=0; i<copy.length; i++) {
			copy[i] = origin[i];
		}
		
		
		System.out.println("==== 원본 배열 ====");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		System.out.println("==== 복사본 배열 ====");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
	
		copy[2] = 99;
		
		
		System.out.println("==== 원본 배열 ====");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		System.out.println("==== 복사본 배열 ====");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("orgin 주소값: " + origin.hashCode());
		System.out.println("copy 주소값: " + copy.hashCode()); // 주소 다름
		
		
		
	}
	
	public void method3() {
		// System이라는 클래스에서 제공하는 arraycopy() 메소드
		int[] origin = {1,2,3};
		int[] copy = new int[10];
		
		// System.arraycopy(원본배열명, 복사할시작인덱스, 복사본배열명, 복사본배열의 복사될 시작인덱스, 복사할 개수)
		//System.arraycopy(origin, 0, copy, 0, 3 );
		//System.arraycopy(origin, 0, copy, 2, 3);
		//System.arraycopy(origin, 1, copy, 3, 2);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode()); // 깊은 복사
		//이거왜????????
	}
	
	public void method4() {
		// 3. Arrays 클래스 제공하는 copyOf() 메소드 사용
		
		int[] origin = {1,2,3,4,5};
		// 복사본 배열 = Arrays.copyOf(원본배열명, 복사할길이);
		int[] copy = Arrays.copyOf(origin, 5); // 5 초과시 0으로 채워줌
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
	}
	
	/*
	 * [참고] import
	 * java.lang.Math 
	 * java.lang.String
	 * java.lang.System
	 * => java.lang 패키지에 있는 클래스들은 import 하지 않아도 사용 가능!
	 * 
	 * java.util.Scanner
	 * java.util.Arrays
	 * => java.lang 이외의 패키지에 있는 클래스들을 쓸 때는 무조건 import 해야한다!
	 * 
	 */
	
	public void method5() {
		// 4. clone() 메소드 이용 **중요
		// 완전 똑같이 복사할 때!
		
		int[] origin = {1,2,3,4,5};
		// 복사본 배열 = 원본배열.clone();
		int[] copy = origin.clone();
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
