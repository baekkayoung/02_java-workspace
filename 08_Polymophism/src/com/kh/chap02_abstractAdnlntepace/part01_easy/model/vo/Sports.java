package com.kh.chap02_abstractAdnlntepace.part01_easy.model.vo;

public abstract class Sports {
	private int people;
	
	public Sports() {}
	public Sports(int people) {
		this.people = people;
	}
	
	public int getPeople() { // 머리부
		return people; // 몸통부 : 이게 없으면 완벽한 메소드 아님
	}
	
	public void srtPeople(int people) {
		this.people=people;
	}
	
	public String toString() {
		return ""+people;
	}
	
	// 미완성된 메소드 (추상메소드 : 아직 미오나성된 메소드)
	//public void rule(); 머리부만있고 몸통부가 업서서 에러남
	public abstract void rule();  // 한개라도 가지면 클래스도 앱스트래긍로 바꿔줘야ㅕ
	// 미완성된 메소드가 잇다는ㄴ 소리는 이 크래스도 아작운 마완성이라는ㄴ이야기
	
	//글엄 어제? = > 해당 추상클ㄹ래스를 상속받는 자식에서!
	

}
