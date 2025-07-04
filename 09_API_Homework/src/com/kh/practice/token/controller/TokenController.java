package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

		// 기본생성자
		public TokenController() {}

//		public String afterToken(String str) {
//			
//			// 매개변수로 받아온 str을 StringTokenizer를 이용하여
//			StringTokenizer st = new StringTokenizer(str," ");
//			// 띄어쓰기를 없애고 없앤 문자열 반환
//			StringBuilder sb = new StringBuilder();
//			return str;
//			}
//		
//		public String firstCap(String input){
//			(input)
//			
		public String afterToken(String str) {
			StringTokenizer st = new StringTokenizer(str, " ");
			String result = "";

			while (st.hasMoreTokens()) {
				result = result.concat(st.nextToken());
			}

			return result.toString();
		}
		
		
		
	
		
//		public int findChar(String input, char one){
//			
//		}

	
	
//		public String firstCap(String input){
//		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
//		}
	
	
	
//		public int findChar(String input, char one){
//		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
	
	
	
	
}
