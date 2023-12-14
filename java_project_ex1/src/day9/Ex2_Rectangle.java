package day9;

public class Ex2_Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	Ex2_Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	int square() {
		return width * height;
	}

	void show() {
		System.out.println("(" + x + "," + y + ")" + "에서 크기가 " + width + "x" + height + "인 사각형");
	}

	boolean contactings(Ex2_Rectangle r) {
		return x < r.x && y < r.y && x + width > r.x + r.width && y + height > r.y + r.height;
	}

}
