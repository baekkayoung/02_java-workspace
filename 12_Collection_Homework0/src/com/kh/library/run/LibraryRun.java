package com.kh.library.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.controller.BookController;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

public class LibraryRun {
	
	private Scanner sc = new Scanner(System.in);  //////////////////
	private static BookController bc = new BookController();  /////////////////

	public static void main(String[] args) {// 소장책 DB
		
		
		ArrayList<Book> bList = new ArrayList<Book>();
	
		
		bList.add(new Book("100", "잃어버린 기석이를 찾아서", "김수정 박사", "우준 출판사", 8500, "『윤정스』, 『르 몽드』 선정 20세기 최고의 책"));
		bList.add(new Book("101", "이찬이의 자서전", "김혜지가 옮김", "빛나는 선일출판사", 8500, "영화배우 박찬형이 추천한 젊음에 바치는 영혼의 자서전"));
		bList.add(new Magazine("102", "박현아 과학동아", "편집부 백가영 선생", "수용 사이언스", 8500, "세욱이네 유튜브에 소개된 과학만화 잡지", 2025,3));
		bList.add(new Book("103", "우석이의 코딩스쿨", "코딩천재 조민준", "책방네 동네", 9900, "제 13회 재홍이가 주는 문학상 수상작"));
		bList.add(new Magazine("104", "다은이의 여행일기", "한다은", "시연21", 3800, "영화감독 한다현이 집필한 영화 전문 잡지", 2024, 4));
		bList.add(new Magazine("105", "홍세민의 오오티디", "인플루언서 홍세민", "은우네 책방", 12000, "핫걸 김시연의 샤라웃을 받은 잡지", 2024,11));
		bList.add(new Book("106", "박효신의 미라클모닝", "박효신", "자바 출판사", 6300, "이찬이도 2번 성공한 미라클모닝"));
		bList.add(new Book("107", "다은이의 백만가지 요리레시피", "제주도에서 온 다은이", "우리반 출판사", 6300, "제주에서 밥해먹고 사는 일상"));
		
		for(Book book : bList) { ////////////////
			System.out.println(book);
			
		}
		
		printBooks(bList);
		
	}

	public static void printBooks(ArrayList<Book> bs) {
		// 여기서 메뉴열고 구현 시작
		
		for(Book book:bs) {
			bc.addBook(book);
		}

		boolean flag = true; // 메뉴 스위치

		while (flag == true) { // 메뉴 스위치가 켜져있는 동안 무한반복
			System.out.println("===============================");
			System.out.println("KH 우리반전용 도서관 관리 페이지입니다.");
			System.out.println("1. 조회하기");
			System.out.println("2. 추가하기");
			System.out.println("3. 책 찾기");
			System.out.println("4. 전체책 가격 합계 및 평균 조회");
			System.out.println("5. 프로그램 종료");
			System.out.println("===============================");

			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴번호를 입력해주세요 : ");
			int menu = sc.nextInt(); // 메뉴 번호 입력
			
			sc.nextLine();
			
			switch (menu) {
			case 1: // 1. 조회하기
				System.out.println("===============================");
				System.out.println("어떤 방법으로 책을 조회하겠습니까?");
				System.out.println("1. 도서관 전체 소장책 조회하기");
				System.out.println("2. 일반도서만 조회하기(잡지 제외)");
				System.out.println("3. 잡지만 조회하기(일반도서 제외)");
				System.out.println("4. 이전으로");
				System.out.println("===============================");

				System.out.print("메뉴번호를 입력해주세요 : ");
				int search = sc.nextInt();
				
				if (search == 1) {
					/*
					for (Book b : bc.getAllBook()) {
					System.out.println(b);
					*/
 
					System.out.println(bc.getAllBook());
				}
				else if (search == 2) {
					System.out.println(bc.onlySearchBook());
				}
				else if (search == 3) {
					System.out.println(bc.onlySearchMagazine());
					
				}
				else if (search == 4) {
					continue;
				}
				break;
				
			case 2: // 2. 추가하기
				System.out.print("bNo을 입력하세요 : ");
				String bNo = sc.nextLine();
				
				System.out.print("책 제목을 입력하세요 : ");
				sc.nextLine();
				String title = sc.nextLine();
				
				System.out.print("작가를 입력하세요 : ");
				String author = sc.nextLine();
				
				System.out.print("출판사를 입력하세요 : ");
				String publisher = sc.nextLine();
				
				System.out.print("가격을 입력하세요 : ");
				int price = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("간단한 설명을 입력하세요 : ");
				String description = sc.nextLine();
				
				System.out.print("일반도서이면 true, 잡지이면 false를 입력하세요 : ");
				Boolean bkOrMaga = sc.nextBoolean();
				
				
				
				if (bkOrMaga.equals(true)) {
					
					//book 객체 생성
					Book b = new Book(bNo, title, author, publisher, price, description);
					//bc.add()
					bc.addBook(b);
					
//					bc.addBook(new Book(bNo, title, author, publisher, price, description));

					continue;
					
				} else if (bkOrMaga.equals(false)) {
					System.out.print("출간연도를 입력하세요 : ");
					int year = sc.nextInt();
					System.out.print("출간월을 입력하세요 : ");
					int month = sc.nextInt();
					
					//magazine객체생성
					Magazine m = new Magazine(bNo, title, author, publisher, price, description, year, month);
					//bc.add()
					bc.addBook(m);
				
//					bc.addBook((Book)new Magazine(bNo, title, author, publisher, price, description, year, month));
				} 

				break;
				
			case 3:// 3. 책 찾기
				System.out.println("===============================");
				System.out.println("어떤 방법으로 책을 찾겠습니까?");
				System.out.println("1. bNo으로 책 찾기");
				System.out.println("2. 책 제목으로 책 찾기");
				System.out.println("3. 출간연도로 잡지 찾기");
				System.out.println("4. 출판사로 책 찾기");
				System.out.println("5. 특정 가격 밑으로 책 찾기");
				System.out.println("6. 이전으로");
				System.out.println("===============================");
				System.out.print("메뉴번호를 입력해주세요 : ");
				search = sc.nextInt();
				
				sc.nextLine();

				if (search == 1) { // bNo으로 책 찾기
					System.out.print("bNo을 입력하세요 : ");
					bNo = sc.nextLine();
					System.out.println(bc.searchBookBybNo(bNo));
					
				} else if (search == 2) { // 책 제목으로 책 찾기
					System.out.print("책 제목을 입력하세요 : ");
					title = sc.nextLine();
					System.out.println(bc.searchBookByTitle(title));
					
					
				} else if (search == 3) { // 출간연도로 잡지 찾기
					System.out.print("출간연도를 입력하세요 : (올해 --> 2022) : ");
					int year = sc.nextInt();
					System.out.println(bc.magazineOfThisYearInfo(year));
					
		
				} else if (search == 4) { // 4. 출판사로 책 찾기
					System.out.print("출판사를 입력하세요 : ");
					publisher = sc.nextLine();
					System.out.println(bc.searchBookByPublisher(publisher));
					

				} else if (search == 5) { // 5. 특정 가격 밑으로 책 찾기
					
					System.out.print("가격을 입력하세요 : ");
					price = sc.nextInt();
					sc.nextLine();
					System.out.println(bc.searchBookByPrice(price));

				} else if (search == 6) {
					flag = true; // 6. 이전으로
					continue;
					
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
				break;

			case 4:// 4. 전체책 가격 합계 및 평균 조회
				System.out.println("전체책 가격 합계 : " + bc.getTotalPrice());
				System.out.println("전체책 가격 평균 : " + bc.getAvgPrice());
				break;
				
			case 5: 
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				break;
			}
		}
	}



}
