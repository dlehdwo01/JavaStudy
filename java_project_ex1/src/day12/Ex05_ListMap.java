package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex05_ListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

		// 회원가입 map 생성
		HashMap<String, Object> map = new HashMap<String, Object>();

		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("addr", "인천");
		map.put("phone", "010-1234-5678");
		map.put("gender", "남자");
		list.add(map);

		HashMap<String, Object> map2 = new HashMap<String, Object>();

		map2.put("name", "이동재");
		map2.put("age", 27);
		map2.put("addr", "인천");
		map2.put("phone", "010-1234-5678");
		map2.put("gender", "남자");
		list.add(map2);

		Scanner in = new Scanner(System.in);
		System.out.println("사람 찾기 프로그램");
//		System.out.println("1번 입력부분, 2번 삭제부분, 3번 출력부분, 이 외 값 종료");

		for (;;) {
			System.out.print("이름을 입력하세요 : ");
			String name = in.nextLine();
			boolean na = false;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).get("name").equals(name)) {
					System.out.println();
					System.out.println("이름 : " + list.get(i).get("name"));
					System.out.println("나이 : " + list.get(i).get("age"));
					System.out.println("주소 : " + list.get(i).get("addr"));
					System.out.println("번호 : " + list.get(i).get("phone"));
					System.out.println();
					na = true;
					break;
				}
			}
			if (na == false) {
				System.out.println("입력하신 이름은 없습니다.");
				System.out.println();
			}

		}

	}

}
