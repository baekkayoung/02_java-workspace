package com.kh.arry;

import java.util.Scanner;

public class A_Array {
	
	Scanner sc = new Scanner(System.in);

	
	// 변수 : 하나의 공간에 하나의 값만 담을 수 있음
	// int a = 10, 20, 30; => X
	
	// 배열: 하나의 공간에 여러 개의 값을 담을 수 있는 개념
	//		"같은 자료형의 값"으로만 담을 수 있다
	//		배열의 각 인덱스 자리에 실제 값이 담김(인덱스는 0부터 시작)
	
	public void method1 () {
		/*
		 * 1.배열의 선언
		 * [표현법]
		 * 자료형 배열명[];
		 * 자료형[] 배열명; 
		 */
		
		//int a; // 는 변수 선언
		
		//int arr[];
		//int[] arr;//인트형 배열. 인트값만 담을 수 있음
		
		/*
		 * 2. 배열 할당(=크기 지정) 몇 칸으로 만들지?
		 *    배열명 = new 자료형[배열의 크기]
		 */
		// arr = new int[5]; //arr이라는 배열명에 5개가 들어있는 int형
		
		int[] arr = new int[5];// 선언과 할당 동시에
		
		/*
		 * 3. 값대입
		 *    배열명[인덱스] = 값;
		 */
		
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		for(int i =0; i<5; i++) {
			arr[i] = i;
		}
		
		for(int i = 0 ; i< 5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); //실제 arr이라는 박스에는 "주소값"이 담겨있음!
		
	}
	
	public void method2() {
		int[] iArr = new int [5];
		System.out.println(iArr); // 주소값
		
		double[] dArr = new double [3];
		System.out.println(dArr); // 주소값
		
		/*
		 * 실제 리터럴값을 곧바로 담을 수 있는 변수는 일반변수 (int a..)
		 * 주소값을 담고 있는 변수는 참조변수(레퍼런스 변수)라고 한다. 배열은 참조변수
		 */
	}

	public void method3() {
		int[] iArr = new int[3]; //0번 ~ 2번 . 힙에 생겨야 하니까 new
		double[] dArr = new double[4]; // 0번 ~ 3번 인덱스
		
		for(int i=0; i<4; i++) { // 초기화가 0으로. 담겨있음 heap 영역의 특성
			System.out.println(dArr[i]); // i - 0 0 0 , d - 0.0 0.0 0.0
			
		}
		
		// 내가 각 인덱스에 초기화(값을 주는)하지 않아도 값들이 담겨있음! 왜?
		// Heap이라는 공간에는 절대 빈 공간이 존재할 수 없음!
		// 따라서 공간이 만들어질때 JVM이 기본적으로 초기화를 진행
		
	}
	
	public void method4() {
		int[] arr = new int[10];
		for(int i = 0; i<10; i++) { // 10대신 arr.length 넣으면 더 안전
			arr[i] = i+1;
		}
		
		for(int i=0; i<10;i++) { // 10대신 arr.length 넣으면 더 안전
			System.out.println(arr[i]);
		}
		System.out.println(arr); // [I@626b2d4a I:배열의 자료형 + @ + 주소값 16진수
		System.out.println(arr.hashCode()); // 주소값 10진수 형태
		System.out.println(arr.length); // 배열의 길이
	}
	
	public void method5() {
		// 배열쓰면서 볼 수 있는 오류들
		// int[] arr; -> 초기화, 그러니까 크기지정(할당)을 까먹은 경우
 		int[] arr = null; // 아무것도 참조하고 있지 않다. 
		
		
		// System.out.println(arr);
		
		// null을 가지고 메소드를 호출한다거나 특정 어딘가에 접근하고자 한다면 항상 에러
		// System.out.println(arr.hashCode()); => 오류: NullPointerException
		// System.out.println(arr.length);
		// System.out.println(arr[0]);
	}
	
	
	
	public void method6() {
			int[] arr = new int [5];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = i; // 0 1 2 3 4 
			} 
			// 배열의 범위 벗어나서 추가해보기
			// arr[5] = 5; =>ArrayIndexOutOfBoundsException:배열에 부적절한 인덱스 제시시 에러
			
			// *배열의 가장 큰 단점
			// - 한 번 지정된 배열의 크기는 변경이 불가 (자스와 다름)
			
			arr = new int[7]; //다시 만들기
			
			/*
			 * 연결이 끊어진 기존 배열은 Heap 영역에 둥둥 떠다님..(어디에도 참조되어있지 않으므로 필요없는 존재 == 지워주는게 좋다)
			 * 일정 시간이 지나면 가비지 컬렉터(GC)가 지워줌
			 * => 자바에서의 "자동 메모리 관리"
			 */
			
			// 배열을 강제로 삭제시키고자 한다면?
			arr = null; //아무것도 바라보고 있지 않겠다. 참조하지 않겠다. GC가 지워줌
			System.out.println(arr);
			
	}
	
	public void method7() {
		//배열 선언, 할당, 초기화 다 동시에 하기
		
		//표현법 1
		int[] arr1 = new int[] {1,2,3,4};
		
		//표현법 2 (자주 씀)
		int[] arr2 = {1,2,3,4};
		
		System.out.println(arr1 == arr2); 
		//각각 변수의 주소값을 비교하는 것이기 때문에 false가 뜸
	}
	
	
	public void method8() {
		// 1. 크기 10짜리인 정수배열
		int[] arr = new int[10];
		
		// 2. 반복문 활용해서 값을 대입 1~100 사이에 발생되는 랜덤값을 넣어주기
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() *100 +1);
		}
		
		// 3. 반복문 활용해서 출력
		// arr[x] : xx
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}
	
	public void method9() {
		
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		
		sc.nextLine();
		
		String[] arr = new String[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("좋아하는 과일 입력 : ");
			arr[i] = sc.nextLine(); // ?
		}
		
		//arr[1]: 바나나
		for(int i=0; i<arr.length;i++){
			System.out.println("arr["+ i + "]" + arr[i]);
		}
	}

	public void method10() {

		// 1. 사용자에게 문자열 입력 받기
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();

		// 2. 쪼개서 캐릭터 배열에 넣기
		char[] arr = new char[str.length()];

		// 3. 반복문을 활용해서 값대입

		/*
		 * arr[0] = str.charAt(0); 
		 * arr[1] = str.chatAt(1); ...
		 */
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		//4.출력
		//arr[i] : k
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr["+ i + "]:" + arr[i]);

	}
	}
}
