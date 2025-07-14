package com.kh.chap03.branch;

public class B_Continue {

	/*
	 * continue; : 반복문 안에 기술되는 구문
	 *             continue; 구문 실행시 그 뒤의 구문은 실행하지 않고 현재 속해있는 반복문 위로 올라감
	 *             건너뛰기와 같음
	 */
	
	public void method1() {
		// for문으로 1~10까지의 홀수 출력
		// 1 3 5 7 9

		/*
		 * for(int i=1; i<11; i++) { if(i % 2 == 1) {
		 * System.out.println((i+" ")); } } }
		 */
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) { // 짝수
				continue; // 만나면 아래에 있는 것 실행 x 증감식만 수행
			}
			System.out.print(i + " ");
		}
	}
	
	public void method2() {
		// 2~9단 까지 출력 => for문 중첩
		// 단, 3의 배수단은 빼고 출력
		// 일단 2단 만들고 전체 반복에 감싼 다음 if문으로 3의 배수단 제외

		for (int dan = 2; dan < 10; dan++) {
			if (dan % 3 == 0) {
				continue;// 아래 코드 실행 안 하고증가만!
			}
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		}
	}
	
	public void method3() {
		for(int dan = 1; dan<10; dan++) {
			if(dan%3==0) {
				continue;
			}
			for(int i=1; i < 10; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		}
		}
			
	
	
	
	
	
	
	
}
