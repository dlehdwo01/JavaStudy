package day5;

import java.util.Arrays;

public class Ex6_SelectSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 9, 6, 7, 2, 5, 4, 3, 8, -5, 130 };

//		int minIdx = 0;

//		for (int i = 1; i < arr.length; i++) {
//			minIdx = (arr[i] < arr[minIdx]) ? i : minIdx;
//		}
//		int temp = arr[0];
//		arr[0] = arr[minIdx];
//		arr[minIdx] = temp;
//		System.out.println(Arrays.toString(arr));
//		
//		minIdx=1;
//		
//		for (int i = 1; i < arr.length; i++) {
//			minIdx = (arr[i] < arr[minIdx]) ? i : minIdx;
//		}
//		temp = arr[1];
//		arr[1] = arr[minIdx];
//		arr[minIdx] = temp;

		// 삽입정렬
//		for (int j = 0; j < arr.length; j++) {
//			int minIdx = j;
//			for (int i = j; i < arr.length; i++) {
//				minIdx = (arr[i] < arr[minIdx]) ? i : minIdx;
//			}
//			int temp = arr[j];
//			arr[j] = arr[minIdx];
//			arr[minIdx] = temp;
//		}
//
//		System.out.println(Arrays.toString(arr));

		for (int j = 0; j < arr.length; j++) {
			int minIdx = j;
			for (int i = j+1; i < arr.length; i++) {
				minIdx = (arr[i] < arr[minIdx]) ? i : minIdx;
			}
			int temp = arr[j];
			arr[j] = arr[minIdx];
			arr[minIdx] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
