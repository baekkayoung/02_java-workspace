package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 매개변수 생성자를 이용하여 3개의 객체 생성 (위의 사용 데이터 참고)
		// 객체가 가진 필드 값 출력 확인
		
		Product p1 = new Product();
		
		p1.setProductId("ssgnote9");
		p1.setProductName("갤럭시노트9");
		p1.setProductArea("경기도 수원");
		p1.setPrice(960000);
		p1.setTax(10.0);
		
		System.out.print(p1.getProductName()+" ");
		System.out.print(p1.getProductId()+" ");
		System.out.print(p1.getProductArea()+" ");
		System.out.print(p1.getPrice()+" ");
		System.out.println(p1.getTax()+" ");
	
		
		Product p2 = new Product();
		
		p2.setProductId("lgxnote5");
		p2.setProductName("LG스마트폰5");
		p2.setProductArea("경기도 평택");
		p2.setPrice(780000);
		p2.setTax(0.7);
		
		System.out.print(p2.getProductName()+" ");
		System.out.print(p2.getProductId()+" ");
		System.out.print(p2.getProductArea()+" ");
		System.out.print(p2.getPrice()+" ");
		System.out.println(p2.getTax()+" ");
		
		
		Product p3 = new Product();
		
		p3.setProductId("ktsnote3");
		p3.setProductName("KT스마트폰3");
		p3.setProductArea("서울시 강남");
		p3.setPrice(250000);
		p3.setTax(0.3);
		
		System.out.print(p3.getProductName()+" ");
		System.out.print(p3.getProductId()+" ");
		System.out.print(p3.getProductArea()+" ");
		System.out.print(p3.getPrice()+" ");
		System.out.println(p3.getTax()+" ");
	
		System.out.println("======================================");
		
		
		// 각 객체의 가격을 모두 120만원으로 변경 / 부가세율도 모두 0.05로 변경
		// 객체가 가진 필드 값 출력 확인
		
		
		p1.setPrice(1200000);

	}
}
