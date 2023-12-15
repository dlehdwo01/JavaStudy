package day08;

public class Ex5_Fruit {
	private String kind; // 과일명
	private String color; // 색깔
	private int price; // 가격

	Ex5_Fruit(String kind, String color, int price) {
		this.kind = kind;
		this.color = color;
		this.price = price;
	}

	Ex5_Fruit() {
	}

	// 메소드

	void setFruit(String kind, String color, int price) {
		this.kind = kind;
		this.color = color;
		this.price = price;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void getPrice() {
		System.out.println(kind + "는 " + price + "원 입니다.");
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
