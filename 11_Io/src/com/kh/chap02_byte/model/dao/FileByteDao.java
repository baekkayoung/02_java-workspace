package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {
	
		/*
		 * "바이트 기반 스트림"을 가지고 데티어 입출력해보기!!
		 * 
		 * - 바이트 스트림 :  데이터를 1byte 단위로 전송하는 통로 (좁은 통로임.. 한글은 깨짐)
		 * - 기반 스트림 : 외부 매체와 직접적으로 연결되는 통로!
		 * 
		 * xxxInputStream : xxx 매체로부터 데이터를 입력받는 통로 (외부매체로부터 데이터를 읽어오겠음!)
		 * xxxOutputStream : xxx 매체로부터 데이터를 출력하는 통로 (외부매체로부터 데이터를 내보내겠다. 쓰겠다)
		 * 
		 */
	
	// 프로그램  ----------> 외부매체(파일) (출력 : 프로그램 상의 데이터를 파일로 내보내기, 즉 파일로 저장)
	public void fileSave() {
		
		//fileOutpurStream : 파일과 직접적으로 연결을 해서 1바이트 단위로 출력하는 스트림
		
		//1. 스트림(통로) 생성
		//2. 통로를 통해서 데이터를 출력 (메소드 활용)
		//3. 다 사용한 후 스트림 반납! (반드시!!) 
		
		FileOutputStream fout = null;
		
		try {
			//1. 스트림 생성. fileOutputStream 객체 생성 => 해당 파일과의 연결 통로가 만들어짐
			fout = new FileOutputStream("a_byte.txt"); // 만약 해당 파일이 없으면 새로 만ㄷ르어주고 통로 연결 / 있으면 그냥 통로 연결
			
			//2. 파일에 데이터를 출력하고자 할 떄 write 메소드 사용
			// 	 숫자를 출력하든 문자를 출력하든 실상 파일에 기록이 되는 건 문자로 기록 (아스키 코드표)
			
			fout.write(97); //직접 쓰로우 하라고.. / 실상 저장된 건 'a'가 저장됨
			fout.write('b'); //'b'가 저장됨
			fout.write('퀭'); //한글은 2byte라 깨짐 -> 바이트 스트림으로는 제한이 있음
			
			byte[] arr = {99, 100, 101};
			fout.write(arr); // cde 저장
			
			fout.write( arr, 1, 2 ); // de가 저장
			
			// 3. 스트림 다 이용했으면 반납하기 ! (반드시)
//			fout.close(); 위에서 write()메소드 실행시 IDException 발생이 됐을 경우 
//						=> catch 블럭에서 낚아채고 나서 catch 블럭 실행 후 빠져나감 (반납하는 코드 실행 안됨!)
						// 반드시 실행해야 하는 구문 = > finally[]에 기술
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 이 안에 작성된 코드는 어떤 예외가 발생했던간에 마지막에 무조건 실행하고 빠져나간다.
			try {
				// 3. 스트림 다 이용했으면 반드시 반납하기
				fout.close();  // 이거 뭔 얘기엿지
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	// 프로그램 <-------- 파일 (입력 : 파일로부터 데이터 가져오기)
	public void fileRead() {
		
		// fileInputStream : 파일로부터 데이터를 1바이트 단위로 입력 받는 스트림
		// 1. 스트림 생성
		// 2. 스트림을 통해서 입력 받아옴(메소드 활용)
		// 3. 사용이 끝난 스트림 반납!
		
		FileInputStream fin = null;
		
		try {
			//1. FIleInputStream 객체 생성 => 해당 파일과 연결 통로가 만들어짐
			fin = new FileInputStream("a_byte.txt"); // 얘는 파일이 만들어지는 게 아니라 무조건 이미 있어야 함!
			
			//2. 파일로부터 데이터를 읽어들이기 => read()
			// 	 1byte 단위로 하나씩 읽어옴 / 반환형이 int여서 숫자로 읽어들임
			
			
			System.out.println(fin.read()); // catch block 추가 / 97
			System.out.println(fin.read()); // 98
			System.out.println(fin.read()); // 45 한글 깨진 거 
			System.out.println(fin.read()); // c = 99
			System.out.println(fin.read()); // 100
			System.out.println(fin.read()); // 101
			
			System.out.println(fin.read()); // 100
			System.out.println(fin.read()); // 101
			// 파일의 끝을 만나는 순간 -1을 받아온다
			System.out.println(fin.read()); // -1
			System.out.println(fin.read()); // -1
			
			
			/* 반복문 수행시 매번 read()가 두번씩 실행되기 때문에 퐁당폳아 읽어들여짐
			while(fin.read() != -1) { // ab-cdede
				System.out.println(fin.read()); // a - d  
			}
			*/
			
			/*
			// 해결방법 1
			while(true) {
				int value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
			
			// 해결방법 2. 권장방법
			int value = 0;
			while((value = fin.read()) != -1 ) {
				System.out.println(value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}


