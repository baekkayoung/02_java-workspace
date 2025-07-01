package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		
		if(num>=0) {
			for (int i=1; i<=num ; i++){
				System.out.print(i +" ");
			}
		}else {
	        System.out.println("1이상의 숫자를 입력해주세요");
	    }
	}
	
	
	
	
	
	public void practice3(){
	
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for (int i=num; i>=1; i--){
				System.out.print(i +" ");
			}
		}else {
	        System.out.println("1이상의 숫자를 입력해주세요");
	    }
	}
	
	
	public void practice5(){
			System.out.print("정수 하나를 입력하세요 : ");
			int num = sc.nextInt();
			
			
			int sum = 0;
			
		    if (num >= 1) {
		    	
		    }
		        for (int i = 1; i <= num; i++) {
		            sum += i;

		            if (i < num) {
		                System.out.print(i + " + ");
		            } else {
		                System.out.print(i + " = ");
		            }
		        }
		        System.out.println(sum);
		    
	}
	
	
	public void practice6(){
		
		System.out.println("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자: ");
		int num2 = sc.nextInt();
		
		if (num1 < 1 || num2 < 1) {
            System.out.println("1 이상의 숫자를 입력해주세요.");
        } else {
            int start = Math.min(num1, num2); //두 수 중 작은 값 고르기
            int end = Math.max(num1, num2); //두 수 중 큰 값 고르기

            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
        }
	}
	
	
	
	public void practice8(){
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		System.out.println("==== "+ num +"단 ====");
		
		for (int i = 1 ; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", num , i , num * i);
		}
		
	}
	
	
	public void practice9(){
		
		System.out.println("숫자 : ");
		int num =sc.nextInt();
		
		
		if(num>9) {
			System.out.println("9이하의 숫자만 입력해주세요");
		}
		
		for(int dan=num; dan<10; dan++) {
			System.out.println("==== "+ dan +"단 ====");
			for(int i=1 ; i<=10; i++) {
				System.out.printf("%d + %d = %d\n" , dan, i, 2*dan);
			}
			System.out.println();
	}
	}
	

	
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int diff = sc.nextInt();
		
		for(int i=0; i<10 ; i++ ) {
			System.out.print((start + diff * i) + " ");
		}
	
	
	}	
	
	
	public void practice13(){
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		
		for (int j = 1; j <= num; j++) {
		    for (int i = 1; i <= j; i++) {
		        System.out.print("*");
		    }
		    System.out.println();
		
	}
	}
	
	public void practice14(){
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		
		for (int j=num; j>=1; j--) {
		    for (int i = 1; i <= j; i++) {
		        System.out.print("*");
		    }
		    System.out.println();
		
	}
	}
	
	
}