package day3;

import java.util.Scanner;

public class Ex4_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = in.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = in.nextInt();

		// 두개의 숫자 중 큰 수는 oo 입니다.

//		if (num1 > num2) {
//			System.out.println("두 개의 숫자 중 큰 수는 " + num1 + " 입니다.");
//		} else {
//			System.out.println("두 개의 숫자 중 큰 수는 " + num2 + " 입니다.");
//		}

		// 1. 삼항연산자
		int max2 = (num1 >= num2) ? num1 : num2;		
		// 아래 식을 삼항연산자를 이용하여 위 식처럼 간략하게 코딩 할 수 있다		
//		if (num1 >= num2) {
//			max2 = num1;
//		} else {
//			max2 = num2;
//		}
		
		//삼항연산자 예시
		System.out.print("숫자를 입력하세요 : ");
		int a = in.nextInt();
		System.out.print("숫자를 입력하세요 : ");
		int b = in.nextInt();
		int max = 0;
		int min = 0;
		max = (a > b) ? a : b;
		min = (a < b) ? a : b;
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		

		// 2. 메소드(함수)를 이용
//		int max = Math.max(num1, num2);
//		System.out.println("두 개의 숫자 중 큰 수는 " + max2 + " 입니다.");
	}
}
