package com.kh.chap01_ploy.part02_electronic.model.vo;

public class Tablet extends Electrionic{
	
	private boolean penFlag;
	
	public Tablet() {}
	public Tablet(String brand, String name, int price, boolean penFlag) {
		super (brand, name, price);
		this.penFlag = penFlag;
	}
	
	public boolean isPenFlag() {
		return isPenFlag();
	}
	
	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}
	
	public String toString() {
		return super.toString() + ","+ (penFlag ? "있음":"없음");
	}
}
