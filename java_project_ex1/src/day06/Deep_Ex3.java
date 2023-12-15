package day06;

import java.util.Arrays;

public class Deep_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 25, 32, 54, 23, 16, 27, 61, 75, 35, 99, 19, 44 };

		int oddidx = 0;
		int evenidx = 0;

		for (int i = 0; i < arr.length; i++) {
			// 3 배열 위치값이 짝수일때
			if (i % 2 == 0) {
				// 1-1 홀수 위치값 구하기
				for (int j = i; j < arr.length; j++) {
					if (arr[j] % 2 != 0) {
						oddidx = j;
						break;
					}
				}
				// 1-2 배열내 홀수 중 가장 작은 홀수의 위치값 구하기
				for (int j = i; j < arr.length; j++) {
					if (arr[j] < arr[oddidx] && arr[j] % 2 != 0) {
						oddidx = j;
					}
				}
				// 1-3 배열내 가장 작은 홀수값을 맨 앞으로 이동시키기
				int temp = arr[i];
				arr[i] = arr[oddidx];
				arr[oddidx] = temp;
			}
			// 3 배열 위치값이 홀수일때
			else {
				// 2-1 짝수 위치값 구하기
				for (int j = i; j < arr.length; j++) {
					if (arr[j] % 2 == 0) {
						evenidx = j;
						break;
					}
				}
				// 2-2 배열내 짝수 중 가장 높은 짝수의 위치값 구하기
				for (int j = i; j < arr.length; j++) {
					if (arr[j] > arr[evenidx] && arr[j] % 2 == 0) {
						evenidx = j;
					}
				}
				// 2-3 배열내 가장 높은 짝수값을 맨 앞으로 이동시키기
				int temp = arr[i];
				arr[i] = arr[evenidx];
				arr[evenidx] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
