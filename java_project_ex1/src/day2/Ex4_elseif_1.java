package day2;

import java.util.Scanner;

public class Ex4_elseif_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int score = s.nextInt();

		// 조건문 => else if
		if (score >= 90) {
			System.out.println("A등급 입니다.");
		} else if (score >= 80) {
			System.out.println("B등급 입니다.");
		} else if (score >= 70) {
			System.out.println("C등급 입니다.");
		} else if (score >= 60) {
			System.out.println("D등급 입니다.");
		} else {
			System.out.println("F등급 입니다.");
		}
		
	}

}
