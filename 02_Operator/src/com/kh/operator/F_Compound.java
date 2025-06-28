package com.kh.operator;

public class F_Compound {
	
	/*
	 * *복합 대입 연산자
	 * 	산술연산자와 대입연산자가 결합이 되어있는 형태 (산술연산 먼저쓰고 대입연산은 나중에)
	 * 	연산 처리 속도가 빨라지므로 사용하는 걸 권장함
	 * 
	 *  += -= *= %=
	 *  
	 *  a = a + 3;  =>  a += 3; //a에다가 대입하겠다 a에 3을 더한 값을
	 *  a = a - 3;  =>  a -= 3;
	 *  a = a * 3;  =>  a *= 3;
	 *  a = a / 3;  =>  a /= 3;
	 *  a = a % 3;  =>  a %= 3;
	 * 
	 */
	
	public void method1() {
		int num = 12;
		
		System.out.println("최초 num :" + num);
		num = num + 3;
		System.out.println("3을 증가시킨 num :" + num); // 15
		
		num += 3;
		System.out.println("3을 증가시킨 num : " + num); // 18
		
		num -=5;
		System.out.println("3을 감소시킨 num : " + num); // 13
		
		num *= 6;
		System.out.println("6배 증가시킨 num : " + num); // 78
		
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num); // 39
		
		num %= 4;
		System.out.println("최종 num : " + num); // 3
		
		String str = "Hello";
		//str = str + "World!!"; : 귀찮음
		str += " World!!";
		
		System.out.println(str);
		
		
		
	}

}
