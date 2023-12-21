package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class NationGame {
	private Vector<Nation> v;
	private HashMap<String, String> map;
	private ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
	Scanner in = new Scanner(System.in);
	Random ran = new Random();

	NationGame() {
		v = new Vector<Nation>();
		v.add(new Nation("멕시코", "멕시코시티"));
		v.add(new Nation("스페인", "마드리드"));
		v.add(new Nation("프랑스", "파리"));
		v.add(new Nation("영국", "런던"));
		v.add(new Nation("그리스", "아테네"));
		v.add(new Nation("독일", "베를린"));
		v.add(new Nation("일본", "동경"));
		v.add(new Nation("중국", "베이징"));
		v.add(new Nation("러시아", "모스크바")); // 9개
		for (int i = 0; i < v.size(); i++) {
			map = new HashMap<>();
			map.put("Country", v.get(i).getCountry());
			map.put("Capital", v.get(i).getCapital());
			list.add(map);
		}

	}

	void VectorRun() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while (true) {
			System.out.print("입력:1  퀴즈:2  종료:그외  >>");
			int choice = in.nextInt();
			if (choice == 1) {
				System.out.println("현재 " + v.size() + "개 나라와 수도가 입력되어 있습니다.");
				System.out.print("나라와 수도 입력" + (v.size() + 1) + ">>");
				String nation = in.next();
				String capital = in.next();
				if (nation.equals("그만")) {
					break;
				}
				v.add(new Nation(nation, capital));
			} else if (choice == 2) {
				while (true) {
					int random = ran.nextInt(v.size());
					System.out.print(v.get(random).getCountry() + "의 수도는?");
					String answer = in.next();
					if (answer.equals("그만")) {
						break;
					} else if (answer.equals(v.get(random).getCapital())) {
						System.out.println("정답!!");
					} else {
						System.out.println("아닙니다!!");
					}
				}
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

//	void HashMapRun() {
//		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
//		System.out.print("입력:1  퀴즈:2  종료:3>>");
//
//		int select = in.nextInt();
//		System.out.println("현재 " + list.size() + "개 나라와 수도가 입력되어 있습니다.");
//		// 1.입력
//		while (true) {
//			if (select == 1) {
//				while (true) {
//					System.out.print("나라와 수도 입력" + (list.size() + 1) + ">> ");
//					String country = in.next();
//					String capital = in.next();
//					if (country.equals("그만")) {
//						break;
//					}
//
//					else {
//						map = new HashMap<>();
//						map.put("country", country);
//						map.put("capital", capital);
//						list.add(map);
//					}
//				} // 1번
//				System.out.print("입력:1  퀴즈:2  종료:3>>");
//			}
//
//			// 2번
//			else if (select == 2) {
//				System.out.println(list.get(list.size() - 1));
//			}
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NationGame game = new NationGame();
		game.VectorRun();
//		game.HashMapRun();

	}

}
