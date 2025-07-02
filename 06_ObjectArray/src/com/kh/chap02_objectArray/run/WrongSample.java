package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone[] arr = new Phone[3]; 
		
		arr[0] = new Phone();
		arr[1] = new Phone();
		arr[2] = new Phone(); // 이렇게라도 해서 객체생성. 값이 null이라도 안 했던것과 다름
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		
		// 잘못된 부분
		// 1. NullPointerException: 객체 배열을 만들고 객체 배열의 인덱스 값이 null인 상태에서 메소드를 호출하려고 했기 때문에
		// 조치내용 : 객체 배열을 만든 후 각 인덱스별로 객체 생성을 해야함
		
		// 2. ArrayIndexOutOfBoundsException: 배열의 적절한 인덱스 범위를 벗어났기때문에 
		// =>조건식으로 i<=배열의 길이 라고 제시 돼 있음. 배열의 마지막 인덱스보다 더 큰 값이 제시
		// 조치내용 : 조건식 수정하기.
	}

}
