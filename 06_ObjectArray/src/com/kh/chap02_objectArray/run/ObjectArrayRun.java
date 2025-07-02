package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone[] phones = new Phone[3];
		//System.out.println(phones[0]); //0은 null phones는 주소
		//phones[0].setName("아이폰"); // null인데 null로 지지고 볶으면 에러 폰즈 0 안만들어졌어
		//생성 하고 해 아직은 phone이 생성이 안된거임!! 생성이되어야 셋네임도 가능한거고..
		
		
		//기본생성자
		phones[0] = new Phone(); // 이렇게 해야 phones 0번째 옆에 쭈우욱 필드 만들어 지는것
		//이제 가능
		phones[0].setName("벨벳폰");
		phones[0].setBrand("엘지");
		phones[0].setPrice(1000000);
		phones[0].setSeries("1");

		//여기까진 기본으로 세터로 바꿈
		
		
		// 매개변수 생성자로 객체 생성 및 초기화
		
		phones[1] = new Phone("아이폰", "애플", 1400000, "16Pro");
		phones[2] = new Phone("갤럭시", "삼성", 1200000, "s25");
		
		// 총가격과 평균 가격을 구해보자
		int total = 0;//총가격을 저장할 int
		for(int i=0; i<phones.length; i++) {
			total += phones[i].getPrice(); //i 인덱스를 구하고 싶은 게 아니니까
			System.out.println(phones[i].information()); // 0 1 2 
		}
		System.out.println("총가격:" + total + "원") ;
		System.out.println("평균값:" + total/ phones.length +"원");
		
		// 사용자에게 구매하고자 하는 핸드폰명을 입력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구매하고자하는 핸드폰 : ");
		String buy = sc.nextLine();
		
		for(int i =0 ; i<phones.length;i++) {
			if(phones[i].getName().equals(buy)) {
				System.out.print("당신이 구매하고자하는 휴대폰의 가격은" + phones[i].getPrice() +"원 입니다.");
			}
		}
		
		
	}

}
