package day3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = new int[N];
		int M = in.nextInt();

		for (int i = 0; i < M; i++) {
			int I = in.nextInt();
			int J = in.nextInt();
			int K = in.nextInt();

			for (int j = I - 1; j < J; j++) {
				arr[j] = K;
			}
		}
		for (int k = 0; k < N; k++) {
			System.out.println(arr[k] + " ");
		}
	}
}
