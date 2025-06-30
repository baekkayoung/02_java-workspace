package com.kh.chap02_encapsulation.model.vo;

public class Student {

	// 필드부
	
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
 	// 생성자부
	
	// 메소드부
	
	/*
	 * * 메소드
	 * [표현법] public void method(){}
	 * 접근제한자 반환형 메소드명([매개변수]){
	 * 		.. 실행할 코드
	 * }
	 */
	
	// - setter 메소드
	// 해당 필드에 대입시키고자 하는 값 전달 받아 해당 필드에 대입시켜주는 기능을 하는 메소드
								//여기에
	public void setName(String Name) {  //매개변수에 차은우 이름이 박힘// 관례적 표현
		
		// 필드.name = 매개변수name 원함
		// this에는 객체의 주소값이 들어가 있음 똑같은 애들 있어서 this
		this.name = Name;
		
	}
	
	public void setAge(int age) {
		
	//this 붙이면 필드부 age 가르킴
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorSocer(int korScore) {
		this.korScore = korScore;
		
	}	
	
	public void setmathSocer(int korScore) {
		this.mathScore = mathScore;
	}
	
	
	// - getter 메소드
	// 해당 필드에 담긴 값을 반환해주는 역할 수행
	
	// 뱉어내는 자료형. 리턴이 하나라도 있다면.
	public String getNmae() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getKorScore() {
		return korScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
}
