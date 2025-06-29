package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * * 증감연산자(단항연산자)
	 * ++ : 변수에 담긴 값을 1 증가시켜주는 연산자
	 * 		++변수, 변수++
	 * -- : 변수에 담긴 값을 1 감소시켜주는 연산자
	 * 		--변수, 변수--
	 * 
	 * (증감연산자)변수 : 전위연산자 => "선증감" 후처리
	 * 변수(증감연산자) : 후위연산자 => 선처리 "후증감"
	 *  
	 */
	
	public void method1() {
		
		// 전위연산 테스트
		int num1 = 10;
		System.out.println("전위연산 적용전 num1의 값:" + num1); // num1 = 10
		System.out.println("1회 수행 : " + ++num1); // num1 =11
		System.out.println("2회 수행 : " + ++num1); // num1 =12
		System.out.println("3회 수행 : " + ++num1); // num1 =13
		System.out.println("최종 num1 : " + num1); // num1 =13
		
		System.out.println("================================");
		
		// 후위연산 테스트
		int num2 = 10;
		System.out.println("후위연산 적용전 num2의 값 : " + num2);
		System.out.println("1회 수행 :" + num2++); // 10 출력 후 => num2가 11로 증가 (보이는 건 10이지만)
		System.out.println("2회 수행 :" + num2++); // 11 출력 후 => num2가 12로 증가 (보이는 건 11이지만)
		System.out.println("2회 수행 :" + num2++); // 12 출력 후 => num2가 13로 증가 (보이는 건 11이지만)
		System.out.println("최종 num2의 값: " + num2); // 13
		
		}
	
	
		public void method2(){
			int a = 10;
			int b = ++a; // a = 11 b = 11
			System.out.printf("a: %d, b: %d\n", a, b );
			
			
				int c = 10;
				int d = c++; // c=11, d=10 
				//c값을 먼저 d에 대입 후(d=10), c를 1 증가시킴 c=11
				System.out.printf("c : %d, d: %d\n" , c , d);
			
			
			System.out.println("===============");
			int num = 20;
			System.out.println("현재 num : " + num);
			System.out.println("++num은? : " + ++num); //21
			System.out.println("nim++은? : " + num++); //21(줄 넘어가고 나서는 22)
			System.out.println("--num은? : " + --num); //21(22였는데 전위 --로 21)
			System.out.println("num--은? : " + num--); //21(줄 넘어가고 나서는 20)
			System.out.println("최종 num : " + num); //20
			
			}
		
			public void method3() {
				int num1 = 20;
				int result1 = ++num1 * 3; //num1 = 21, result1 = 63
				System.out.printf("num1 : %d, result1 : %d\n" , num1, result1 );
				
				int num2 = 20;
				int result2 = num2++ * 3; //num2 = 20, result2 = 60
				System.out.printf("num2 : %d, result2 : %d\n" , num2 , result2);
				
				
				
				
			
	}

}
