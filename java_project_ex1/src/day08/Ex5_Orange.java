package day08;

public class Ex5_Orange extends Ex5_Fruit {
	Ex5_Orange(String kind, String color, int price) {
		super(kind, color, price); // 슈퍼클래스 내 매개변수가 동일한 생성자로 이동
	}
}
