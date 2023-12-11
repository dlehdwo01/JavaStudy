package day2;

import java.util.Scanner;

public class Ex6_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요 : ");
//		int num1 = s.nextInt();

		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("정말 잘했다");
			break;
		case 'B':
			System.out.println("꽤 잘했다");
			break;
		case 'C':
			System.out.println("조금만 노력하자");
			break;
		case 'D':
			System.out.println("많이 노력하자");
			break;
		default:
			System.out.println("화이팅");
			break;
		}
	}
}
