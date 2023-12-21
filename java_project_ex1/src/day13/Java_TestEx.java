package day13;

import java.util.Random;
import java.util.Scanner;

public class Java_TestEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// 1. 클래스란 객체를 만들기 위한 틀이며 객체란 메소드와 변수를 가지고 있으며 고유한 존재이다.
//
//		// 2. 숫자 1개 입력받고 구구단 출력하기
//		Scanner in = new Scanner(System.in);
//		Random ran = new Random();
//		System.out.print("출력하고 싶은 구구단의 숫자를 입력하세요 : ");
//		int num;
//		while (true) {
//			num = in.nextInt();
//			if (num >= 2 && num <= 9) {
//				System.out.println("=== " + num + "단 ===");
//				for (int i = 1; i <= 9; i++) {
//					System.out.println(num + " * " + i + " = " + (num * i));
//				}
//				break;
//			} else {
//				System.out.println("2와 9 사이의 숫자를 입력해주세요.");
//			}
//		}
//
//		// 3.5개의 정수를 가지는 배열을 생성하고 1~10의 값을 입력받아 집어넣기, 이외의 숫자 혹은 중복되는 숫자가 있을 경우 재입력
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력해주세요 : ");
			int input = in.nextInt();
			if (1 <= input && input <= 10) {
				arr[i] = input;
				for (int j = 0; j < i; j++) {
					if (input == arr[j]) {
						System.out.println(input + "은 이미 입력된 숫자입니다.");
						i--;
						break;
					}
				}
			} else {
				System.out.println("1~10의 값을 입력해주세요.");
				i--;
			}
		}
//
//		// 4.랜덤 구구단을 5번 출력, 정답 입력시 정답&오답 여부 및 점수 출력
//		Scanner in = new Scanner(System.in);
//		Random ran = new Random();
//		int cnt = 0;
//
//		for (int i = 0; i < 5; i++) {
//			int A = ran.nextInt(8) + 2;
//			int B = ran.nextInt(9) + 1;
//			System.out.print(A + " * " + B + " = ");
//			int ans = in.nextInt();
//			if (ans == (A * B)) {
//				System.out.println("정답입니다.");
//				cnt++;
//			} else {
//				System.out.println("오답입니다. 정답은 " + (A * B) + "입니다.");
//			}
//		}
//		System.out.println("=====================");
//		System.out.println("총 " + (cnt * 20) + "점 입니다.");

	}

}
