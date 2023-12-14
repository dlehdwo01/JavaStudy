package day9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = new int[N + 1];

		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}

//		int M = in.nextInt();

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// 역순 방법
//		int arr[] = { 1, 2, 3, 4, 5 };
//		int I = in.nextInt();
//		int J = in.nextInt();
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length - i; j++) {
//				int temp = arr[i];
//				arr[i] = arr[arr.length - j];
//				arr[arr.length - j] = temp;
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		// 2 1 3 4 5
		// 2 1 4 3 5
		// 3 4 1 2 5
		// 3 4 1 2 5
	}

}
