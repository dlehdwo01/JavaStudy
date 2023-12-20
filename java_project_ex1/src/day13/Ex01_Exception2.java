package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01_Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		while (true) {
			// divisor가 0일때, 다른 타입을 입력받았을 때
			try {
				System.out.print("나눠질 숫자를 입력 : ");
				int dividend = in.nextInt();

				System.out.print("나눌 숫자를 입력 : ");
				int divisor = in.nextInt();

				System.out.println(dividend / divisor);
				break;
			} catch (Exception e) { // Exception은 모든 예외의 부모 클래스
				System.out.println("예기치 못한 문제 발생했습니다.");
				System.out.println(e.getMessage());
			}
		}
	}

}
