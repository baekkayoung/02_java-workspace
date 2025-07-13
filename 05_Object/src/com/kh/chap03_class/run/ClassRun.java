package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 생성 => new
		
		//객체 p 생성 먼저.
		
		Person p = new Person(); // 메모리 영역에 생김
		
		System.out.println(p.getId()); // 초기값 null 이 들어가 있음.
		System.out.println(p.getAge()); // 0
		System.out.println(p.getGender()); // 공백
		
		// 생성 후 필드에 담긴 값을 곧바로 알아보면
		// JVM이 초기화까지 진행해줬음!!
		
		// 바꿔보기 // 매개변수에 인수값보내서 저장시키기.
		p.setId("user01");
		p.setPwd("pwd01");
		p.setName("백가영");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010-2289-4895");
		p.setEmail("baekkayoung@naver.com");
		
		//반환하기
		System.out.println("아이디 : " + p.getId());
		System.out.println("비밀번호 : " + p.getPwd());
		System.out.println("휴대폰 번호 : " + p.getPhone());
		
		System.out.println("======================");
		System.out.println(p.information()); // 냅다 p.~쓴다고 호출 x
		
		System.out.println();
		
//////////////////////////////////////////////////
		// 프로덕트 객체 생성
		// 첫번째 방법 : 기본생성자로 객체를 생성 후 setter 메소드로 값 설정
	
		Product p1 = new Product(); // 객체 생성. 컨트롤 클릭 : 기본생성자 호출
		//new Product() -> Product 클래스의 기본 생성자(public Product() {})를 호출해서 객체를 만들어줘!
		
		p1.setpName("갤럭시");
		p1.setPrice(1200000);
		p1.setBrand("삼성");
		System.out.println(p1.information());
		// 두번째 방법 : 매개변수 생성자로 생성과 동시에 값 초기화

		/*
		 *  Product p2 = new Product();
			p2.setName("갤럭시");
			p2.setPrice(12000000);
			p2.setCompany("삼성"); 이걸 줄이면 아래
		 */
		
		Product p2 = new Product("갤럭시", 12000000, "삼성"); // 인수를 받아주는 생성자가 없음.
		// 컨트롤 클릭으로 확인해보기
		System.out.println(p2.getName()); // 객체 생성은 되는 것같은데 여전히 null
		//클래스에 this 추가주고나서야 갤럭시로 변환
		System.out.println(p2.information());
		
	}
}
