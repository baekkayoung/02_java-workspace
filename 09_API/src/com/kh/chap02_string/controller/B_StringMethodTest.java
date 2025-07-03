package com.kh.chap02_string.controller;

public class B_StringMethodTest {
	
	public void method() {
		String str1 = "Hello World";
		
		// 메소드명(매개변수) : 반환형
		
		// 1. 문자열.charAt(int index) : char
		//    문자열에서 전달받은 index 위치의 문자 반환
		char ch = str1.charAt(3); 
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		// 	  문자열 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!"); // new String임
		System.out.println("str 2 : " + str2 );
		
		String str3 = str1 + "!!!";
		System.out.println("str 3 : " + str3);
		
		System.out.println("str2 == str 3 : " + str2 == str3);
		// 근데 아까전에 StringPool에서는 같은 글자면 같은 주소 가진다고 하지 않았나?
		// concat을 열어보면 안에 new가 있음 => heap에 새로운 주소값으로 따진다
		
		// 3. 문자열.equals(Object obj) : boolean // Object 다형성
		//	  문자열과 전달된 또 다른 문ㅁ자열 가지고 주소값 비교가 아닌 실제 문자열 가지고 동등비교
		
		System.out.println("str2 str가 일치합니까 ? : "+ str2.equals(str3)); // 다형성때문에 받을 수 있음
		
		// 4. 문자열.contains(CharSequence s) : boolean
		System.out.println("str1에 Hello 문자열이 포함되어있는가? : " + str1.contains("Hello"));  // contains는 부모격 자료형
		System.out.println("str1에 Hello 문자열이 포함되어있는가? : " + str1.contains("Bye"));
		
		// 5. 문자열.length() : int
		System.out.println("str1 의 길이 : " + str1.length()); //11
		
		
		// 6. 문자열.substring(int beginIndex) : String
		// 	  문자열.substring(int beginIndex, int endIndex) : String 반환
		
		// Hello World 
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3, 7)); // 오버로딩 되어이씀 3부터 6
		
		// ** Quiz
		// hello world
		// 1. str1 => Worl만 추출 + concat() !를 붙여서  = > str0 = Worl! 저장
		
		System.out.println(str1.substring(6,10));
		String a = str1.substring(6,10);
		String b = a.concat("!");
		String str0 = b;
		System.out.println(str0);
		// String str0 = str1.substring(6,10).concat("!"); 이렇게 줄여서 쓸 수 있음
		
		
		// 2. contains 함수를 이용해서 str0에 !가 포함돼있는지 여부 추출 > str0에 !가 포함돼있습니까? : true
		System.out.println("str0에 !가 포함돼있습니까? : " + str0.contains("!"));
		
		
		// 7. 문자열.replace (char oldChar, char newChar) : String
		String str4 = str1.replace('l', 'c');
		System.out.println(str4);
		System.out.println(str1); // 얘는 바뀌지 않음 
		
		// 8.문자열.toUpperCase() : String
		//	 문자열.toLowerCase() : String
		
		String str5 = str1.toUpperCase();
		System.out.println(str5);

		
		
		
		
		
		
		
		
		
	}
}
