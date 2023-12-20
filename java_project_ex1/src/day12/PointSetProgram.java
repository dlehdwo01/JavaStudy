package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PlusTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		HashMap<String, Double> map = new HashMap<>();
		System.out.println("미래장학금관리시스템입니다.");

		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점>> ");
			String name = in.next();
			double score = in.nextDouble();
			map.put(name, score);
		}

		Set<String> nameset = map.keySet();
		Iterator<String> it = nameset.iterator();

		System.out.println("장학생 선발 학점 기준 입력>> ");
		double standard = in.nextDouble();
		System.out.print("장학생 명단 : ");

		while (it.hasNext()) {
			String name = it.next();
			if (standard <= map.get(name)) {
				System.out.print(name + " ");
			}
		}

	}

}
