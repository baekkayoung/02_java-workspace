package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NoneStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NoneStaticMethod n = new NoneStaticMethod();
//		n.method1();
		
//		
//		   String str = n.method2(); // 이걸 해야 아 집에가고 싶다 볼 수 있음
//			System.out.println(str);
//			System.out.println(n.method2());// 이렇게도 가능
//
//		
		
		
//		n.method3(20,0);
		
//		char ch = n.method4("lemon", 1);
//		System.out.println(ch);
		
		/* 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열:");
		String str = sc.nextLine();
		
		System.out.println("인덱스 값:");
		int index = sc.nextInt();
		
		char ch =  n.method4(str, index); // 
	}*/
		
		//staticMethod : 생성 없이 호출 가능
//		
//		StaticMethod.method1();
//		int num = StaticMethod.method2();
//		System.out.println(num);
//		// return은 안보이니까.
//		StaticMethod.method3("차은우");
		System.out.println(StaticMethod.method4("apple", "kiwi"));
//		
		
		OverloadingTest ot = new OverloadingTest();
//		ot.test();
//		ot.test(10);
//		ot.test(10, "차은우");
//		ot.test("박보검",20);
//		ot.test("장원영");
		
//		// 오버로딩 -> print();
//		System.out.print(10.5);
//	
	}
}
