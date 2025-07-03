package com.kh.chap01_ploy.part02_electronic.controller;

import com.kh.chap01_ploy.part02_electronic.model.vo.Desktop;
import com.kh.chap01_ploy.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_ploy.part02_electronic.model.vo.Tablet;

public class ElectronicShop1 {
	
	// 용산 전자상사게 있는 가게
	// 3개 제품(데탑, 노트북, 테블렛)을 진열할 자리부터 만들자!
	
	//private int price; // 기본 자료형
	
	private Desktop desk; // 사용자 정의 자료형
	private NoteBook note;
	private Tablet tap;
	// 이거는 실제로 자리만 있는 거지 객체가 생성이 된 건 아님
	
	// Desktop 객체를 받아줄 수 있는 메소드 . 데스크탑 받아주려면 매개변수 필요
	public void insert(Desktop d) {
		desk =d ; //내가 받아온 데스크탑을 매대인 desk에 전시
	}
	// NoteBook 객체를 바아줄 수 있는 메소드
	public void insert(NoteBook n) {
		note = n; //노트라는 곳에다가 n을 넣겠다
	}
	
	// Tablet 객체를 받아줄 수 있는 메소드
	public void insert(Tablet t) {
		tap = t;
	}
	
	// 동일한 클래스에 동일한 메소드 명으로 여러개 만들어져 있는 것을 오버로딩이라고 한다.
	// 단, 매개변수는 달라야한다 (이름 말고)
	// 매개변수 종류, 개수, 순서 이런게 달라야 함
	
	
	// 조회용 메소드
	public Desktop selectDesktop() {
		return desk; // 데스크 자리에 잇는 게 리턴 // void 가 아닌 이유: 리턴해야되는데 de
	}
	
	public NoteBook selecNoteBook() {
		return note;
	}
	
	public Tablet selectTable() {
		return tap;
	}
	
	
	
	
	

}
