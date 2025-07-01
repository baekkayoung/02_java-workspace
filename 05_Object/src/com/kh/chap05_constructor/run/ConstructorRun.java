package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u1 = new User(); // 스탯 영역에 생기고 뉴때문에 힙에 칸
		System.out.println(u1.information());
		
		//각 필드에 JVM의 초기값이 담겨있음!
		
		//바꿔주기
		u1.setUserId("user01");
		u1.setUserPwd("pwd01");
		u1.setUserName("차은우");
		
		System.out.println(u1.information()); // 나옴
		
		//바로는 못 하나?
		// 2. 매개변수 3개짜리 생성자로 객체를 생성
		User u2 = new User("user02", "pwd02", "박보검");
		System.out.println(u1.information());
		
		//3. 매개변수 전체 필드 넣어서 생성자로 객체 생성
		User u3 = new User("user03", "pwd03", "장원영", 20, 'F'); //User로 가서
		System.out.println(u3.information());
		
		//장원영 = > 장원일
		u3.setUserName("장원일");
		System.out.println(u3.information()); // 이름 바뀜
		
		System.out.println(u3.getUserId());//게터 세터 무조건 만들어놔야함
		
	}

}
