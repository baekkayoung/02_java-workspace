package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	
	Scanner sc = new Scanner(System.in);

	public void rps() {

		System.out.print("당신의 이름을 입력해주세요 : ");
		String userName = sc.nextLine();

		String[] rps = { "가위", "바위", "보" };
		int win = 0, draw = 0, lose = 0, total = 0;

		while (true) {
			System.out.print("가위바위보 : ");
			String userInput = sc.nextLine().trim();

			
			if (userInput.equalsIgnoreCase("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패\n", total, win, draw, lose);
				break;
			}
			if (!userInput.equals("가위") && !userInput.equals("바위") && !userInput.equals("보")) {
				System.out.println("잘못 입력하셨습니다");
				continue;
			}


			int computerIdx = (int) (Math.random() * 3);
			String computerChoice = rps[computerIdx];

			System.out.println("컴퓨터 : " + computerChoice);
			System.out.println(userName + " : " + userInput);

			total++;

			// 판정
			if (userInput.equals(computerChoice)) {
				System.out.println("비겼습니다");
				draw++;
			} else if ((userInput.equals("가위") && computerChoice.equals("보"))
					|| (userInput.equals("바위") && computerChoice.equals("가위"))
					|| (userInput.equals("보") && computerChoice.equals("바위"))) {
				System.out.println("이겼습니다!");
				win++;
			} else {
				System.out.println("졌습니다 ᅲᅲ");
				lose++;
			}

			System.out.println();
		}

	}

}
