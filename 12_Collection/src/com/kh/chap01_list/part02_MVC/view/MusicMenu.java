package com.kh.chap01_list.part02_MVC.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.chap01_list.part02_MVC.controller.MusicController;
import com.kh.chap01_list.part02_MVC.model.vo.Music;

/**
 * @author baek
 * @since 2025.07.08
 * @version 1.0
 */

public class MusicMenu { // 화면을 담당하는 클래스
	
	//View : 화면을 담당하는 역할 즉, 사용자에게 보여지는 시각적인 요소(출력문 코드(print문), 입력문(Scanner문))
	
	
	// 스캐너
	private Scanner sc = new Scanner(System.in); // 전역변수 . 필드라서 private
	// 뮤직컨트롤러와 연결 할 수 있게 객체 생성
	private MusicController mc = new MusicController(); // 전역변수. 계속 소환할거라 필드면 접근제한자 무조건
	
	// 메인화면 : 프로그램 실행시 처음 보여주는 화면
	public void mainMenu() {
		
		while(true) {
			System.out.println("\n=== Welcome 별밤 ===");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정곡 삭제");
			System.out.println("4. 특정곡 검색");
			System.out.println("5. 특정곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.println(">> 메뉴 선택 :");
			int menu =0;
			
			try { // try에서 문제가 있으면 catch에서 문제를 다룸
				menu = sc.nextInt(); //InputMismatchException: 자바에 기본적으로 있는 예외 클래스.
			}catch(InputMismatchException e) { // 만약 try 블록 안에서 InputMismatchException이 발생하면
				System.out.println("숫자를 입력해주세요"); // 이 코드를 실행
			}
			
			sc.nextLine(); // 숫자를 입력 받았었으니 버퍼에서 엔터 제거
			
			switch(menu) {
			case 1:
				insertMusic(); //먼저 case 안에 메소드 만들고, 메소드 만들러 밑으로 ㄱㄱ
				break;
			case 2 :
				selectMusic();
				break;
			case 3 :
				deleteMusic();
				break;
			case 4 :
				searchMusic();
				break;
			case 5 :
				updateMusic();
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				return;
			default:
				System.out.println("잘못입력했습니다.");
			}
			
		}
		
		
	}
	

	/**
	 * 1. 새로운 곡을 추가하는 서브화면
	 */
	public void insertMusic() {
		System.out.println("\n=== 새로운 곡 추가 ===");
		System.out.print("제목 입력 : ");
		String titile = sc.nextLine();
		
		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();
		
		mc.insertMusic(titile, artist); // 위에서 입력 받은 인수(mc의 insertMusic메소드로) 넘기기
		System.out.println("성공적으로 곡이 추가 되었습니다");
	}
	
	
	/**
	 * 2. 전체곡 조회용 서브 화면
	 */
	public void selectMusic() {
		
		System.out.println("\n=== 전체곡 리스트 ===");
		
		ArrayList<Music> list = mc.selectMusic(); // mc의 리스트를 받아서 사용
		// mc의 list 객체(컨트롤러내)를 가리키는 주소를 list(뮤직메뉴) 변수에 저장함
		
		if(list.isEmpty()) {// 만약 리스트가 비어있을 경우
			System.out.println("현재 존재하는 곡이 없습니다.");
		}else {
			for(Music m :list) { // m=list.get(0) => m=list.get(1)
				System.out.println(m);
			}
		}
/*		
		for (int i=0; i<list.size(); i++) { 
			System.out.println(list.get(i));
		}
*/	
	}
	
	/**
	 * 3. 특정곡 삭제시켜주는 서브 화면
	 */
	public void deleteMusic() {
		System.out.println("\n=== 특정 곡 삭제===");
		
		System.out.println("삭제하고자 하는 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title); // int 타입의 값을 반환
		
		if(result == 1 ) {
			System.out.println("성공적으로 삭제했습니다");
		}else {
			System.out.println("삭제할 곡을 찾지 못했습니다");
		}
	}
	
	/**
	 * 4. 특정 곡 검색해주는 서브화면
	 */
	public void searchMusic() {
		System.out.println("\n=== 특정 곡 검색 === ");
		
		/* 1. 간단 버전
		System.out.print("검색할 곡 명(키워드만도 가능) : ");
		String keyword =sc.nextLine();
		
		ArrayList<Music> searchList =mc.searchMusic(keyword);
		*/
		
		// 2. 심화 버전
		System.out.println("1) 제목으로 검색");
		System.out.println("2) 가수명으로 검색");
		System.out.println(">> 메뉴 선택 : ");
		int menu = sc.nextInt();
		
		sc.nextLine(); // 버퍼 제거
		
		System.out.println("검색 키워드 : ");
		String keyword = sc.nextLine();
		ArrayList<Music> searchList = mc.searchMusic(menu, keyword); // 메뉴, 키워드도 넘겨볼거임
		
		
		System.out.println("\n=== 검색 결과 ===");
		if(searchList.isEmpty()) {
			System.out.println("검색된 결과가 없습니다");
		}else {
			for(int i=0; i<searchList.size(); i++) { 
				System.out.println(searchList.get(i));
			}
		}
	}
	
	/**
	 * 5. 특정곡 수정해주는 서브 화면
	 */
	public void updateMusic() {
		System.out.println("\n=== 특정 곡 수정 ===");
		System.out.println("수정하고자 하는 곡 명 : ");
		String title = sc.nextLine();
		
		System.out.println("수정 내용(가수) : ");
		String upArtist = sc.nextLine();
		
		System.out.println("수정 내용(곡명): ");
		String upTitle = sc.nextLine();
		
//		mc.updateMusic(title, upArtist, upTitle); // 요 세 개 넘겨야 함
		int result = mc.updateMusic(title, upArtist, upTitle); 
		
		if(result > 0) {
			System.out.println("성곡적으로 수정되었습니다");
		}else {
			System.out.println("수정할 곡을 찾지 못했습니다");
		}
		
	}
	
}
