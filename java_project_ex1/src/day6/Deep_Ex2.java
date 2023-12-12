package day6;

import java.util.Arrays;

public class Deep_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 25, 32, 54, 23, 16, 27, 61 };

		int oddidx = 0;
		

		// 1 홀수 개수 구하기
		int oddcnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddcnt++;
			}
		}

		// 2-4 반복
		for (int j = 0; j < oddcnt; j++) {
			// 2-1 홀수 위치값 구하기
			for (int i = j; i < arr.length; i++) {
				if (arr[i] % 2 != 0) {
					oddidx = i;
					break;
				}
			}
			// 2-2 배열내 홀수 중 가장 작은 홀수의 위치값 구하기
			for (int i = j; i < arr.length; i++) {
				if (arr[i] < arr[oddidx] && arr[i] % 2 != 0) {
					oddidx = i;
				}
			}
			// 2-3 배열내 가장 작은 홀수값을 맨 앞으로 이동시키기
			int temp = arr[j];
			arr[j] = arr[oddidx];
			arr[oddidx] = temp;
		}


		int evenidx = 0;

		//3-4 반복
		for (int j = oddcnt; j < arr.length; j++) {
			// 3-1 짝수 위치값 구하기
			for (int i = j; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					evenidx = i;
					break;
				}
			}
			// 3-2 배열내 짝수 중 가장 작은 짝수의 위치값 구하기
			for (int i = j; i < arr.length; i++) {
				if (arr[i] < arr[evenidx] && arr[i] % 2 == 0) {
					evenidx = i;
				}
			}
			// 3-3 배열내 가장 작은 짝수값을 맨 앞으로 이동시키기
			int temp = arr[j];
			arr[j] = arr[evenidx];
			arr[evenidx] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}

}
