package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap_Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		Scanner in = new Scanner(System.in);

		for (;;) {
			System.out.println("== (1)입력 (2)검색 (3)종료 ==");
			System.out.print("메뉴를 입력하세요 : ");
			int num = in.nextInt();
			if (num == 1) {
				System.out.print("이름을 입력하세요 : ");
				String name = in.next();
				System.out.print("나이를 입력하세요 : ");
				int age = in.nextInt();
				System.out.print("주소를 입력하세요 : ");
				String addr = in.next();
				System.out.print("핸드폰번호를 입력하세요 : ");
				String phone = in.next();

				HashMap<String, Object> map = new HashMap<>();

				map.put("name", name);
				map.put("age", age);
				map.put("addr", addr);
				map.put("phone", phone);
				list.add(map);
				System.out.println("저장되었습니다!");

			} else if (num == 2) {
				System.out.print("검색할 이름을 입력하세요 : ");
				String search = in.next();
				boolean flg = false;

				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).get("name").equals(search)) {
						System.out.println();
						System.out.println("이름 : " + list.get(j).get("name"));
						System.out.println("나이 : " + list.get(j).get("age"));
						System.out.println("주소 : " + list.get(j).get("addr"));
						System.out.println("핸드폰번호 : " + list.get(j).get("phone"));
						System.out.println();
						flg = true;
						break;
					}
				}
				
				if (flg == false) {
					System.out.println("찾는 사람이 없습니다.");
					System.out.println();
				}
				
			} else if (num == 3) {
				System.out.println("종료되었습니다!");
				break;
				
			} else {
				System.out.println("1,2,3번 중에 하나를 입력해주세요.");
				System.out.println();
			}
		}
	}
}
