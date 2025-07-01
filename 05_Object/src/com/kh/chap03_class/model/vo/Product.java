package com.kh.chap03_class.model.vo;

public class Product {

	/*
	 * * 필드(field)
	 * 
	 *  필드 == 멤버변수 == 인스턴스 변수
	 *  
	 *  [표현법]
	 *  접근제한자 자료형 변수명; => 필드
	 */
	private String pName;
	private int price;
	private String brand;
	
	/*
	 * 생성자 자리
	 * -객체를 생성하기 위한 일종의 메소드
	 * 
	 * [표현법]
	 * 접근제한자 클래스명([매개변수1, 매개변수2]){
	 *   반환형없는이유:구분위해
	 * 
	 * }
	 */
	// 기본생성자 : JVM이 만들어줌
	public Product() {}
	
	// 매개변수 생성자  : 받아주기
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	/*
	 * 메소드부
	 * - 기능을 처리하는 담당
	 * 
	 * [표현법]
	 * 접근제한자 반환형 (스트링 보이드 인트) 메소드명([매개변수]){
	 * 
	 * }
	 */
	//setter
	
						//p네임을받아와야하니까
	public void setpName(String name) {
		this.pName=name;
	}
	
	public void setPrice(int price) {
		this.price=price; //필드부에 대입하는건가?
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	
	
	//getter
	
	public String getName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	//information
	public String information() {
		return "pName : " +pName +", price : " + price + ", brand : " + brand;
	}
	
	

}
