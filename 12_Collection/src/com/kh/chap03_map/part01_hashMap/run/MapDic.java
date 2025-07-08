package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Scanner;

public class MapDic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		while(true) {
			System.out.println("찾고 싶은 단어는? : ");
			String word = sc.nextLine(); // key값
			
			if(word.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				return; //break; 도 됨
			}
			
			String kor = dic.get(word); // String 반환. 한글
			if(kor == null) {
				System.out.println(word + "는 없는 단어입니다.");
			}else {
				System.out.println(kor);
			}
		}
	}

}
