package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{ // 직렬화
	
	// 객체 자체를 입출력 하고자 한다면 직렬화 필수!
	
	
	//필드부
	private String name;
	private int price;
	
	
	//생성자
	public Phone() {}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	//getter-setter
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return name + "," + price;
	}
	
}
