package com.kh.chap01_oneVSmany.model.vo;

public class Book {
	
	// 도서명, 저자, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	//생성자 기본 하나, 전체 매개 하나씩 만들기
	
	//기본생성자 : 안에 들어가는 거니까 한 줄로
	public Book() {}
	
	//매개변수 생성자 : 초기값이 아닌 내가 원하는 값을 지정하기 위해 / 필드 채울거 따라 쓰기
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getPublisher() {
		return publisher; //알려줘야지
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
		
	public String information() {
		return title + "," +author + "," + price + "," + publisher;
	}
	


}
