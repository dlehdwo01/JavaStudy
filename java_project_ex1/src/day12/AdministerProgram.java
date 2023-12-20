package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AdministerProgram {
	Scanner in = new Scanner(System.in);
	private HashMap<String, Double> map = new HashMap<>();
	String company;

	AdministerProgram(String company) {
		this.company = company;
	}

	void run() {
		System.out.println(company + "관리시스템입니다.");
		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점>> ");
			String name = in.next();
			Double score = in.nextDouble();
			map.put(name, score);
		}
	}

	void scholarship() {
		Set<String> nameset = map.keySet();
		Iterator<String> it = nameset.iterator();
		System.out.print("장학생 선발 학점 기준 입력>> ");
		Double standard = in.nextDouble();
		System.out.print("장학생 명단 : ");
		while (it.hasNext()) {
			String name = it.next();
			Double point = map.get(name);
			if (point >= standard) {
				System.out.print(name + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdministerProgram comp = new AdministerProgram("미래장학금관리");
		comp.run();
		comp.scholarship();

	}

}
