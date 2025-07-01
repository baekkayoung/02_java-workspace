package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1(){
		
		int[] arr = new int[10];
		
		for(int i=0; i<=9; i++) { // 1 2 3 4 5 6 7 8 9 10
			arr[i] += i+1; // 0부터 시작
		System.out.print(arr[i] + " ");
		}
	}


}