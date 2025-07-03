package com.kh.chap02_abstractAdnlntepace.part01_easy.run;

import com.kh.chap02_abstractAdnlntepace.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAdnlntepace.part01_easy.model.vo.Sports;
import com.kh.chap02_abstractAdnlntepace.part01_easy.model.vo.basketBall;

public class EasyRun {

	public static void main(String[] args) {
		
		//모자란 추상클래스로는 객체 생성불가함(왜? 미완성 클래스이기때문에)
		//Sports s = new Sports(); // 객체생성이안될뿐이지 레퍼런스로 사용은 가능하다 뉴베스킷볼 뉴 풋볼은 가능
		
		Sports s = new basketBall();
		
		Sports[] arr = new Sports[2];
		arr[0] = new basketBall();
		arr[1] = new FootBall();
		
		for(int i = 0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		//향상된 for문
		
		for(Sports a :arr) { // a=arr[0] = > [1]
			a.rule(); // 동적바인딩으로 자식클래식의 오버라이딩 메소드가 실행됨
		}
		
		/*
		 * 동적바인딩: 컴파일 시점에서는 정적바인딩으로 현재 레퍼런스의 자료형 클래스에 있는 메소드를 가리키긴함
		 * 			런타임시점(실행시점)에서는 동적바인딩으로 각가의 자식 클래스에 오버라인딩된 메소드가 있을 경우 그거 실행.
		 */
		
		/*
		 * *추상메소드
		 * -미완성된 메소드로 몸통부가 구현되어있지않은 메소드를 추상메소드라고 함
		 * 
		 * *추상클래스
		 * -미완성된 클래스
		 * -일반필드+일반ㅂ메소드 [+추상메소드]
		 * => 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야됨
		 * 
		 * * 추상 메소드가 굳이 없어도 추상클래스로 만들 수 있다.
		 * 언제 사용되나요 ?
		 * 
		 * >개념적 :단지 이 클래스가 아직 미완성인 클래스라는 걸 부여할 목적으로
		 * >프로그래밍적: 객체 생성이 안되게끔하고자할때
		 * 
		 * *추상메소드가 존재하는 추상클래스를 쓰는 이유
		 * -부모클래스에서 추상메소드가 존재할경우 자식클래스에서는 강제 오버라이딩을 해서 동일한 패턴의 메소드를 가지게 됨
		 * 
		 * => 각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드를 구현햇으면 할때		 
		 * 
		 * */
		

	}

}
