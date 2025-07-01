package com.kh.chap04_field.model.vo;

public class FieldTest2 {
	
	/*
	 * *필드에서 사용가능한 접근제한자 4가지
	 *  
	 * public		=>어디서든(같은 패키지, 다른 패키지) 접근 가능
	 * protected	=>같은 패키지 접근 가능, 다른 패키지일 경우 상속구조에서는 접근 가능
	 * default		=>같은 패키지에서만 접근 가능(다른 패키지 절대 불가)
	 * private		=>only 해당 클래스 파일에서만 접근 가능
	 */
	
	public String pub = "public"; 
	protected String pro = "protected";
	String def = "default"; // 스캐너
	private String pri ="private";
	
	

}
