package com.hw1.model.vo;

public class Product {
	
	// 필드부 
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	
	//기본생성자
	public Product() {}
	
	
	
	//전체 매개 변수 생성자
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
		
	/*
	 * Product(productId:String,
productName:String, productArea:String,
price:int, tax:double)
	 */
	
	//메소드부
	// -setter
	
	public void setProductId(String productId) {
		this.productId=productId;
	}
	
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	public void setProductArea(String productArea) {
		this.productArea=productArea;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void setTax(double tax) {
		this.tax=tax;
	}
	
	//메소드부
	// -getter
	
	public String getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getProductArea() {
		return productArea;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getTax() {
		return tax;
	}
	
	// information
	
	public String information () {
		return "상품명: " + productId + "부가세 포함 가격 : ";
	}
	
	
	

}
