package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
//		길이가 10인 배열을 선언하고
		int[] arr =new int[10];// 0 1 2 3 4 5 6 7 8 9 
		
		//1부터 10까지의 값을 반복문을 이용하여
		for(int i=0 ; i<arr.length; i++) {
			arr[i] = i+1;
		}
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2(){
		
		int[] arr =new int[10];
		
		for(int i=0 ; i<arr.length; i++) {
			arr[i] = 10-i;
	}
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3(){
		
		// 입력받기
		System.out.print("양의 정수 : ");
        int size = sc.nextInt();
        
        // 입력 받은 수 크기의 배열 생성
        int[] arr = new int[size];
        
        // arr 배열의 인덱스에 값 저장하기
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        //출력하기
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
	}
	
	public void practice4(){
		String[] fruits = new String[5];
		fruits = new String[] {"귤", "포도", "복숭아", "참외"};
		
		System.out.println(fruits[0]);

	}	
	
	public void practice5(){
		
		System.out.print("문자열 : ");
        String str = sc.nextLine();

        System.out.print("문자 : ");
        char ch = sc.next().charAt(0); 

        int count = 0;

        System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");

        for (int i = 0; i < str.length(); i++) { 
            if (str.charAt(i) == ch) {
                System.out.print(i +  " " );
                count++;
            }
        }

        System.out.println();
        System.out.println(ch + " 개수 : " + count);
	}
	
	
	public void practice6(){
		

        String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

        System.out.print("0 ~ 6 사이 숫자 입력 : ");
        int index = sc.nextInt();

        if (index >= 0 && index <= 6) {
            System.out.println(days[index]);
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
	}
	
	
	public void practice7(){
		
		System.out.print("정수 : ");
        int size = sc.nextInt(); 

        int[] arr = new int[size]; // 배열 생성
        int sum = 0; 

       
        for (int i = 0; i < size; i++) {
            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            arr[i] = sc.nextInt(); // 사용자가 입력한 값 저장
            sum += arr[i];
        }

        // 숫자 나열
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        System.out.println("총 합 : " + sum);
	}
	
	public void practice8(){
		
		int n;

        while (true) {
            System.out.print("정수 : ");
            n = sc.nextInt();

            // 3 이상 홀수인지 확인
            if (n >= 3 && n % 2 == 1) {
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }

        int[] arr = new int[n];
        int mid = n / 2; // 중간 인덱스

        // 배열 앞부분: 1부터 증가
        for (int i = 0; i <= mid; i++) {
            arr[i] = i + 1;
        }

        // 배열 뒷부분: 1씩 감소
        for (int i = mid + 1; i < n; i++) {
            arr[i] = arr[i - 1] - 1;
        }

        // 출력
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

	}
	
	public void practice9(){
		
		String[] chickenMenu = {"후라이드", "양념", "간장", "마늘", "허니콤보", "고추바사삭"};

        System.out.print("치킨 이름을 입력하세요: ");
        String input = sc.nextLine().trim(); // 공백 제거

        boolean found = false;

        // 배열을 순회하며 입력값과 비교
        for (String menu : chickenMenu) {
            if (menu.equals(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(input + "치킨 배달 가능");
        } else {
            System.out.println(input + "치킨은 없는 메뉴입니다.");
        }
	}
	
	
	
}
