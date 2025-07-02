package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		

	
		
		Employee[] e = new Employee[3];
		
		
		
		e[0]  = new Employee();
		e[1]  = new Employee(1, "홍길동", 19, 'M', "01055559999", "서울 잠실" );
		e[2]  = new Employee(2, "강말순", 20, 'F', "01011112222", "서울 마곡" , 1000000, 0.01, "교육부" ,"강사");
		
		System.out.println(e[0].information());
		System.out.println(e[1].information());
		System.out.println(e[2].information());
		
		System.out.println("===================================");
		
		e[0].setAddress("전라도 광주");
		e[0].setEmpName("김말똥");
		e[0].setAge(17);
		e[0].setEmpNo(0);
		e[0].setSalary(3000000);
		e[0].setGender('M');
		e[0].setPhone("01012345678");
		e[0].setDept("영업부");
		e[0].setBonusPoint(0.2);
		e[0].setJob("팀장");
		
		e[1].setDept("기획부");
		e[1].setJob("부장");
		e[1].setSalary(4000000);
		e[1].setBonusPoint(0.3);
		
		System.out.println(e[0].information());
		System.out.println(e[1].information());
		
		System.out.println("===================================");
		
		double salary0 = (e[0].getSalary() + (e[0].getSalary() * e[0].getBonusPoint()))*12;
		double salary1 = (e[1].getSalary() + (e[1].getSalary() * e[1].getBonusPoint()))*12;
		double salary2 = (e[2].getSalary() + (e[2].getSalary() * e[2].getBonusPoint()))*12;
		
		
		System.out.printf("김말똥의 연봉: %.0f원\n", salary0);
		System.out.printf("홍길동의 연봉: %.0f원\n", salary1) ;
		System.out.printf("강말순의 연봉: %.0f원\n", salary2);
		
		System.out.println("===================================");
		
		
		System.out.printf("연봉평균: %.0f원\n", (salary0 + salary1 + salary2)/ 3);
		System.out.println("===================================");
		System.out.println("백가영");


		
		
		
		
		
		
		
	}

}
