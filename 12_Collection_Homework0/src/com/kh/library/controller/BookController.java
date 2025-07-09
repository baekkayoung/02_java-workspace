package com.kh.library.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
	
	private ArrayList<Book> list = new ArrayList<Book>();
	

	

	
	@Override
	public void addBook(Book nBook) {
	    boolean find = true;
	    for (Book b : list) {
	      if (b.getbNo().equals(nBook.getbNo())) {
	        System.out.println(nBook.getTitle() + "도서는 이미 소장하고 있는 책입니다" );
	        find = false;
	        break;
	      } 
	    } 
	    if (find) {
	      this.list.add(nBook);
	      System.out.println(nBook.getTitle() + " 도서가 성공적으로 추가되었습니다" );
	    } 
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return list;
	}
	
	@Override
	public Book searchBookBybNo(String bNo) {
		Book result = new Book();
		for (Book b : list) {
			if(b.getbNo().equals(bNo)) {
				return b;
			}
		}
		return result;
	}
	


	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> result = new ArrayList<>();
		
		for (Book b : list) {
		    if(b.getTitle().contains(title)) {
		        result.add(b);
		    }
		}
		return result;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> result = new ArrayList<Book>();
		for(Book s :list) {
			if(!(s instanceof Magazine)) {
				result.add(s);
			}
		}
		return result;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> result = new ArrayList<Book>();
		for(Book s : list) {
			if(s instanceof Magazine) {
				result.add(s);
			}
		}
		return result;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> result = new ArrayList<>();

		for (Book b : list) {
			if (b instanceof Magazine) {
				Magazine m = (Magazine) b;
				if (m.getYear() == year) {
					result.add(m);
				}
			}
		}
		return result;
	}
	
	
	

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> result = new ArrayList<>();
		
		for (Book b : list) {
			if(b.getPublisher().contains(publisher)) {
				result.add(b);
			}
		}
		return result;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> result = new ArrayList<>();

		for (Book b : list) {
			if(b.getPrice() < price){
				result.add(b);
			}
		}
		return result;
	}



	@Override
	public int getTotalPrice() {
		int sum = 0;
		for (Book b : list) {
			sum += b.getPrice();
		}
		return sum;
	}

	@Override
	public int getAvgPrice() {
		if (list.isEmpty())
			return 0;
		return getTotalPrice() / list.size();
	}

}
