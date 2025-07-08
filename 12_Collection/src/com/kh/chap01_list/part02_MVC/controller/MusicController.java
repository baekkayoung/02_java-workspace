package com.kh.chap01_list.part02_MVC.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_MVC.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스. 그래서 출력문, 스캐너 안 나옴
public class MusicController {
		
	private ArrayList<Music> list = new ArrayList<Music>(); // [] , list는 전역변수! 조회하기 위해서
	
	// 초기화 블럭
	{
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		list.add(new Music("새삥 말고 헌삥", "지야코"));
		
	}
	
	
	public void insertMusic(String title, String artist ) { // 사용자에게 인수를 받아올 매개변수
		list.add(new Music(title, artist)); // 초기화 한 세 개 뒤에 새로운 객체 추가	
	}
	
	public ArrayList<Music> selectMusic() { // 반환형 void 말고 ArrayList<Music> 
		return list; // 전체곡 리턴
	}
	
	public int deleteMusic(String title) { // 얘 왜 int? result값이 반환되는데 result의 자료형이 int라서
		int result = 0; // 삭제가 되면 1 
		for(int i = 0; i<list.size(); i++) { // 0번부터 마지막 요소까지 도는데
			
			if(list.get(i).getTitle().equals(title)) { // 음악 i번 인덱스의 제목이랑 입력받은 타이틀이 같으면
				list.remove(i); // 삭제
				result = 1;
				break; // 삭제했으면 반복문 빠져나오기
			}
		}
		//result == 0(삭제할 곡을 못 찾음) | 1(성공적으로 삭제함)
		return result; // return 할거니까 void 없앰. 맨처음에는 void로 해놓고 나중에 삭제해도 됨
	}
	
	public ArrayList<Music> searchMusic(String keyword) { // 오버로딩
		// 기본 버전 1
		// 필터링 된 것들 담아줄 리스트 만들어야 함
		ArrayList<Music> searchList = new ArrayList<Music>(); // [] 빈 상태.
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) { // list i번 타이틀에 keyword가 있으면
				searchList.add(list.get(i)); // 서치리스트 i번째에 추가
			}
		}
		return searchList; // void 삭제 -> Array인 이유: 위에서 searchList의 반환형이 
	}
	
	
	public ArrayList<Music> searchMusic(int menu, String keyword) { // 오버로딩
		
		// 심화버전 2
	
		ArrayList<Music> searList = new ArrayList<Music>(); //[]
		
		if(menu == 1) {
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searList.add(list.get(i));
		}
			}
		}else {
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searList.add(list.get(i));
		}
		
	
		}
		} return searList;
		
	}
	
	public int updateMusic(String title, String upArtist, String upTitle) {
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle); // 내가 가지고 온 upTitle로 바꿈
				list.get(i).setArtist(upArtist); // 내가 가지고 온 upArtist로 바꿈
				result = 1 ;
				break; // 바꾸고 for문 나오기
			}
		}
		return result;
		
	}
}
		
	
