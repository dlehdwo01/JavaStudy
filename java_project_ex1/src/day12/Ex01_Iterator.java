package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class Ex01_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);

		// Iterator 정수타입 it 객체 생성 = v 객체를 기반으로 한
		Iterator<Integer> it = v.iterator();

		while (it.hasNext()) { // v 객체 index에 값이 들어있는지 물어보는 함수 / 없다면 false로 반복문 중단
			System.out.println(it.next()); //
		}

		int sum = 0;
		it = v.iterator();
		while (it.hasNext()) {
			sum += it.next();
		}
		System.out.println(sum);
		HashMap<String, String> h = new HashMap<>();
		h.put("apple", "사과");
		h.put("apple", "사과2");
		System.out.println(h.get("apple"));
	}

}
