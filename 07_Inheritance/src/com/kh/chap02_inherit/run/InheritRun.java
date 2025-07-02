package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class InheritRun {

	public static void main(String[] args) {
		
		Car c = new Car("벤틀리", 12.5, "세단", 4);
		Ship s = new Ship("낚시배", 3, "어선", 1);
		Airplane a = new Airplane("종이비행기", 0.01 , "제트기", 10, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		System.out.println("=====================");
		
		/*
		 * * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스를 작성 가능하다.
		 * - 코드를 공통적으로 관리하기 때문에 코드를 추가한다거나 변경에 용이(유지 보수가 높아진다 , 생산성)
		 * 
		 * * 상속의 특징
		 * - 클래스간의 상속에 있어서는 다중 상속이 안됨 ( 단일 상속만 가능 ! )
		 * - 부모클래스에 정의돼있는 protected 필드는 자식클래스에서 직접 접근 가능.
		 * - 자식 객체는 부모클래스에 있는 메소드를 마치 내것처럼 호출 가능
		 * 			+부모 클래스에 있는 메소드가 마음에 안 들면 자식 클래스에서 오버라이딩 가능 ( 내 입맛대로 정의 ) 
		 * - 명시되어있지는 않지만 모든 클래스는(만든 클래스, 제공 클래스)는 object 클래스의 후손이다.
		 * => 즉, object 클래스에 있는 메소드를 마음대로 호출 가능
		 * => 뿐만 아니라 오버라이딩을 통해서 재정의도 가능
		 * 
		 * 비클이 오브젝트 아래. 그래서 오브젝트 메소드를 쓴다고 다중선택 아님 
		 */
		
		
		System.out.println(c.hashCode());
		System.out.println(c.equals(a)); // 스트링이 마음대로 이퀄즈를 바꾼거고(오버라이드) 원래는 주솟값을 비교! 
		System.out.println(c/*.toString()*/); // 평소에 숨져 있던 것. toString은 주솟값 보여주는 것
		
		System.out.println(s);
		System.out.println(a);

	}

}
