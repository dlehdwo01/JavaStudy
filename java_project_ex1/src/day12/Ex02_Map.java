package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex02_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// 시험 점수 관리
		map.put("홍길동", 80);
		map.put("이동재", 100);
		map.put("박승영", 90);
		map.put("유재석", 95);
		map.put("강호동", 95);

		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name + "님의 점수는 " + map.get(name) + "점 입니다.");
		}

//		Scanner in = new Scanner(System.in);
//		System.out.println("시험 점수 찾기");
//		System.out.println("exit를 입력하면 프로그램을 종료합니다");
//		for (;;) {
//			System.out.print("이름을 입력하세요 : ");
//			String name = in.nextLine();
//			if (name.equals("exit")) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//			if (map.containsKey(name)) {
//				System.out.println(name + "님의 점수는 " + map.get(name) + "점 입니다.");
//			} else {
//				System.out.println("없는 이름 입니다.");
//			}
//		}

	}

}
