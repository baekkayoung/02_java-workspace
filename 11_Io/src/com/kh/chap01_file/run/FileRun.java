package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		/*
		 * 메모리는 휘발성임
		 * 가나다라 쓰고 컴퓨터 끄면 지워진다 => 휘발성
		 * 기록하기 위해 파일이 필요함
		 * 
		 * 간단하게 파일(file) 만들어지는 과정
		 * (java.io.)File 클래스 필요.. 요 클래스 가지고 해보자
		 * 여기서는 예외처리가 필수임!
		 * 
		 * File f1 = new File(); // 기본 생성자가 없음 매개변수 생성자가 있어야함
		 */

		try {
			// 1. 경로 지정을 딱히 하지 않은 상태로 파일 생성 = 현재 project 폴더에 파일 생성
			File f1 = new File("test.txt");// ()안에 매개변수 / 파일 객체 생성 부분
			f1.createNewFile(); // 여기 메소드까지 실행해야 만들어진 거 맞음  확인
			
			// 2. 존재하는 폴더에 파일 생성
			File f2 = new File("D:\\test.txt");
			f2.createNewFile(); // 실행해야 만들어짐
			
			// 3. 폴더 먼저 만들고 파일까지 만들어지게 하기
			// 폴더 만들기
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir(); //make dir
			
			File f3 = new File("D:\\temp\\test.txt"); // 폴더 잘못 적으면 = > java.io.IOException: 지정된 경로를 찾을 수 없습니다
			f3.createNewFile();
			
			System.out.println(f1.exists());
			System.out.println(new File("ttt.txt").exists());
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();

			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일의 용량 : " + file.length());
			System.out.println("상위 폴더 : " + file.getParent());
			
			/*
			 * 프로그램 상에 데이터를 외부매체로 출력을 한다거나 외부매체로 부터 입력을 받아올거임!
			 * 반드시 그 외부매체와 통하는 통로를 만들어야됨! 그게 바로 스트림!
			 * 
			 * 스트림(통로)의 특징
			 * - 스트림 : 개울 / 한 방향으로 흐름
			 * - 단방향: 입력이면 입력 / 출력이면 출력만 가능!
			 * 			=> 입출력을 동시다발적으로 하고자한다면? 2개 만들어. 입력용 스트림/ 출력용 스트림 따로 만들어야됨!
			 * - 선입선출(FIFO) :  먼저 들어간 데이터가 먼저 나온다. // 통로가 파이프 같은 개념 // First In First Out!
			 * - 시간 지연 (delay) 문제가 생길 수 있음
			 * 
			 * *스트림 구분
			 * >통로의 사이즈(1byte / 2byte)
			 * -바이트 스트림 : 1byte 짜리만 왔다갔다 할 수 있을 정도의 사이즈(좁은 통로) = > 입력 (InputStream ) 출력(OutputStran)
			 * -문자 스트림 :  2byte 짜리도 왔다갔다 할 수 있을 정도의 사이즈 = > 입력(Reader) / 출력();
			 * 
			 * -> 외부매체 직접 연결하는 유무
			 * -기반 스트림 : 외부매체와 직접적으로 연결되는 통로(필수)
			 * -보조 스트림 : 말 그대로 보조역할만 하는 통로 (속도를 빠르게한다거나, 성능을 향상해줌..)
			 * 				보조스트림 단독으로 사용불가 ! 기반 스트림은 반드시 기본적으로 있어야 됨
			 * 
			 * 첨부파일 기능 구현할 때 꼭 필요한 개념!
			 * 우리는 외부매체를 파일로 해보자!
			 */
			
		} catch (IOException e) {
			e.printStackTrace();
		} // throws를 하고 있꾸나
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
