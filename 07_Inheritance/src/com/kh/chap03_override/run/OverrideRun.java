package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book bk1 = new Book("수학의 정석", "나수학", 100);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다", "고래", 200);
		
		System.out.println(bk1.toString()); // 주소값을 갖는거..? 객체 // .toString 해놨음
		System.out.println(bk2); //toString은 주소값을 가지는 객체여야만 투스트링이. 배열도 되겠져
		
		int a = 10;
		System.out.println(a); // 값이니까 안 뜸
		
		
		//출력문에 레퍼런스 객체를 출력하고자 할 때 JVM이 자동으로 해당 레퍼런스객체.toString() 메소드 호출
		
		//Override 전 : Object 클래스의 toString() 실행 = > 풀클래스명 + @ + 객체의 16진수 주소값 리턴
		// 후에는 Book이라는 클래스의 toString() 실행 => 해당 객체가 가지고 있는 모든 필드값을 한 문자열로 합쳐서 return.
		
		
	}

}
