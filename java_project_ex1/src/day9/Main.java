package day9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int cnt = 1;

		// 1번째 줄 = 별 1개
		// 2번째 줄 = 별 3개
		// 3번째 줄 = 별 5개
		// 4번째 줄 = 별 7개
		// 5번째 줄 = 별 9개
		// 1번째 줄 = 별 7개 5 +2
		// 2번째 줄 = 별 5개 5
		// 3번째 줄 = 별 3개 5 -2
		// 4번째 줄 = 별 1개 5 -2 -2
		for (int i = 1; i <= N + N - 1; i++) {
			if (i <= N) {
				for (int k = N - 1; k >= i; k--) {
					System.out.print(" ");
				}
				for (int j = 0; j < i + (i - 1); j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int k = i - N; k <= N; k++) {
					System.out.println(" ");
				}
				for (int j = 7; j >= i - N; j--) {
					System.out.print("*");
				}System.out.println();
			}
		}

	}
}
