package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	
	// 필드
	
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	// 생성자
	
	public Desktop() {}

	public Desktop (String brand, String pCode, String pName, int price, boolean allInOne) {
        this.brand = brand;
        this.pCode = pCode;
        this.pName = pName;
        this.price = price;
        this.allInOne = allInOne;
    }
	
	
	// 세터




	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void set(int price) {
		this.price = price;
	}
	public void setBrande(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	// 게터
	
	
	public String getBrand() {
		return brand;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	
	public boolean isallInOne() {
		return allInOne;
	}

	public String information() {
		return brand + "," + pCode + "," + pName + "," + price + "," +allInOne;
	}	
	
	
	
}
