package day12;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex03_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList
//		ArrayList<String> list = new ArrayList<String>();
//
//		list.add("홍길동");
//		list.add("유재석");
//		list.add("강호동");
//		list.add("박명수");
//		list.add("기안84");
//
//		String name = list.get(0); // 홍길동
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i)); // idx값을 넣는다
//		}

		HashMap<String, Integer> dbScore = new HashMap<>();
		dbScore.put("홍길동", 90);
		dbScore.put("유재석", 95);
		dbScore.put("강호동", 85);
		dbScore.put("박명수", 80);
		dbScore.put("기안84", 84);

		System.out.println(dbScore.get("홍길동")); // key값을 넣는다

	}
}
