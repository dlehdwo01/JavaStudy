package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
	// 메소드
	// 점수입력받기
	public static int score(String str, int max) {
		Scanner in = new Scanner(System.in);
		int input;
		for (;;) {
			System.out.print(str + " 점수를 입력하세요 : ");
			input = in.nextInt();
			if (input > max || input < 0) {
				System.out.println("0~" + max + "사이의 수를 입력해주세요.");
			} else {
				break;
			}
			in.close();
		}
		return input;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		for (;;) {
			System.out.println("(1)입력부분 (2)삭제부분 (3)출력부분 (그 외)종료부분");
			int choice = in.nextInt();

			// 입력부분
			if (choice == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름을 입력하세요 : ");
				map.put("name", in.next());
				map.put("java", score("java", 30));
				map.put("oracle", score("oracle", 50));
				map.put("html", score("html", 20));
				list.add(map);
			}
			// 삭제부분
			else if (choice == 2) {
				System.out.print("이름을 입력하세요 : ");
				String delname = in.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("name").equals(delname)) {
						list.remove(i);
						System.out.println("삭제되었습니다.");
						break;
					}
				}
			}
			// 출력부분
			else if (choice == 3) {
				System.out.print("이름을 입력하세요 : ");
				String printname = in.next();
				boolean flg = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("name").equals(printname)) {
						System.out.println("이름 : " + list.get(i).get("name"));
						int javap = (int) list.get(i).get("java");
						int oraclep = (int) list.get(i).get("oracle");
						int htmlp = (int) list.get(i).get("html");
						System.out.println("총점 : " + (javap + oraclep + htmlp));
						flg = true;
					}
				}
				if (flg == false) {
					System.out.println("찾는 사람이 없습니다.");
				}
			}
			// 종료부분
			else {
				System.out.println("종료되었습니다.");
				break;
			}
			in.close();
		}
	}
}
