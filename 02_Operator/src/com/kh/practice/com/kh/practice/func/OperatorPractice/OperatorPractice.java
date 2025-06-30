package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다");
		}
	}
	
	public void practice2() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수입니다." : (num == 0)? "0이다" : "음수다.";
		System.out.println(result);
		
	}
	
	public void practice3(){
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 ==0) ? "짝수다." : "홀수다.";
		System.out.println(result);
		
	}

	
	public void practice4(){
		
		System.out.println("인원 수 : ");
		int people = sc.nextInt();
		System.out.println("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy / people );
		System.out.println("남는 사탕 개수 : " + candy % people );
	}
	
	
	public void practice5(){
		
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("학년(숫자만) : ");
		int a = sc.nextInt();
		
		System.out.println("반(숫자만) : ");
		int b = sc.nextInt();
		
		System.out.println("번호(숫자만) : ");
		int c = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		
		String genderStr = (gender == 'M' || gender == 'm') ? "남학생" : "여학생";
		
		
		System.out.println
		(a +"학년 "+ b +"반 " + c + "번 " + name + " " +genderStr+ "의 성적은 " + score + "이다.");
		
	}
	
	
	public void practice6(){
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		if(age<=13) {
			System.out.println("어린이");
		}else if(age > 13 && age <= 19) {
			System.out.println("청소년");
		}else{
			System.out.println("성인");
		}
	}

	public void practice7(){
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double avg = (double)sum/3; 
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		if (korean >= 40 && english >= 40 && math >=40 && avg >=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

	}
	
	public void practice8(){
		System.out.println("주민번호를 입력하세요(-포함) : ");
        String jumin = sc.nextLine();

        char gender = jumin.charAt(jumin.indexOf('-') + 1);

        if (gender == '1' || gender == '3') {
            System.out.println("남자");
        } else if (gender == '2' || gender == '4') {
            System.out.println("여자");  
        }
      
	}
	
	public void practice9(){
		System.out.println("정수 1: ");
		int num1 = sc.nextInt();
		System.out.println("정수 2: ");
		int num2 = sc.nextInt();
		
		if(num1 >= num2) {
		        System.out.println("정수1은 정수2보다 작아야 합니다.");
		        return;
		    }
		
		System.out.println("입력: ");
		int num3 = sc.nextInt();
		
		 
		
		if(num3 <= num1 || num3 > num2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
	}
	
	
	

	public void practice10(){

		System.out.println("입력 1 : ");
		int input1 = sc.nextInt();
				
		System.out.println("입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.println("입력 3 : ");
		int input3 = sc.nextInt();
		
		if(input1 == input2 && input1 == input3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	public void practice11(){
		
		System.out.print("A사원의 연봉 : ");
        double aSalary = sc.nextDouble();

        System.out.print("B사원의 연봉 : ");
        double bSalary = sc.nextDouble();

        System.out.print("C사원의 연봉 : ");
        double cSalary = sc.nextDouble();

        double aTotal = aSalary * 1.4;  
        double bTotal = bSalary;              
        double cTotal = cSalary * 1.15;
        
        
        // A사원
        System.out.println("A사원 연봉/연봉+a : " + aSalary + "/" + aTotal);
        if (aTotal >= 3000) {
            System.out.println("3000 이상");
        } else {
            System.out.println("3000 미만");
        }

        // B사원
        System.out.println("B사원 연봉/연봉+a : " + bSalary + "/" + bTotal);
        if (bTotal >= 3000) {
            System.out.println("3000 이상");
        } else {
            System.out.println("3000 미만");
        }

        // C사원
        System.out.println("C사원 연봉/연봉+a : " + cSalary + "/" + cTotal);
        if (cTotal >= 3000) {
            System.out.println("3000 이상");
        } else {
            System.out.println("3000 미만");
        }

        sc.close();
    }
	}



