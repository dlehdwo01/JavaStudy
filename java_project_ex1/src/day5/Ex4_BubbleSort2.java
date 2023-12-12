package day5;

import java.util.Arrays;

public class Ex4_BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// 오름차순 정렬해보기
		int arr[] = { -3, 1, -2, 5, -4 };
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - (j + 1); i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		Arrays.sort(arr); // 오름차순은 자바에 이미 명령어가 등록되어있다.
		System.out.println(Arrays.toString(arr));

//		// 내림차순 정렬해보기
//		int arr[] = { 3, 1, 2, 5, 4 };
//		for (int j = 0; j < arr.length; j++) {
//			for (int i = 0; i < arr.length - (j + 1); i++) {
//				if (arr[i] < arr[i + 1]) {
//					int temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
	}

}
