package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;


public class TokenMenu {

	Scanner sc = new Scanner(System.in);
	
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		
	        
		while (true) {
			System.out.println("1. 지정문자열");
			System.out.println("2. 입력문자열");
			System.out.println("5. 프로그램 끝내기");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				break;
			}
		}
	}
	
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
			System.out.println("토큰 처리 전 글자 : " + str);
			System.out.println("토큰 처리 전 개수 : " + str.length());
			
		String[] arr = str.split(" ");
		System.out.print("토큰 처리 후 글자 :");
		for(String a : arr) {
			System.out.print(a);
		}
		System.out.println();
		
		System.out.println("토큰 처리 후 개수 : " + arr.length);
		System.out.println("모두 대문자로 변환 : " + str.toUpperCase());
	}
	
	
	public void inputMenu() {}
	


}
