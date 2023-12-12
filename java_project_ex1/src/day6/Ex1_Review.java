package day6;

import java.util.Scanner;

public class Ex1_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 1번 문제
//		int arr[] = new int[5];
//
//		// 2번 문제
//		for (int i =0; i<arr.length; i++) {
//			arr[i]=i+1;
//		}
//
		// 3번 문제
//		int cnt = 0;
		Scanner in = new Scanner(System.in);
//		for (int i = 0; i < arr.length; i++) {
//			cnt = i + 1;
//			System.out.print(cnt + "번째 숫자를 입력하세요 : ");
//			int input = in.nextInt();
//			arr[i] = input;
//		}
//		cnt = 0;
//		for (int i = 0; i < arr.length; i++) {
//			cnt = i + 1;
//			System.out.println(cnt + "번째 숫자 : " + arr[i]);
//		}
//
//		// 4번 문제
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println("배열내 값의 총합 : " + sum);

		// 5번 문제
//		for (int i = 2; i <= 9; i++) {
//		System.out.println("====="+i + "단=====");
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + (i * j));
//			}
//		}

		// 6번 문제
		int arr[] = { 1, 4, 3, 5, 2 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.print("\n"); // \n 줄바꿈
		}
		System.out.println("안녕하세요. \t반갑습니다"); // \t 충분한 공백 넣기
		System.out.println("\'안녕하세요.\'"); // \" \뒤에 쌍따옴표를 붙여야 출력 가능
		System.out.println("역슬래시를 출력하기 위해서 \\"); // \\역슬래시를 두개 붙이면 출력 가능
		// 즉 \(역슬래시) 는 이스케이프문자라고 합니다.
		
		in.close();

	}

}
