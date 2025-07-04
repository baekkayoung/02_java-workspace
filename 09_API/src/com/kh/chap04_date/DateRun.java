package com.kh.chap04_date;

import java.text.SimpleDateFormat;
import java.util.Date; // 확인

public class DateRun {

	public static void main(String[] args) {
		
		/*
		 * java.util.Date
		 */
		// 기본 생성자를 통해 생성 = > 현재 날짜 및 시간이 나온다
		Date date1 = new Date();
		System.out.println(date1);
		
		
		// 내가 원하는 날짜로 데이트 객체 만들기 (25.6.9)
		
		// 1) 매개변수 생성자를 통해서 생성
		Date date2 = new Date(2025-1900, 6-1, 9); // 2. = > Mon Jun 09 00:00:00 KST 2025
		System.out.println(date2); // 1. Thu Jul 09 00:00:00 KST 3925
		// 엣날에 만들어진거라 조금 이상
		
		// 2) 기본 생성자로 생성 후 setter 메소드로 값 변경
		date1.setMonth(6-1);
		date1.setDate(9);
		System.out.println(date1);
		
		// 2025년 6월 9일 10시 40분 12초 
		
		// 내 입맛대로 포맷을 적용해서 출력하게 해주는 클래스 이용
		// java.text.SimpleDateFormat 클래스
		
		// 1. sdf라는 객체를 생성 (내가 원하는 포맷을 매개변수로 넘겨줘야함
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		// 2. sdf의 메소드 호출
		String formatDate = sdf.format(date1);// String으로 반환한다.
		
		System.out.println(formatDate);
	
	}

}
