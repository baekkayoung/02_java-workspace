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

		int[] copy = origin; 
		// 주소값이 같아짐! 같은 배열을 가리키도록 하는것 

		System.out.println("==== 복사본 배열 ====");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		copy[2] = 99; //배열의 인덱스 값 대입
		// origin[2] = 99;와 똑같은 효과 : 같은 배열의 주소를 참조하고 있어서
		
		System.out.println("====== 복사본 배열 값 변경 후 ======");

		System.out.println("==== 원본 배열 ====");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		// copy만을 바꿨는데 왜 원본도 바뀌어있는지?
		// ->origin이랑 copy가 같은 곳을 참조하고 있기 때문.
		
		System.out.println("orgin 주소값: " + origin.hashCode());
		System.out.println("copy 주소값: " + copy.hashCode());
		// 얕은 복사 : 주소값 (origin=copy 수준)을 복사
		
		System.out.println("==== 복사본 배열 ====");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}	//주소만 복사하는 것이므로 하나만 바뀌어도 같이 바뀜.
	
	
	public void method2() {
		// 1. for문 이용
		int[] origin = {1,2,3,4,5}; //원본 배열
		
		int[] copy = new int[5]; // 새로운 배열
		/*
		 * copy[0] = origin[0];
		 * copy[1] = origin[1]; // 숫자빼고 고정
		 */
		
		for(int i=0; i<copy.length; i++) {
			copy[i] = origin[i];  // 깊은 복사
			//다른 주소값을 사용하면서 값만 같다.
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
		
	
		copy[2] = 99; // copy의 2번 인덱스만을 변경
		
		
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
		
		//배열의 값만 복사하면, 서로 영향을 주지 않는다
		
	}
	
	
	public void method3() {
		// System이라는 클래스에서 제공하는 arraycopy() 메소드
		int[] origin = {1,2,3};
		int[] copy = new int[10];
		
		//System.arraycopy(원본배열명, 복사할시작인덱스, 복사본배열명, 복사본배열의 복사될 시작인덱스, 복사할 개수)
		//System.arraycopy(origin, 0, copy, 0, 3 );
		//System.arraycopy(origin, 0, copy, 2, 3);
		//System.arraycopy(origin, 1, copy, 3, 2);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " "); // 아직 값 안 줘서 0...
		}
		
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode()); // 깊은 복사
	}
	
	
	public void method4() {
		// 3. Arrays 클래스 제공하는 copyOf() 메소드 사용 -> 얕은 복사
		
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
		// 완전 똑같이 복사할 때! -> 얕은 복사
		
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
