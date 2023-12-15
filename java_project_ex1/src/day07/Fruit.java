package day07;

public class Fruit {
	private String name;
	private String color;
	private int price;

	Fruit(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	// set, get 메소드 (private이기때문에 메소드를 이용해야함)
	// 공백 우클릭 source 눌러서 Generate getters and setters 누르면 자동 입력됨
	// 가격
	void setPrice(int price) {
		if (price <= 0) {
			System.out.println("올바르지 않은 값입니다.");
		} else {
			this.price = price;
		}
	}

	int getPrice() {
		return this.price;
	}

	// 이름
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 색깔
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
