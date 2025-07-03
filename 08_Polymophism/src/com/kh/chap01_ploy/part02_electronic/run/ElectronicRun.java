package com.kh.chap01_ploy.part02_electronic.run;

import com.kh.chap01_ploy.part02_electronic.controller.ElectronicShop1;
import com.kh.chap01_ploy.part02_electronic.controller.ElectronicShop2;
import com.kh.chap01_ploy.part02_electronic.model.vo.Desktop;
import com.kh.chap01_ploy.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_ploy.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실행용 클래스는 납품업체라고 생각. 주는 역할
	/*	
		// 1. 다행성을 적용 안했을 경우
		
		ElectronicShop1 es = new ElectronicShop1();
		
		es.insert(new Desktop("samsung", "데땁", 1200000, "gtx1070")); // 진열 
		es.insert(new NoteBook("Lg", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		Desktop d = es.selectDesktop(); // 데스크 자리에 있는 컴퓨터를 d에 . 저장
		NoteBook n = es.selecNoteBook();
		Tablet t = es.selectTable();
		
		System.out.println(d);
		System.out.println(t);
		System.out.println(n); // toString으로 오버라이드 해놨기 때문에 주소값이 아니라
	}
	*/
		
		// 2. 다형성을 적용했을 경우
		ElectronicShop2 es = new ElectronicShop2();
		es.insert(new Desktop("smsung", "데땁", 1200000, "gtx1080"));
		es.insert(new NoteBook("lg", "그램", 20000000, 4 ));
		es.insert(new Tablet("Apple", "아이패드, 800000, false"));
		
		Electronic d =  es.selcet(0);
		Electronic n =  es.selcet(1);
		Electronic t =  es.selcet(2);
		
		System.out.println(d.toString);// 자식객체의 ㅅ투스드링
		System.out.println(n);
		System.out.println(t);
		// 투스트링할때 부모에 있는 걸 실행것처럼보이짐난 실제로는 자색객체의 투슽릐링 투스트링이 실행됨
		// 이게 동적바인딩
	}
	


}
