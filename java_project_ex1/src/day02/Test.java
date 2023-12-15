package day02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();

		// 입력받은 수의 구구단을 출력 할 것
//		for (int x = 1; x <= 9; x++) {
//			System.out.println(i + " * " + x + " = " + (i * x));
//		}

		// 1부터 내가 입력한 숫자까지 화면에 출력
//		for (int a = 1; a <= i; a++) {
//			System.out.println(a);
//		}

		// 1부터 30까지의 숫자 중 내가 입력한 숫자의 배수만 출력
//		for (int a = 1; a <= 30; a++) {
//			if (a % i == 0) {
//				System.out.println(a);
//			}
//		}

		// 1부터 내가 입력한 숫자까지의 합
		int sum = 0;
		for (int a = 1; a <= i; a++) {
			sum += a;
		}
		System.out.println(sum);

		// 1번 문제
//		if(i%5==0) {
//			System.out.println("5의 배수");			
//		} else {
//			System.out.println("5의 배수 아님");
//		}

		// 2번 문제
//		if(i%3==0 ||i%7==0) {
//			System.out.println("정답");
//			
//		} else {
//			System.out.println("오답");
//		}

		// 3번 문제
//		for(int i=1; i<=30; i++) {
//			if(i%3==0||i%7==0) {
//				System.out.println(i);				
//			}			
//		}

		// 4번 문제
//		int sum1=0; //짝수
//		int sum2=0; //홀수
//		for(int a=1; a<=30; a++) {
//			if(a%2==0) {
//				sum1+=a; //짝수의 합				
//			} else {
//				sum2+=a; //홀수의 합
//			}			
//		} System.out.println(sum2-sum1); // 홀수-짝수 / 절댓값을 적용시켜야함

		// 5번 문제
//		for(int i=30; i>=1; i--) {
//			if(i%5!=0) {
//				System.out.println(i);
//			}			
//		}
		in.close();
	}

}
