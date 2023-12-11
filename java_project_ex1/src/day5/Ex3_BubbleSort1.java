package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3_BubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// 버블 정렬
//		int arr[] = { 4, 1, 6, 7, 8, 11, 13, 14, 12 };
//		int temp;
//		int a = 1;
//		for (int j = 0; j < arr.length; j++) {
//			for (int i = 0; i < arr.length - (j + 1); i++) {
//				if (arr[i] > arr[i + 1]) {
//					temp = arr[i + 1];
//					arr[i + 1] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));


		int s=in.nextInt();
		int arr[] = { 7, 4, 5, 1, 3 };
		
		int temp;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - (j + 1); i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

//		for (int i = 4; i >= 1; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
	}
}
