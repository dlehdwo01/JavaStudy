package day6;

import java.util.Arrays;

public class Deep_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 5, 10, 30, 5, 10, 25, 5, 10, 26, 44, 10 };
		int minidx;

		// 1 중복값에 0을 입력하여 분류

		int reidx = 0;
		for (int j = 0; j < arr.length; j++) {
			reidx = j;
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[i] == arr[reidx]) {
					arr[reidx] = 0;
				}
			}
		}

		int zero = 0;
		// 2 오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			minidx = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[minidx]) {
					minidx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minidx];
			arr[minidx] = temp;

			if (arr[i] == 0) {
				zero++;
			}
		}

		// 3 (배열수-중복값)의 배열 생성하기

		int arr1[] = new int[arr.length - zero];
		int k = 0;
		for (int i = zero; i < arr.length; i++) {
			arr1[k] = arr[i];
			k++;
		}
		System.out.println(Arrays.toString(arr1));

	}

}
