package day8;

public class Ex5_Apple extends Ex5_Fruit {

	Ex5_Apple(String kind, String color, int price) {
		super(kind, color, price); // 슈퍼클래스 내 매개변수가 동일한 생성자로 이동
	}

	public void getPrice() { // Fruit(슈퍼클래스)에도 getPrice가 있지만 현재 Apple(서브클래스)에서 재정의한 상태
		System.out.println("사과는 할인해서 2000원");
	}

}
