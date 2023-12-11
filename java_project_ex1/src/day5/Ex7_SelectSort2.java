package day5;

import java.util.Arrays;

public class Ex7_SelectSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선택정렬 내림차순
//		int arr[] = { 6, 9, 7, 3, 5, 8, 90, -5 };
//		int maxIdx = 0;
//
//		for (int j = 0; j < arr.length; j++) {
//			maxIdx = j;
//			for (int i = j + 1; i < arr.length; i++) {
//				maxIdx = (arr[i] > arr[maxIdx]) ? i : maxIdx;
//			}
//			int temp = arr[j];
//			arr[j] = arr[maxIdx];
//			arr[maxIdx] = temp;
//		}
//		System.out.println(Arrays.toString(arr));

		// 2번문제
		int arr[] = { 10, 25, 32, 54, 23, 16, 27, 61, 55, 78, 72, 46, 91 };
//		int oddCnt = 0;		
//		//홀수 선정렬
//		for (int j = 0; j < arr.length; j++) {
//			int oddIdx = j;
//			
//			for (int i = j + 1; i < arr.length; i++) {
//				oddIdx = (arr[i]%2!=0) ? i : oddIdx;
//			}
//			int temp = arr[j];
//			arr[j] = arr[oddIdx];
//			arr[oddIdx] = temp;		
//			//홀수 개수구하기
//			if (arr[j] % 2 != 0) { 
//				oddCnt++; 
//			}
//		}		
//		
//		//홀수 오름차순 정렬
//		for (int j = 0; j < oddCnt-1; j++) {
//			int minIdx = j;			
//			for (int i = j + 1; i < oddCnt; i++) {
//				minIdx = (arr[i] < arr[minIdx]) ? i : minIdx;			
//			}
//			int temp = arr[j];
//			arr[j] = arr[minIdx];
//			arr[minIdx] = temp;			
//		}
//		
//		//짝수 오름차순 정렬
//		for (int j = oddCnt; j < arr.length; j++) {
//			int minIdx = j;			
//			for (int i = j + 1; i < arr.length; i++) {
//				minIdx = (arr[i] < arr[minIdx]) ? i : minIdx;			
//			}
//			int temp = arr[j];
//			arr[j] = arr[minIdx];
//			arr[minIdx] = temp;			
//		}
//		System.out.println(Arrays.toString(arr));

		// 3번 문제

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int oddCnt = 0;
		int evenCnt = 0;
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCnt++;
			} else {
				evenCnt++;
			}
//			for (int j = i; j < arr.length; j++) {
//				if (arr[j] % 2 != 0) {					
//					int temp = arr[cnt];
//					arr[cnt] = arr[j];
//					arr[j] = temp;
//					cnt++;
//					cnt++;
//				}
			}

		
		System.out.println(oddCnt + " " + evenCnt);
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));

	}
}
