package com.kh.pratice.func;

import java.util.Scanner;

public class VariablePratice1 {

	public void inputTest1(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String sex = sc.nextLine();
		
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble(); 
		
		System.out.println("키 " + height + "인 " + age + "살 " + sex +" "+ name +"님 반갑습니다^^");

	}

}
