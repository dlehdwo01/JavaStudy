package day13;

import java.util.Random;

public class Ex03_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		while (true) {
//			try {
//				System.out.print("나이 입력 : ");
//				int age = in.nextInt();
//				break;
//			} catch (InputMismatchException e) {
//				System.out.println("숫자를 입력하세요!");
//				in.nextLine();
//			} finally {
//				System.out.println("finally!!");
//			}
//		}

		Random ran = new Random();
		
		int ex1 = ran.nextInt(4) + 1;
		
		System.out.println();
	}

}
