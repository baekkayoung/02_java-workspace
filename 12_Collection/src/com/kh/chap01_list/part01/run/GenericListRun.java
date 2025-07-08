package com.kh.chap01_list.part01.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {

		ArrayList<Music> list = new ArrayList<Music>(); // []
		// 제너릭
		
		list.add(new Music("hype boy", "뉴진스")); // 이제 뮤직형만 올 수 있음
		list.add(new Music("ㅈㅣㅂ", "한로로"));
		// list.add("가보자고") x  : 다른 타입 담기 불가
		
		System.out.println(list);
		
		list.add(1, new Music("popo","백예린"));
		System.out.println(list);
		
		List<Music> sub = list.subList(0, 2); // 반환도 Music generic 붙여서 반환
		
		list.addAll(sub);
		System.out.println(list);
		
		/*	원래 이랬는데..
		 * 	Music m = (Music)list.get(0);  
			String s = (String)list.get(3); 
		 */
		Music m = list.get(0); // 강제 형변환 안 해도 됨 
		System.out.println(m);
		System.out.println(list.get(1).getArtist());
		
		for(Music ms :list) { // Object 안 해도 됨! 뮤직으로 제너릭 해서 ㅎㅎ
			System.out.println(ms);
		}
		
		/*
		 * 제네릭<>을 사용하는 이유
		 * 1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음
		 * 2. 컬렉션에 저장된 객체를 꺼내서 사용을 할 때 매번 형변환하는 절차를 없애기 위해
		 */
		
	}

}
