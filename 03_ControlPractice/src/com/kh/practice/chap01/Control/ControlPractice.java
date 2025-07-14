package com.kh.practice.chap01.Control;

import java.util.Scanner;

public class ControlPractice {
	
	Scanner sc = new Scanner(System.in);

	
	public void practice1(){
		
		
		System.out.println("번호를 입력하세요 : ");
		int a = sc.nextInt();
		
		switch(a){
			case 1 :
				System.out.println("입력 메뉴 입니다");
				break;
			case 2 :
				System.out.println("수정 메뉴 입니다");
				break;
			case 3 :
				System.out.println("조회 메뉴 입니다");
				break;
			case 4 :
				System.out.println("삭제 메뉴 입니다");
				break;
			case 7 :
				System.out.println("프로그램이 종료됩니다.");
				break;
				
			}
		}
	
	
	public void practice2() {

	    System.out.println("숫자를 한 개 입력하세요 : ");
	    int num = sc.nextInt();

	    if (num > 0) {
	        if (num % 2 == 0) {
	            System.out.println("짝수다.");
	        } else {
	            System.out.println("홀수다");
	        }
	    } else {
	        System.out.println("양수만 입력해주세요");
	    }
	}
	
	
	
	
	
	/* 메소드 명 : public void practice3(){}
국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
불합격인 경우에는 “불합격입니다.”를 출력하세요.

[출력 예시는 다음 장에]

ex 1.
국어점수 : 88 
수학점수 : 50 
영어점수 : 40 
불합격입니다. 


 
ex 2.
국어점수 : 88
수학점수 : 50
영어점수 : 45
국어 : 88
수학 : 50
영어 : 45
합계 : 183
평균 : 61.0
축하합니다, 합격입니다!
}
	
	*/
	
	public void practice3() {
		System.out.print("국어 점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int english = sc.nextInt();
		
		int sum = korean + math + english;
		int average = (korean + math + english) / 3 ;
		
		if(korean >= 40 && math>= 40 && english >= 40 && average >= 60) {
			System.out.println("국어 : " + korean);
	        System.out.println("수학 : " + math);
	        System.out.println("영어 : " + english);
	        System.out.println("합계 : " + sum);
	        System.out.println("평균 : " + average);
	        System.out.println("축하합니다, 합격입니다!");
		} else {
	        System.out.println("불합격입니다.");
		}
	}
	
	
	
	public void practice4(){
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
	    case 12: case 1: case 2:
	        System.out.println(num + "월은 겨울입니다.");
	        break;
	    case 3: case 4: case 5:
	        System.out.println(num + "월은 봄입니다.");
	        break;
	    case 6: case 7: case 8:
	        System.out.println(num + "월은 여름입니다.");
	        break;
	    case 9: case 10: case 11:
	        System.out.println(num + "월은 가을입니다.");
	        break;
	    default:
	        System.out.println(num + "월은 잘못 입력된 달입니다.");
		}
	}
	
	
	public void practice5(){
		
		System.out.println("아이디를 입력하시오 : ");
		String input1 = sc.nextLine();
		System.out.println("비밀번호를 입력하시오 : ");
		String input2 = sc.nextLine();
		
		String id = ("myId");
		String password = ("myPassword12");
		
		if(input1.equals(id)){
	        if(input2.equals(password)){
	            System.out.println("로그인 성공!");
	        }else{
	            System.out.println("비밀번호가 틀렸습니다.");
	        }
	    }else{
	        System.out.println("아이디가 틀렸습니다.");
	    }
	}
	
	
	public void practice6(){
		System.out.println("권한을 확인하고자 하는 회원 등급: ");
		String lv = sc.nextLine();
	
		switch(lv) {
		case "관리자" : System.out.print("회원관리, 게시글 관리, ");
		case "회원" : System.out.print("게시글 작성, 게시글 조회, 댓글 작성"); break;
		case "비회원" : System.out.println("게시글 조회");
		}	
	}
	
	
	public void practice7(){
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		height = height / 100.0;
		
		System.out.print("몸무게를 입력하세요 : ");
		double kg = sc.nextDouble();
		
		
		double BMI = kg / (height * height);
		
		
		if(BMI < 18.5){
			System.out.println("저체중");
		}else if(BMI >= 18.5 && BMI < 23){
			System.out.println("정상체중");
		}else if(BMI >= 23 && BMI < 25) {
			System.out.println("과제충");
		}else if(BMI >= 25 && BMI < 30) {
			System.out.println("비만");
		}else if(BMI>=30) {
			System.out.println("고도비만");
		}
		
		
	}
	
	public void practice8(){

		
		System.out.println("피연산자1 입력 : ");
		int a = sc.nextInt();
		System.out.println("피연산자2 입력 : ");
		int b = sc.nextInt();
		
		System.out.println("연산자를 입력(+, -, *, /, %)");
		char c = sc.next().charAt(0);
		
		if(a > 0 && b > 0){
		    if(c == '+'){
		        System.out.printf("%d + %d = %d\n", a, b, a + b);
		    }else if(c == '-'){
		        System.out.printf("%d - %d = %d\n", a, b, a - b);
		    }else if(c == '*'){
		        System.out.printf("%d * %d = %d\n", a, b, a * b);
		    }else if(c == '/'){
		        System.out.printf("%d / %d = %.6f\n", a, b, (double) a / b);
		    }else if(c == '%'){
		        System.out.printf("%d %% %d = %d\n", a, b, a % b);
		    }else{
		        System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		    }
		}else{
		    System.out.println("두 개의 정수 모두 양수여야 합니다.");
		}
	}	
	
	public void practice9(){
		/*
		 * 
		 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
중간 고사 점수 : 80
기말 고사 점수 : 30
과제 점수 : 60
출석 회수 : 18
================= 결과 =================
중간 고사 점수(20) : 16.0
기말 고사 점수(30) : 9.0
과제 점수 (30) : 18.0
출석 점수 (20) : 18.0
총점 : 61.0
Fail [점수 미달]
		 */
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int ass = sc.nextInt();
		
		System.out.print("출석 회수 : ");
		int att = sc.nextInt();
		
		int totalLec = 20;
		
		 if (att < 14) {
		    System.out.println("====== 결과 ======");
		    System.out.printf("Fail [출석 회수 부족 (%d/%d)]\n", att, totalLec);
		        return; // 종료. 그 뒤의 코드들 실행 안 함
		    }
		
		double midScore = (mid *0.2);
		double finScore = (fin *0.3);	
		double assScore = (ass *0.3);
		double attScore = (att / (double)totalLec)*20;
		
		double totalScore = midScore + finScore + assScore + attScore;
		
		
	    System.out.println("================= 결과 =================");
	    System.out.printf("중간 고사 점수(20) : %.1f\n", midScore);
	    System.out.printf("기말 고사 점수(30) : %.1f\n", finScore);
	    System.out.printf("과제 점수 (30) : %.1f\n", assScore);
	    System.out.printf("출석 점수 (20) : %.1f\n", attScore);
	    System.out.printf("총점 : %.1f\n", totalScore);

		
	    if (totalScore >= 70) {
	        System.out.println("PASS");
	    } else {
	        System.out.println("Fail [점수 미달]");
	    }
		
		
		
		
		
		
		
	}
	
	
	
	public void practice10(){
		while(true) {
	        System.out.println("실행할 기능을 선택하세요.");
	        System.out.println("1. 메뉴 출력");
	        System.out.println("2. 짝수/홀수");
	        System.out.println("3. 합격/불합격");
	        System.out.println("4. 계절");
	        System.out.println("5. 로그인");
	        System.out.println("6. 권한 확인");
	        System.out.println("7. BMI");
	        System.out.println("8. 계산기");
	        System.out.println("9. P/F");
	        System.out.println("0. 종료");
	        System.out.print("선택 : ");
	        
	        int choice = sc.nextInt();
	        
	        switch(choice) {
	            case 1: practice1();
	                break;
	            case 2: practice2();
	                break;
	            case 3: practice3();
	                break;
	            case 4: practice4();
	                break;
	            case 5: practice5();
	                break;
	            case 6: practice6();
	                break;
	            case 7: practice7();
	                break;
	            case 8: practice8();
	                break;
	            case 9: practice9();
	                break;
	            case 0:
	                System.out.println("프로그램을 종료합니다.");
	                sc.close();
	                return;
	                
	            default:
	                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
	        }
	    }
	}
	
}