package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex04_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {

			System.out.println("==== (1)추가  (2)판매  (3)보유과일정보  (4)가격수정  (그외)종료 ====");
			int choice = in.nextInt();

			// 1번 추가ㅁㅁㅁㅁ
			if (choice == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일명을 입력해주세요 : ");
				String name = in.next();
				boolean flg = false;
				// 기존 과일 입력시
				for (int i = 0; i < list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if (fruitName.equals(name)) {
						System.out.print("추가할 수량을 입력해주세요 : ");
						int number = in.nextInt();
						int sum = number + (int) list.get(i).get("number");
						list.get(i).put("number", sum);
						flg = true;
						break;
					}
				}
				// 신규 과일 추가시
				if (flg == false) {
					System.out.print("가격을 입력해주세요 : ");
					int price = in.nextInt();
					System.out.print("수량을 입력해주세요 : ");
					int number = in.nextInt();
					map.put("name", name);
					map.put("price", price);
					map.put("number", number);
					list.add(map);
				}
				System.out.println("정상적으로 입력되었습니다.");
			} // 1번 종료

			// 2번 판매
			else if (choice == 2) {
				System.out.print("과일명을 입력하세요 : ");
				String name = in.next();
				boolean flg = false;
				for (int i = 0; i < list.size(); i++) {

					if (list.get(i).get("name").equals(name)) {
						System.out.print("판매하실 수량을 입력하세요 : ");
						int number = in.nextInt();
						int sum = 0;
						if ((int) list.get(i).get("number") >= number) {
							sum = (int) list.get(i).get("number") - number;
							list.get(i).put("number", sum);
							System.out.println(name + "가 " + number + "개 판매되었습니다. 금액은 "
									+ (int) list.get(i).get("price") * number + "원 입니다.");
							System.out.println("남은 " + name + "의 개수는 " + sum + "개 입니다.");
							flg = true;
							break;
						} else {
							System.out.println("판매하실 수량보다 남아있는 개수(" + ((int) list.get(i).get("number")) + ")가 적습니다.");
						}
					}
				}
				if (flg == false) {
					System.out.println("찾는 과일이 없습니다.");
				}
			} // 2번 종료

			// 3번 개수확인
			else if (choice == 3) {
				boolean flg = false;
				System.out.print("과일명을 입력하세요 : ");
				String name = in.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("name").equals(name)) {
						System.out.println(name + "의 수량은 " + list.get(i).get("number") + "개 입니다.");
						System.out.println(name + "의 가격은 " + list.get(i).get("price") + "원 입니다.");
						flg = true;
						break;
					}
				}
				if (flg == false) {
					System.out.println("찾는 과일이 없습니다.");
				}
			} // 3번 종료
				// 4번 과일 가격 변경
			else if (choice == 4) {
				System.out.print("과일명을 입력하세요 : ");
				String name = in.next();
				boolean flg = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("name").equals(name)) {
						System.out.print("가격을 입력해주세요 : ");
						int price = in.nextInt();
						list.get(i).put("price", price);
						System.out.print("변경이 완료되었습니다.");
						flg = true;
						break;
					}
				}
				if (flg == false) {
					System.out.println("찾는 과일이 없습니다.");
				}
			} else {
				System.out.println("종료되었습니다...");
				break;
			} // 4번 종료
			System.out.println();
		} // while 종료
	}
}
