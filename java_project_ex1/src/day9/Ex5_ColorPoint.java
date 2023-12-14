package day9;

public class Ex5_ColorPoint extends Ex5_Point {
	private String color = "BLACK";

	Ex5_ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	Ex5_ColorPoint(int x, int y) {
		super(x, y);
	}

	Ex5_ColorPoint() {
		super();
	}

	void setXY(int x, int y) {
		super.move(x, y);
	}

	void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		// public이 들어가야 하는 이유 = object의 메소드로 있지만 해당 ColorPoint 클래스에서 오버라이딩 진행
		return color + "색의 (" + super.getX() + "," + super.getY() + ")의 점";
	}
}
