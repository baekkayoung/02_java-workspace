package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 받아들이는 Scanner(출력) 실습
public class B_KeyboardInput {

	public void inputTest1(){
		/*
		 * 키보드로 값을 입력하는 방법
		 * Scanner를 사용한다!
		 * 즉 java.util.Scanner 클래스를 이용할거임
		 * Scanner 클래스 내부의 메소드를 호출하여 입력 받을 것
		 */
		
		// 스캐너 클래스의 객체 생성
		// 클래스명 별칭 = new 클래스명()
		
		Scanner sc = new Scanner(System.in);
		// System.in은 입력받은 값을 바이트 단위로 받아들이겠다는 의미. 표현법
		// System.out => 출력시
		
		System.out.print("아무거나 입력해주세요 : ");
		String message = sc.nextLine();
		
		System.out.println("입력받은 내용 : " + message);
		
		
		sc.close();
	}
	
	public void inputTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드 (next(). nextLine())
		String name = sc.nextLine();
		
		// System.out.println("이름 : " + name);
		System.out.print("당신의 나이는 몇 살 입니까 : " );
		int age = sc.nextInt(); // 사용자가 입력한 값을 정수로 받음
		
		System.out.print("당신의 키는 몇입니까?(소숫점 붙여서...");
		double heigth = sc.nextDouble();
		
	}
	
	//키보드로 값을 입력 받을 때 종종 발생되는 문제
	
	public void inputTest3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 여기서 이상함.. 버퍼에 남아있는 엔터 제거!
		// int는 숫자만 읽고 엔터가 남아있어서 주소가 입력창도 안 뜨고 그냥 넘어감. 
		//그래서 비워주는 과정을 거쳐야 함
		sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		// xxx님은 xx살이며, 사는 곳은 xxx이고, 키는 xxx.xcm 입니다.
//		System.out.print(name + "님은" + age + "살이며, 사는 곳은" + address +"이며, 키는" + height + "cm 입니다." );
		System.out.printf("%s님은 %d살이며, 사는 곳은 %s이고, 키는 %.1fcm 입니다 ", name, age, address, height);
	}
	
	public void inputTest4(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		// 문자열.charAt(인덱스) : 해당 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드
		// * 인덱스 : 순번 같은 존재. 단, 0부터 시작!
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println(name+ "님의 개인 정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
	
	public void charAtTest(){
		String str = "Hello";
		
		//System.out.println(str.charAt(9));
		//StringIndexOutOfBoundsException 발생 : 인덱스 범위 벗어남!
	}
	
	/*
	 * ** 정리 **
	 * 1. 콘솔창에 출력하기 위해 : System.out.println() 이용
	 * 2. 콘솔창에 입력하기 위해 : Scanner 이용해서 (nextLine(), nextInt(), ...)
	 * 
	 * 		>주의 사항
	 * 		1) sc.nextXXXX() 메소드 뒤에 sc.nextLine()메소드가 와야 될 경우
	 * 		   sc.nextLine() 써서 버퍼에 남아있는 엔터 제거
	 */
	
}

