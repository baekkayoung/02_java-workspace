package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle {
		
	private int tire;
	
	public Car() {}
	
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage,kind);
		this.tire= tire;
	}
	
	public int getTire() {
		return tire;
	}
	
	public void setTire(int tire) {
		this.tire=tire;
	}
	
	@Override
	public String information() {
		return super.information() +  ", tire : " + tire;
	}
	
	@Override //@ : 어노테이션 생략가능 쓰게 되면 오타 알려줌
	public void howToMove() { // 오버라이드 했는데 메소드 오타내면 부모랑 다르다고 알려줌
		System.out.println("바퀴를 굴려 움직인다"); // 자식이 우선순위로 된다. 오버라이딩
	}
	
	//원래 오브젝트에 있던 메소드
	@Override
	public String toString() {
		return super.information() + ", tire : " + tire;  // 업승ㄹ떈 주소값나ㅗ았ㄴ느데?
		
		
	}
}
