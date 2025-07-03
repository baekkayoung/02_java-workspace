package com.kh.chap02_abstractAdnlntepace.part02_basic.model.vo;

public interface Basic {
	
	
	//추상클래스 : 일반필드 + 일반메소드 [+ 추상메소드]
	//인터페이스 : only 상수 필드 + only 추상메소드
	
	// private int num;
	// public void test(){};
	
	// 인터페이스에서 필드는 무조건 상수필드임!
	/*public static final*/ int NUM =10;
	
	// 메소드도 무조건 추상메소드
	/*public abstract */ void eat();
	public abstract void sleep(); // 안써도 인식 됨
	
	
}
