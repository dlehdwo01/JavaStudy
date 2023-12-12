package day4;

import java.util.Random;
import java.util.Scanner;

public class Ex2_while_UpAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
		int random = ran.nextInt(100) + 1;
		int cnt = 0;

		while (true) {
			cnt++;
			System.out.print(cnt + "번째 숫자 입력 : ");
			int input = in.nextInt();
			if (input > 100 || input < 1) {
				System.out.println("1부터 100사이의 숫자를 입력하세요.");
				cnt--;
			} else if (input == random) {
				System.out.println("정답입니다! " + cnt + "번째에 정답을 맞추셨습니다!");
				break;
			} else if (input > random) {
				System.out.println("DOWN!");
			} else {
				System.out.println("UP");
			}
		}
		in.close();
	}
}
