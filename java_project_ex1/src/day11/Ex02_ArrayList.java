package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		// ArrayList에 이름 4개 입력받기
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			list.add(name);
		}
		sc.close();

		// 입력받은 4개의 이름 출력하기
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		// 입력받은 이름 중 가장 긴 이름 출력하기
		int maxidx = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(maxidx).length() < list.get(i).length()) {
				maxidx = i;
			}
		}
		System.out.println("가장 긴 이름은 : " + list.get(maxidx));

	}
}
