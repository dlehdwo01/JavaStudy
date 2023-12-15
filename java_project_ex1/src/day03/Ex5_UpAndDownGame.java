package day03;

import java.util.Random;
import java.util.Scanner;

public class Ex5_UpAndDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner in = new Scanner(System.in);
		// 1부터 100 사이의 숫자 맞추기
		int random = ran.nextInt(100) + 1; // 랜덤수 생성(1~100)
		int cnt = 0; // 횟수 카운트

		for (;;) {
			cnt++; // 매회 카운트 +1
			System.out.print(cnt + "번째 시도, 숫자를 입력해주세요. : ");
			int ans = in.nextInt();
			if (ans == random) {
				System.out.println("정답입니다! " + cnt + "번째에 맞추셨습니다.");
				break;
			} else if (ans > random) {
				System.out.println("DOWN!");
			} else {
				System.out.println("UP!");
			}
			in.close();
		}

	}
}
