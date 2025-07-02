package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		
		/*
		 *  for each문 (향상된 for문)
		 *  배열 또는 컬렉션과 함께 사용이 된다 컬렉		 
		 *  배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 모두 접급할 목적일 때
		 *  
		 *  [표현법]							
		 *  for(순차적으로 접근할 값을 담을 변수 선언: 순차적으로 접근할 배열명 또는 컬렉션 명){
		 *  	반복적으로 실행할 코드
		 *  }
		 *  처음부터 마지막까지 접근할 목적
		 * 
		 */
			//자료형 변수명 : 
		for(int value : arr) { //value=arr[0] = > value = arr[1].. [i] 인덱스 값
			System.out.println(value);
		}
		
		Phone[] phones = new Phone[3]; // 여기까지는 칸만 세 개 생긴거지 실질적으로 폰이라는 객체가 생긴 것은 아님
		
		
		// 요기가 찐 객체생성(매개)
		phones[0] = new Phone("벨벳폰", "엘지", 1000000, "1"); 
		phones[1] = new Phone("갤럭시", "삼성", 1200000, "s25"); 
		phones[2] = new Phone("아이폰", "애플", 1400000, "17Pro"); 
		
		phones[1].setSeries("s25엣지"); // setter 메소드로 변경
		
		int total = 0 ; //?????????????????????????????????
		for(Phone p: phones) { // p=phones[0] = > p=phones[1] > p=phones[2]
			total += p.getPrice();
			System.out.println(p.information());
		}
		System.out.println("총합계 : "+total);
		System.out.println("평균가 : "+total / phones.length);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("구매하고자하는 핸드폰 : ");
		String buy = sc.nextLine();
		for(Phone p : phones) { // p= phones[1~3] ?
			
			if(p.getName().equals(buy))
			System.out.println("가격:" + p.getPrice());
		}
		
		
		

	}

}
