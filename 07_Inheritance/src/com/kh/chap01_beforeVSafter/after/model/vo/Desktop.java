package com.kh.chap01_beforeVSafter.after.model.vo;
//			  자식 	-------->  부모
//            하위   -------->  상위
//            후손   -------->  조상
//            this  -------->  super
public class Desktop extends Product {
 // extends Product를 상속

	private boolean allInOne;
	
	public Desktop() {}
	
	//상속을 받았더라도 다 써야함
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		
		// brand ~ price 부모꺼..
		// super.으로 부모에 접근?
		// private로 되어있기때문에 접근 못 함
		
		// 해결방법1. 부모클래스에 있는 필드를 protected 접근 제한자로 수정
		
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		// 해결방법2. 부모클래스에 있는 setter 메소드를 활용하기(public이니까 접근 가능?)
		
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// 해결방법3. 부모 생성자 호출하기
		
		super(brand,pCode,pName,price); // desktop에 있는 인수들을가지고 super로 연결된 product로
		this.allInOne = allInOne;
	
	}
	
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	// 오버라이딩 : 부모 클래스의 메소드를 자식 클래스에서 재정의 하는 것
	public String information() {
		return super.information()+ ", allInOne: " + allInOne;
	}
	
}
