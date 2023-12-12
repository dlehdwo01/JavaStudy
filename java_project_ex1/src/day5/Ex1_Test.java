package day5;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Test {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			Random ran = new Random();

//		// 6번 문제 . 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
//		// 단, 0이하의 수를 입력하면 넣지 말고 다시 입력 받을 것
//
//		int array[] = new int[5];
//		int oddsum = 0;
//
//		for (int i = 0; i < array.length; i++) { // length란 배열의 크기
//			System.out.print((i + 1) + "번째 숫자를 입력해주세요 : ");
//			array[i] = in.nextInt();
//			if (array[i] <= 0) {
//				i--;
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//			}
//			if (array[i] % 2 != 0) {
//				oddsum += array[i];
//			}
//		}
////		System.out.println(Arrays.toString(array));
//		// 6번에서 정의한 배열에서 홀수들의 합 구하기
////		System.out.println("입력된 숫자들 중 홀수들의 합 : " + oddsum);
//
//		// 6번에서 정의한 배열에서 가장 큰 수와 가장 작은 수의 차이 구하기
//		int min = array[0];
//		int max = array[0];
//		for (int i = 1; i < array.length; i++) {
////			max = (max < array[i]) ? max = array[i] : max;
////			min = (min > array[i]) ? min = array[i] : min;
//
//			max = Math.max(max, array[i]); // 삼항연산자 혹은 if문으로 입력도 가능하나 Math.max를 통해서도 쉽게 구할 수 있다 . 
//			min = Math.min(min, array[i]); // 상동
//		}
//		System.out.println("입력된 숫자들 중 가장 큰 수와 작은 수의 차이 = " + (max - min));

			// 9번 문제
			int Q;
			int cnt = 0;
			for (;;) {
				System.out.print("문제 수를 입력해주세요 : ");
				Q = in.nextInt();
				for (int i = 0; i < Q; i++) {
					int A = ran.nextInt(8) + 2;
					int B = ran.nextInt(9) + 1;
					int C;
					System.out.print((i + 1) + "번 문제 " + A + " * " + B + " = ");
					C = in.nextInt();
					if (C == A * B) {
						cnt++;
						System.out.println("정답입니다!");
					} else {
						System.out.println("오답입니다! 정답은 " + (A * B) + " 입니다.");
					}
				}
				System.out.println("총 " + Q + "문제 중 " + cnt + "문제 정답");
				cnt = 0;
				System.out.println("계속 하시려면 아무키를 입력해주세요. 종료는 0을 입력해주세요");
				int end = in.nextInt();
				if (end == 0) {
					System.out.println("종료되었습니다.");
					break;
				}
			}

		}
	}
}
