package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("정수 : ");
        int num = sc.nextInt();
        
        if (num <= 0) {
            System.out.println("양수가 아닙니다.");
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.print("수");
                } else {
                    System.out.print("박");
                }
            }
            System.out.println(); 
        }	
	}
	
	public void practice2(){

		int num;
		
		while(true) {
			System.out.print("정수 :");
			num = sc.nextInt(); // 값만 대입
			
			if(num<1) {
				System.out.println("정수가 아닙니다.");
			}else {
				break;
			}
			
		}
		
		for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print("수");
            } else {
                System.out.print("박");
            }
        }
        System.out.println();	
	}
	
	public void practice3() {

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}

		System.out.println(str + " 안에 포함된 " + ch + " 개수 : " + count);

	}
	
	
	
	public void practice4() {

        while (true) {
            System.out.print("문자열 : ");
            String str = sc.nextLine();

            System.out.print("문자 : ");
            char ch = sc.next().charAt(0);
            sc.nextLine(); 

      
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            System.out.println(str + " 안에 포함된 " + ch + " 개수 : " + count);

            while (true) {
                System.out.print("더 하시겠습니까? (y/n) : ");
                String answer = sc.nextLine().trim();

                if (answer.equalsIgnoreCase("y")) {
                    break; 
                } else if (answer.equalsIgnoreCase("n")) {
                    sc.close();
                    return;
                } else {
                    System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
                }
            }
        }
    }
	
	
	
}
