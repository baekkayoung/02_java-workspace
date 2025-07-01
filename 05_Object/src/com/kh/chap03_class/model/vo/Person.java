package com.kh.chap03_class.model.vo;

public class Person {

	// 필드부 2. 필드 생성.
	
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	
	// setter 만들기 차례대로 세터, 게터 만들고
	
	//접근제한자 반환형
	public void setId(String id) { 
		this.id=id; // 윗쪽아이디 가리키려면 / 받아온아이디
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String Email) {
		this.email = email;
	}
	
	
	
	//getter 7개
	
	public String getId() {
		return id; // 필드부 아이디
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	
	public String information() {
		return "id: " + id + ", pwd: " + pwd + ", name: " + name + ", age: " + age + ", gender:" + gender + ", phone: " + phone; // 자바에서 값은 하나밖에 리턴 못 함
	} //7개의 값을 모아서 리턴만
	

}
