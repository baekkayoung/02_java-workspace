package com.kh.chap04_field.model.vo;

public class FieldTest3 {
	// static 공유의 개념
	// static이 붙은 애들은 프로그램 실행과 동시에 메모리의 static 영역에 올라감
	// 프로그램 실행과 동시에 메모리상에 한 번 올려놓고 여기저기에 가져다 쓰는 개념
	// public이랑 같이 쓰자!
	
	public static String sta = "static_FieldTEst3";
	
	// 상수필드(static final)
	public static final String STA_FIN = "static_final";
}
