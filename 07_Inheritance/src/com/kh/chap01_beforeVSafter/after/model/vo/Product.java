package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	
	// 세 클래스가 모두 공통적으로 가지고 있는 요소들
	
	private String brand;
	private String pName;
	private String pCode;
	private int price;
	
	public Product() {}
	
	public Product(String brand, String pName, String pCode, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price= price;
	}
	
	public String information() {
		return "brand :" + brand + ", pCode:" + pCode + ", pName: " + pName + ", price: "+ price;
	}
	
	
	

}
