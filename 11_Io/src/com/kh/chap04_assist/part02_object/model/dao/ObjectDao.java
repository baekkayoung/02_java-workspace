package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	// 프로그램 ----> 파일(출력)
	public void fileSave() {
		
		Phone p1 = new Phone("아이폰", 2000000);
		Phone p2 = new Phone("갤럭시", 1500000);
		Phone p3 = new Phone("콩순이폰", 2500);
		
		// 객체 단위로 출력해줄 수 있는 보조 스트림이 필요!
		// ObjectXXXX => 얘는 Writer, Reader가 없음 (얘네는 넓은 통로)
		
		// FileOututStream : 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반스트림
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))){
			
			oos.writeObject(p1); 
			oos.writeObject(p2); 
			oos.writeObject(p3); 
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))){
			
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			// 파일의 끝을 만나면 end of file 파일의 끝을 만났다. 예외 발생 => 예외처리 ㄱㄱ
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) { // 추가 / end of file
			System.out.println("파일을 다 읽어들였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} // 자동 반환
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
