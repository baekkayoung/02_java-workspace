package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		// Object 원조 메소드
		// Object hashCode() => 해당 객체의 주소값을 가지고 10진수 형태로 만들어서 반환
		// Object equals() => 두 객체의 주소값을 비교해서 만약 둘이 주소값이 똑같으면 true, 일치하지 않으면 false 반환 
		
		// String hashCode() => 실제 String이 가지고 있는 "문자열"을 가지고 10진수 형태로 만들어서 반환
		// String equals() => 주소값 비교가 아닌 실제 담긴 "문자열"을 가지고 비교해서 일치하면 true, 일치하지 않으면 false 반환
		
		
		

		//ArrayList가 List의 자식(구현체)인 것처럼
		//HashSet은 Set의 자식(구현체)
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("반갑습니다");
		hs1.add(new String("반갑습니다"));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		
		System.out.println(hs1); 
		// 5개의 데이터를 넣었는데 3개만 저장되어있음.
		// 해쉬셋 : 저장 순서 유지 안됨 (인덱스 개념 없음)
		// 중복된 데이터(동일객체)는 보관 불가 <-> List는 중복값 허용
		// String은 주소값은 다르지만 ""안의 알맹이를 비교! 
		// String은 이미 오버라이딩 되어있어서 같은 객체라고 생각
		
		
		HashSet<Student> hs2 = new HashSet<Student>();
		
		hs2.add(new Student("공유", 43, 100)); // hs2에 넣음
		hs2.add(new Student("차은우", 26, 85));
		hs2.add(new Student("박보검", 30, 20));
		
		hs2.add(new Student("공유", 43, 100)); // 중복된 데이터 추가
		
		System.out.println(hs2); 
		// 공유가 2명.. 중복된 데이터 안 된다고 했는데 왜 둘 다 뜨지? => 중복이 제거되지 않고 동일 객체라고 판단하지 못 해서 그럼 => 다른 객체로 인식
		// 중복 제거 안 됐다는 것 => 동일 객체로 판단하지 않음
		// 동일 객체로 판단 = > 중복으로 안 뜸
		
		// HashSet 이라는 공간에 객체가 추가될 때마다 동일 객체인지 비교!
		// 동일객체: 각 객체마다 hashCode() 호출 결과가 일치하고, equals() 비교시 true일 경우에만 동일 객체라고 판단 => 2개 판단
		
		// 공유가 2명 출력됨 -> 중복이 제거되지 않음
		// 이유: HashSet은 객체를 추가할 때, hashCode()와 equals()를 통해 동일 객체인지 판단
		// 동일한 객체로 판단되려면:
		// 1. hashCode() 결과가 같고
		// 2. equals() 비교 결과가 true 이어야 함
		// 지금은 둘 다 오버라이딩하지 않았기 때문에, 서로 다른 객체로 판단됨
		
		System.out.println(new Student("공유", 43, 100).hashCode());
		System.out.println(new Student("공유", 43, 100).hashCode()); // Override 했더니 같은 숫자가 리턴
		
		System.out.println(new Student("공유",43,100).equals(new Student("공유",43,100))); // 이제 동일 객체라고 생각해서 하나만 뜸
		
		// hs2.get(0); => 해시셋은 인덱스의 개념도 없고 get 메소드 자체가 정의 돼있지 않음 ! (한 객체만 뽑아올 수 없음!)
		
		// HashSet에 담긴 모든 객체들에 순차적으로 접근
		// 1. for문 사용 가능 (단, 향상된 for문 만! 가능)
		
		for(Student s :hs2) {
			System.out.println(s); 
		}
		
		System.out.println("=========================================");
		
		// 2. ArrayList에 담아준 다음에 반복문 돌려가며 접근
		ArrayList<Student> list = new ArrayList<Student>(); // []
		list.addAll(hs2); //뒤에 컬렉션이 올 수 있음
		
		ArrayList<Student> list2= new ArrayList<Student>(hs2); // hs2의 모든 요소가 list2에 저장
		for(int i= 0 ; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		// 중복된 데이터가 들어오면 절대 안 되는 경우!
		
		System.out.println("=========================================");
		
		// 3. Iterator 반복자를 이용해서 순차적으로 접근..
		Iterator<Student> it = hs2.iterator(); // it에 hs2. 요소 넣어놓고 하나씩 빼는..
		while(it.hasNext()) { // 꺼낼 요소가 있는지 판단
			Student s = it.next(); //다음 요소를 꺼내서 s 에 저장
			System.out.println(s);
		}
		
		
		
		
		
	}

}
