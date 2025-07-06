package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	
	Scanner sc = new Scanner(System.in);
	
	public void upDown(){
		
		int target = (int) (Math.random() * 100) + 1;
		int count = 0;
		int guess = 0;

		while (true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			guess = sc.nextInt();

			if (guess <= 1 || guess >= 100) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
				continue; // 101 입력시 while문 처음으로
			}

			count++;

			if (guess == target) {
				System.out.println("정답입니다 !!");
				System.out.println(count + "회만에 맞추셨습니다.");
				break;
			} else if (guess < target) {
				System.out.println("UP !");
			} else {
				System.out.println("DOWN !");
			}
		}
	}
}
