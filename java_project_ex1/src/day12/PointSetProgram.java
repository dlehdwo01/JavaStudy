package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PointSetProgram {
	Scanner in = new Scanner(System.in);
	private HashMap<String, Integer> map = new HashMap<>();

	PointSetProgram() {
	}

	public void start() {
		System.out.println("** 포인트 관리 프로그램입니다 **");
		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 포인트 입력>> ");
			String name = in.next();
			if (name.equals("그만")) {
				break;
			}
			Integer point = in.nextInt();
			if (map.get(name) != null) {
				int n = map.get(name);
				point = point + n;
			}
			map.put(name, point);
			output();
			System.out.println();
		}
	}

	void output() {

		Set<String> nameset = map.keySet();
		Iterator<String> it = nameset.iterator();
		while (it.hasNext()) {
			String name = it.next();
			int point = map.get(name);
			System.out.print("(" + name + "," + point + ")");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointSetProgram program = new PointSetProgram();
		program.start();

	}

}
