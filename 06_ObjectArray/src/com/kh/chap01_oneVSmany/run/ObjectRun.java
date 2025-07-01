package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		/*
		// 복습
		// 기본생성자
		
		//방법 1. 기본 생성자로 생성한 후 setter 메소드 호출해서 값 초기화
		Book bk = new Book(); //메모리상에 스택에 자료형이 Book이고 이름이 bk인.. 
		bk.setTitle("자바의 정석");
		bk.setAuthor("차은우");
		bk.setPrice(10000);
		bk.setPublisher("kh출판사");// null~에서 바뀜
		*/
		
		
		// 방법2. 매개변수 생성자를 통해서 생성과 동시에 값을 초기화
		// 매개변수
		// 매개 생성자 만들어두고 오면 컨트롤 스페이스 전체 선택
		// Book bk = new Book("자바의 정식", "차은우", 100000, "kh출판사");
		
		Scanner sc = new Scanner(System.in); //괄호 안에 뭐가 있으니까 얘도 매개변수 생성자 얘는 기본 생성자가 없음
		
		/*
		System.out.println("도서명 : " );
		String title = sc.nextLine();
		
		System.out.println("저자명 : ");
		String author = sc.nextLine();
		
		System.out.println("가격 : ");
		int price = sc.nextInt(); // 다음에 라인 오면 씹힘
		
		sc.nextLine();
		
		System.out.println("출판사 : ");
		String publisher = sc.nextLine(); //필드랑 같은 이름으로 하면 좋음
		
		Book bk = new Book(title, author, price, publisher);// 필드에 써놧기 떄문에 자동으로
		
		System.out.println(bk.information());
		
		*/
		
		
		//3권을 만들어야 된다면?
		
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		for(int i=0; i<3; i++) { // 0 1 2 
			System.out.print(i+1 + "번째 도서 정보 입력"); // 1 2 3
			
			System.out.print("도서명 : " );
			String title = sc.nextLine();
			
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt(); 
			
			sc.nextLine();
		
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if(i == 1){
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
			
		}
		
		// for 세 번 돌아서 객체 생성 끝
		
		// 전체 도서 정보 출력
		// 왜 반복문 안 됨?
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// 도서 제목으로 검색하는 서비스
		System.out.println("검색할 책 제목 : ");
		String search = sc.nextLine(); //search에 책 제목 저장
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}
		
		if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}
		
		if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}
		
		
		
		
	}

}
