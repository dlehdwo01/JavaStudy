package day08;

public class Ex6_PointColor extends Ex6_Point {
	private String color;

	Ex6_PointColor(int x, int y, String color) {
		super(x, y);
//		super 입력시 실행됨 - 입력된 int타입의 x,y 매개체를 가지고 부모에게서 같은 매개체 타입의 생성자를 호출함
//		Point xy = new Point(x, y); // 실행안됨 - 부모에게서 기본생성자를 호출하려고함
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void showColorPoint() {
		System.out.println(color);
		showPoint();

//		System.out.println(getX() + ", " + getY() + ", " + color);
//		// x와 y 변수에는 private이라 접근이 불가하다. get 메소드를 생성하면 접근이 가능하다.
	}

}
