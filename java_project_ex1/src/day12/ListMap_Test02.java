package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap_Test02 {
	public static int score(String sub, int max) {
		int input;
		for (;;) {
			System.out.print(sub + " 점수를 입력하세요 : ");
			Scanner in = new Scanner(System.in);
			input = in.nextInt();
			if (input < 0 || input > max) {
				System.out.println(sub + " 점수는 0~" + max + " 사이의 숫자를 입력해주세요.");
			} else {
				break;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		// 성적 입력받기
		// 이름, 자바점수, 오라클점수, html점수
		HashMap<String, Object> map = new HashMap<String, Object>();
		System.out.print("이름을 입력하세요 : ");
		map.put("name", in.next());
		map.put("java", score("java", 50));
		map.put("oracle", score("oracle", 30));
		map.put("html", score("html", 20));
		list.add(map);

	}
}
