package com.kh.run;

import com.kh.arry.B_ArrayCopy;

public class BubbleSortRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {22, 30, 68, 1, 13, 87, 99};
		int temp = 0 ; // 이동시 임시 자리
		
		//전체 사이클이 돌아가는 큰 포 하나, 비교하는 포문 하나
		for(int i=0; i <arr.length; i++) { // 사이클이 돌아가는 for 문
			
			for(int j=1; j<arr.length; j++) { // 자기들끼리 돌아가는 for 문
				if(arr[j-1]>arr[j]) { //앞, 뒤. 앞에것이 더 클때 바꿈. 안 크면 안 함
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
