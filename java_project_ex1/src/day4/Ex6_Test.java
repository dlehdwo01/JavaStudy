package day4;

import java.util.Random;
import java.util.Scanner;

public class Ex6_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random ran = new Random();

		// 1번 문제
//		for (int i = 10; i <= 50; i++) {
//			if (i % 3 == 0 && i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

		// 2번 문제
//		System.out.print("숫자를 입력하세요 : ");
//		int input1 = in.nextInt();
//		System.out.print("숫자를 입력하세요 : ");
//		int input2 = in.nextInt();
//		if (input1 + input2 > 10) {
//			System.out.println("큰 수");
//		} else {
//			System.out.println("작은 수");
//		}

		// 3번 문제
//		System.out.print("숫자를 입력하세요 : ");
//		int input1 = in.nextInt();
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(input1 + " * " + i + " = " + (input1 * i));
//		}

		// 4번 문제
//		int random = ran.nextInt(100) + 1;
//		for (;;) {
//			System.out.print("숫자를 입력하세요 : ");
//			int input = in.nextInt();
//			if (input > random) {
//				System.out.println("입력한 수가 더 큽니다.");
//			} else {
//				System.out.println("입력한 수가 더 작습니다.");
//			}
//		}

		// 5번 문제
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + (i * j));
//			}
//		}

		// 6번 문제
		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			array[i] = in.nextInt();
			if (array[i] <= 0) {
				System.out.println("0보다 큰 수를 입력하세요.");
				if (i < 0) {
					i++;
				}
				i--;
			}
		}

		// 7번 문제
//		int array[] = new int[5];
//		int oddsum = 0;
//		for (int i = 0; i < array.length; i++) {
//			System.out.print("숫자를 입력하세요 : ");
//			array[i] = in.nextInt();
//			if (array[i] <= 0) {
//				System.out.println("0보다 큰 수를 입력하세요.");
//				if (i < 0) {
//					i++;
//				}
//				i--;
//			} else {
//				oddsum = (array[i] % 2 != 0) ? oddsum += array[i] : oddsum;
//			}
//		}
//		System.out.println("입력된 수들 중 홀수들의 합 : " + oddsum);

		// 8번 문제
//		int array[] = new int[5];
//		for (int i = 0; i < array.length; i++) {
//			System.out.print("숫자를 입력하세요 : ");
//			array[i] = in.nextInt();
//			if (array[i] <= 0) {
//				System.out.println("0보다 큰 수를 입력하세요.");
//				if (i < 0) {
//					i++;
//				}
//				i--;
//			}
//		}
//		int max = array[0];
//		int min = array[0];
//		for (int i = 1; i < array.length; i++) {
//			max = (array[i] > max) ? max = array[i] : max;
//			min = (array[i] < min) ? min = array[i] : min;
//		}
//		System.out.println("입력된 가장 큰 수와 가장 작은 수의 차이 : " + (max - min));

		// 9번 문제
//		int end;
//		int cnt = 0; // 정답 카운트
//		for (;;) {
//			System.out.print("문제수를 입력해주세요 : ");
//			int Q = in.nextInt(); // 문제수
//			for (int i = 0; i < Q; i++) {
//				int A = ran.nextInt(8) + 2; // 구구단 앞자리(2~9) 랜덤생성
//				int B = ran.nextInt(9) + 1; // 구구단 뒷자리(1~9) 랜덤생성
//				System.out.print(A + " * " + B + " = ");
//				int C = in.nextInt(); // 정답입력
//				if (C == A * B) {
//					System.out.println("정답.");
//					cnt++;
//				} else {
//					System.out.println("오답. 정답은 " + (A * B) + " 입니다.");
//				}
//			}
//			System.out.println("총 " + Q + "문제 중 " + cnt + "개 정답!");
//			System.out.println("계속 하시려면 아무키를 입력해주세요. 종료는 0을 입력해주세요.");
//			cnt=0; // 정답 초기화
//			end = in.nextInt();
//			if (end == 0) {	
//				System.out.println("종료되었습니다.");
//				break;
//			}
//		}
	}

}
