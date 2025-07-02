package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		/*
		 * *상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * - 중복된 코드를 별도로 관리하기 때문에 코드의 추가나 변경에 용이
		 * => 프로그램의 생산성과 유지보수에 크게 기여
		 */
		
		// Desktop 객체 생성
		// brand, pCode, pName, price, allInOne
		
		Desktop d = new Desktop("삼성" , "d-01", "짱짱데스크탑", 20000000, true);

		// Tv 객체 생성
		// brand, pCode, pName, price, inch
		Tv t = new Tv("엘지", "t-01", "겁나얇은티비", 3500000, 85);
		
		// SmartPhone 객체 생성
		// brand pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1300000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information()); // 부모랑 똑같은 메소드가 있을 땐 자식이 우선
		
		s.setPrice(800000); // product에서 있던 메소드 호출
		s.setMobileAgency("SKT"); // smartPhone 클래스에 있는 메소드 호출
		
		/*
		 * * 상속의 특징
		 * - 자식 객체를 가지고 부모클래스에 있는 메소드를 마치 내것처럼 호출 가능
		 * - 부모클래스에 있는 메소드를 오버라이딩을 통해 자식 클래스에서 재정의가 가능하다.
		 * => 오버라이딩을 하는 순간 자식클래스에 있는 메소드가 우선권을 가짐.
		 * 클래스간의 상속은 다중 상속이 불가능 하다. (단일 상속만 가능하다)
		 */
		
	}
		

	
	}


