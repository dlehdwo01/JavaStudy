package day12;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex04_ListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("name", "이동재");
		map1.put("java", 90);
		map1.put("oracle", 95);
		map1.put("html", 100);
		list.add(map1);

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("name", "홍길동");
		map2.put("java", 80);
		map2.put("oracle", 85);
		map2.put("html", 95);
		list.add(map2);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("이름 : " + list.get(i).get("name"));
			System.out.println("자바 점수 : " + list.get(i).get("java"));
			System.out.println("오라클 점수 : " + list.get(i).get("oracle"));
			System.out.println("html 점수 : " + list.get(i).get("html"));
			System.out.println();

		}

	}

}
