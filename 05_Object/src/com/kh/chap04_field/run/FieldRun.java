package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FieldTest1 f1 = new FieldTest1();
		//f1.test(7);
		
		FieldTest2 f2 = new FieldTest2();
		
		//public
		System.out.println(f2.pub);
		
		//protected
		//System.out.println(f2.protected);
		
		//System.out.println(f2.default);
		
		//System.out.println(f2.pri);
		
		FieldTest3 f3 = new FieldTest3();
			//System.out.println(f3.sta);
			//System.out.println(FieldTest3.sta);
		System.out.println(Math.PI);
		System.out.println(FieldTest3.STA_FIN);

	}

}
