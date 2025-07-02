package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
		
		
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		Student[] s = new Student[3];
		
		// 위의 사용 데이터 참고하여 3명의 학생 정보 초기화
		s[0] = new Student ("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		s[1] = new Student ("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		s[2] = new Student ("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		// 위의 학생 정보 모두 출력
		System.out.println(s[0].toStirng());
		System.out.println(s[1].toStirng());
		System.out.println(s[2].toStirng());
		

		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		Employee[] e = new Employee[10];
		
		// 사원들의 정보를 키보드로 계속 입력 받고 → while(true) 무한 반복문을 통해
		while() {
		
		
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체 배열에 객체 생성
		// 한명씩 추가 될때마다 카운트함
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 y이면 계속 객체 추가
		// ‘n’일 경우 더 이상 그만 입력 받도록 ...
		// 배열에 담긴 사원들의 정보를 모두 출력
		
		
		
		// String name, int age, double height, double weight, int grade, String major
		
		
	
		
	
		
		
		// String name, int age, double height, double weight, int salary, String dept
	
		
		e[0] = new Employee ("박보검", 28, 180.3, 72.0, 100000000, "영업부" );
		e[1] = new Employee ("강동원", 40, 182.0, 76.0, 200000000, "기획부" );
		
		
			System.out.println("사원들의 정보:");
			String  =sc.nextLine();
			for(int i =0; i< s.length; i++) {
				
			}
			
		}
		
	}
	


}
