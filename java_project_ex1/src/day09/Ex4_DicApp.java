package day09;

import java.util.Scanner;

public class Ex4_DicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("한영 단어 검색 프로그램입니다.");

		try (Scanner in = new Scanner(System.in)) {
			for (;;) {
				System.out.print("한글단어?");
				String korean = in.next();
				if (korean.equals("그만")) {
					System.out.println("종료되었습니다.");
					break;
				}
				Ex4_Dictionary.kor2Eng(korean);
			}
			in.close();
		}
	}
}
