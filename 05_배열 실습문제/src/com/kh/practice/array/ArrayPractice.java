package com.kh.practice.array;

import java.util.Arrays;
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
	
	public void practice9() {
		String[] chks = { "후라이드", "간장", "양념", "청양마요" };
		
		System.out.println("치킨 이름을 입력하세요");
		String pick = sc.nextLine();
		
		boolean found = false; // 아무것도 찾은 게 아직 없으니까 false로 초기화
		
		for(int i = 0 ; i < chks.length; i++) {
			if(pick.equals(chks[i])){
				found = true; // 일치했을때의 true 값을 found에 저장, 찾았다면 break
				break;
			}
		}
		if(found) {
			System.out.println(pick + "치킨 배달 가능");
		} else {
			System.out.println(pick + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10(){
		
		System.out.println("주민등록번호(-포함): ");
		String num = sc.nextLine();
		
		char[] copy = num.toCharArray(); // 문자열 num을 문자 배열 copy에 저장 copy[0~13]

        // 성별 자리 이후부터 *로 변경
        for (int i = 8; i < copy.length; i++) {
            copy[i] = '*'; // 배열의 내용을 수정
        }

        // 복사본만
        System.out.println(new String(copy)); // 수정된 배열로 새 문자열 만듦
    }

		
	public void practice11(){
		
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		int[] num= new int[10];
		
		//1~10 사이 난수를 발생시켜
		//배열에 초기화한 후 출력하세요.
		
		for(int i = 0 ; i<num.length; i++) {
			int ran =(int)(Math.random()*10+1);
			num[i] = ran;
		}
		
		for(int i=0 ; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		

	}
	
	
	
	
	public void practice12(){
		
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		int[] arr = new int[10];
		//1~10 사이의 난수를 발생시켜 배열에 초기화 후
		for(int i = 0; i <arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			arr[i]=ran;
			}
		for(int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) { 
		    if (arr[i] > max) { // arr 0번은 이미 최대값, 최소값으로 지정했으니까 1번부터 9번 인덱스, 총 9번 비교
		        max = arr[i];
		    }
		    if (arr[i] < min) {
		        min = arr[i];
		    }
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	
	public void practice13(){
		
		int[] arr = new int[10]; // 크기 10인 정수형 배열 선언
		int count = 0 ; // 중복 카운트
		
		while(count <arr.length) {
			int ran = (int)(Math.random()*10+1); // 1~10 사이의 난수 생성해서 ran에 저장
			boolean isDuplicate = false; // 중복 검사 변수
			
			for (int i = 0; i<arr.length; i++) { // 0 1 2 3 4 5 6 7 8 9 -> 총 10번 반복
				if (arr[i] == ran) { 
					isDuplicate = true;
					break; // 만약 arr[i]와 랜덤값이 중복이면 if문 빠져나오기
				}
			}
			
			if(!isDuplicate) { // 만약 중복이 아니면
				arr[count] = ran; // arr[1~10]에 랜덤값 저장
				count++; // 하고 카운트 업
			}
		}
		
        for (int i = 0; i < arr.length; i++) { // 0부터 9까지 반복 총 10번 반복
            System.out.print(arr[i] + " "); // arr 배열 값 모두 출력
        }
		
    }
	
	
	
	
	public void practice14() {

		int[] lotto = new int[6]; // int 배열 lotto 크기 6
		int count = 0; // 배열에 숫자 몇 개 채워졌는지 카운트

		while (count < lotto.length) { // 번호가 다 채워질 때까지 반복
			int ran = (int) (Math.random() * 45 + 1); // 번호 1부터 46까지 랜덤값 저장

			boolean isDuplicate = false; // 중복 숫자 확인 변수

			// 중복 검사
			for (int i = 0; i < count; i++) { // 6개 번호 모일 때까지
				if (lotto[i] == ran) { // 만약 lotto 배열에 저장된 값과 랜덤값이 같으면 > 중복이라는 의미
					isDuplicate = true;
					break; // 중복이라면 반복문 나가서 if문으로
				}
			}

			if (!isDuplicate) { // 만약 중복이 아니라면
				lotto[count] = ran; // count 위치에 랜덤값 하나 저장하고
				count++; // count 증가시켜 다음 자리 숫자 저장할 준비
			}
		}

		// lotto 배열 값들 오름차순 정리
		Arrays.sort(lotto);

		for (int i = 0; i < lotto.length; i++) { // 0 1 2 3 4 5 번 인덱스
			System.out.print(lotto[i] + " ");
		}
	}

		
	
	
	
	
	public void practice15(){

		System.out.println("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
		    arr[i] = str.charAt(i); // arr 인덱스에 입력한 문자열의 문자 차례대로 저장
		}
		
		System.out.println("문자열에 있는 문자 : " + Arrays.toString(arr)); // 배열 arr을 String으로 변환
		System.out.println("문자 개수 : " + arr.length);


	}
	
	
	
	
	
	public void practice16(){
		
		System.out.print("배열의 크기를 입력하세요 : ");
        int size = sc.nextInt(); // 사용자가 입력한 값 저장
        sc.nextLine(); 

        String[] arr = new String[size]; // 사용자가 입력한 값 크기의 배열 생성

        for (int i = 0; i < size; i++) { // 사용자가 입력한 값만큼 
            System.out.print((i + 1) + "번째 문자열 : "); // sysout 출력
            arr[i] = sc.nextLine(); // 사용자가 입력한 문자열 배열 인덱스에 저장
        }

        while (true) {
            System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
            String answer = sc.nextLine().trim();

            if (answer.equalsIgnoreCase("N")) {
                break;
            } else if (answer.equalsIgnoreCase("Y")) {
                System.out.print("더 입력하고 싶은 개수 : ");
                int moreCount = sc.nextInt();
                sc.nextLine(); // 개행 문자 제거

                // 기존 배열 크기 + 추가할 크기만큼 새로운 배열 생성
                String[] newArr = new String[arr.length + moreCount];

                // 기존 데이터 복사
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }

                // 추가 입력 받기
                for (int i = arr.length; i < newArr.length; i++) {
                    System.out.print((i + 1) + "번째 문자열 : ");
                    newArr[i] = sc.nextLine();
                }

                // 참조 업데이트
                arr = newArr;
            } 
        }

        // 결과 출력
        System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
