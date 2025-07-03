package com.kh.chap02_abstractAdnlntepace.part02_basic.model.vo;

public abstract class Person implements Basic {
									// 베이직이라는 인터페이스를 구현한
									// 추상
	private String name;
	private double weight;
	private int health;
	
	public Person() {}
	public Person(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name =name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight= weight;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health =health;
	}
	
	@Override
	public String toString() {
		return name +"," + weight +"," + health;
	}
	
	//public abstract void eat(); // 추상메소드 가지고 있으면 무조건 추상 클래스를 추가해줘야 한다.
	//public abstract void sleep();

}
