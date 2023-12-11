package day2;

public class Ex2_if_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;

		// 조건문 ()조건 내 true 혹은 false만 들어 갈수있으며 true시에만 {}내에 입력어들이 실행됨
//		if (age > 10) {
//			System.out.println("나이는 10보다 크다");
//			if (age > 20) {
//				System.out.println("나이는 20보다 크다");
//			}
//		}

		// age 가 25보다 크면 "25보다 크다";
//		if (age > 25) {
//			System.out.println("25보다 크다"); // 참일때 실행
//		} else {
//			System.out.println("26보다 작다"); // 거짓일때 실행
//		}

		int num1 = 13;
		// num1 홀수면 " 홀수입니다 " 출력
		// num1 짝수면 " 짝수입니다 " 출력
		// %는 나머지 구하는 산식

		if (num1 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

	}
}
