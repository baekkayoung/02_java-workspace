package com.kh.chap03_map.part01_hashMap.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		/*
		 * 계층 구조를 보면
		 * List 계열, Set 계열의 클래스들은 Collection을 구현한 클래스이다.
		 * => 객체를 추가하고자 한다면 공통적으로 add 메소드를 이용!
		 * 
		 * Map 계열은 Collection을 구현한 클래스가 아님!
		 * => 객체를 추가하고자 한다면 put 메소드를 이용! (이때, 키 + 벨류 세트로 담아야 됨!)
		 */
		
		// 1. put(K key, V value) : 컬렉션에 키 벨류 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸쵸", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		
		hm.put("포테이토칩", new Snack("짠맛", 500)); //key 값만 중복 아니면 됨 
		
		System.out.println(hm); // {키=벨류, 키=벨류}
		// 저장되는 순서 유지 안됨! value의 값이 중복되더라도 키값이 중복안되면 잘 저장됨!
		
		hm.put("새우깡", new Snack("매운맛", 700)); 
		//key 값이 중복? value의 값이 냅다 덮어 씌워짐!
		
		System.out.println(hm);
		
		// 2. get(Object key) : v  => 인덱스가 없으니 key값. 컬렉션에서 해당 키값을 가지는 value 값을 반환시켜주는 메소드
		Snack s = (Snack)hm.get("다이제"); // 형변환 : map의 get 메서드는 Object 타입 반환
		
		// 3. size() : 컬렉션에 담겨있는 객체들의 개수 변환
		System.out.println("몇 개 있나? : " + hm.size());
		
		// 4.replace(K key, V value) : 컬렉션에서 해당 키값을 찾아서 다시 전달한 value 값으로 수정시켜주는 메소드
		hm.replace("포테이토칩", new Snack("겁나 짠맛", 1000));
		System.out.println(hm); // 값만 바꾸는 느낌.. put이랑 다름
		
		System.out.println("================================================================");
		
		// 뽑으려고 하는데.. ArrayList는 안됨 
//		ArrayList list = new ArrayList(hm);  : 컬렉션을 넣어야되는데 
		
		// 그럼 Iterator 반복자를 이용해보자
//		Iterator it = hm.iterator();  : 곧바로 호출 안됨 -> map 계열에는 해당 메소드가 없음
		
		// Map계열 = > Set 계열 하면 됨
		
		// 1. keySet() 이용하는 방법
		
		// 1) hm에 있는 key들만 뽑아서 Set에 담기(키들의 집합 형태)
		Set keyset = hm.keySet(); // keyset() : hm의 모든 key값만 뽑아서 set 안에 다 넣음
		
		// 2) 1번 과정에서 작업한 keyset을 하나씩 뽑아서 Iterator에 담기
		Iterator itKey = keyset.iterator();
		
		// 3) 반복문 통해서 뽑기
		while(itKey.hasNext()){ //itKey값이 있는 동안
			String key = (String)itKey.next(); // itKey의 키값을 key에 저장
			Snack value = (Snack)hm.get(key); // value 값을 value에 저장
			System.out.println(key + "=" + value);
			// key만 뽑으려면 keyset , value를 뽑으려면 get(key)
			
		}
		
	}

}
