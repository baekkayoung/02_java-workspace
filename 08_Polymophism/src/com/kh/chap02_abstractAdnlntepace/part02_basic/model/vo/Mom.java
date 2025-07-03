package com.kh.chap02_abstractAdnlntepace.part02_basic.model.vo;

public class Mom extends Person{

	private String babyBirth; // 아이의 탄생 출산 | 입양 | 없음
	
	public Mom() {}
	public Mom(String name, double weight, int health, String babyBirth) {
		super (name, weight, health);
		this.babyBirth=babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	public String toString() {
		return super.toString() + "," + babyBirth;	
		}
	
	
	
	
	
	// 부모의 추상메소드가 뜸
	@Override
	public void eat() {
		// 밥 먹으면 몸무게 10 증가
		super.setWeight(super.getWeight()+10);
		// 밥 먹으면 건강점수 10감소
		super.setHealth(super.getHealth()-10);
	}

	@Override
	public void sleep() {
		//잠사면 건강점수 20증가
		super.setHealth(super.getHealth()+20);
		
	}
	
}
