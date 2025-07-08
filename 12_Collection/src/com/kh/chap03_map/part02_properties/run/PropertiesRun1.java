package com.kh.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {
		
		// Properties : Map 계열의 컬렉션 => 키 + 벨류 세트로 저장
		// HashMap과의 차이점 : Properties는 키값도 String, 벨류값도 String
		
		Properties prop = new Properties(); // 데이터를 담을 수 있는 공간.
		
		/*
		prop.put("다이제", new Snack("초코맛", 1500));
		prop.put("새우깡", new Snack("짠맛", 500));

		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		*/
		
		// 하지만 Properties 사용하는 경우 주로 Properties에 담긴 것들을 파일로 출력 또는 입력을 받아올 때 사용하게 됨.
		// 즉, Properties에서 제공하는 store(), load() 메소드를 사용하기 위해서
		/*
		try {
			prop.store(new FileOutputStream("test.properties"), "properties Test");  // 형변환
			// java.lang.ClassCastException
			// 내부적으로 store()실행시 Properties 에 담겨있는 키+ 벨류 세트로 String으로 형변환해서 출력함
			// 벨류 => 객체타입으로 적었기때문에 형변환 불가!
		} catch (IOException e) {
			e.printStackTrace();
		}*/
				
		// 파일을 입출력하고 싶으면 put이 아닌 다른 메소드를 사용해야한다.
		
		// 1. setProperty(String key, String value); 둘 다 String
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties"); 
		
		System.out.println(prop); // 저장순서 유지안됨, key 값 중복시 덮어씌워짐

		// 2. getProperty(String key) : String
		System.out.println(prop.getProperty("List")); // List의 벨류 값
		System.out.println(prop.getProperty("새우깡")); // 존재하지 않는 키값을 제시하면 null을 반환
		
		try {
			// 3. store(OutPutStream os, String comments 아무말) : Properties에 담겨있는 key-value 값들을 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "properties Test 코멘트"); 
			
			// 4. storeToXML(OutPutStream os, String comments) : Properties에 담겨있는 key-value 값들을 파일로 출력
			prop.storeToXML(new FileOutputStream("test.xml"), "properties Test"); // 가독성 약간 html 같음
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
