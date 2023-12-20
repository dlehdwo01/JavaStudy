package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01_Exception1 {

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
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력 가능합니다.");
				in.nextLine();
			} finally {
				System.out.println("finally는 무조건 실행");
			}
		}
	}

}
