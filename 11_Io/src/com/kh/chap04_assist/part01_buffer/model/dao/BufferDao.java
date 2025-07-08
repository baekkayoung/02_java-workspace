package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	
	/*
	 * 보조스트림 : 기반스트림만으로는 부족했던 성능을 보다 향상 시켜주는 스트림
	 *            기반스트림에서 제공하지 않는 추가적인 메소드 제공 / 데이터 전송 속도 향상 시킴 + a
	 *            >> 외부매체와 직접적으로 연결되는 스트림 아님!
	 *            단독 사용은 불가하다. 반드시 기반 스트림과 함께 사용
	 */
	
	// 프로그램 ------> 파일(출력)
	public void fileSave() {
		// FileWriter 기반 스트림 가지고 해보자!
		// 파일과 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 스트림
		
		// BufferedWriter : 버퍼라는 공간을 제공해주는 보조스트림 (속도를 향상시켜줌)
//		BufferedWriter bw = new BufferedWriter("c_buffer.txt"); 단독사용 불가
		/*
		BufferedWriter bw = null;
		try {
			// 1. 기반스트림 먼저 생성
//			FileWriter fw = new FileWriter("c_buffer.txt"); 
			// 2. 보조스트림 생성
//			BufferedWriter bw = new BufferedWriter(fw); // 기반 주기
			// or BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt")); 이렇게 1 + 2 한줄로 가능
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			//write 메소드 통해서 출력
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); // 개행 메소드. 보조의 장점 : 추가적인 메소드 활용 가능!
			bw.write("저리가세요");
			
			
			
//			
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				bw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
			
			//try~with~resource 구문으로 자원반납까지 더 간단하게 작업할 수 있음
			//jdk 1.7 버전 이상
			
			/*
			 * try(try 블럭 내에서 스트림 객체 생성 구문){
			 * 
			 * }catch(예외클래스 e){
			 * 
			 * }
			 */
		
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
				bw.write("안녕하세요\n");
				bw.write("반갑습니다");
				bw.newLine(); 
				bw.write("저리가세요");
				
				// 버퍼라는 공간에 계속 쌓아놨다가 한 번에 출력 => 속도 향상에 좋다.
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	// 프로그램 <----- 파일(입력)
	public void fileRead() {
		
		// FileReader : 파일과 연결해서 2바이트 단위로 데이터를 입력받을 수 있는 기반스트림
		// BufferedReader : 속도 향상에 도움이 되는 보조 스트림
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			/*
//			System.out.println(br.read()); // 숫자 형변환
			System.out.println(br.readLine()); // 안녕하세요
			System.out.println(br.readLine()); // 반갑습니다
			System.out.println(br.readLine()); // 저리가세요 
			System.out.println(br.readLine()); // 파일의 끝이 만나면 null
			*/
			
			String value = null;
			while((value = br.readLine())!= null) { // null 은 이퀄즈 x 알맹이가 아니니까
				System.out.println(value);
			} // 반납은 자동
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
}
