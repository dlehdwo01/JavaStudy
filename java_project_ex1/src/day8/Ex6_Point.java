package day8;

public class Ex6_Point {
	private int x;
	private int y;

	Ex6_Point(int x, int y) {
		this.x = x;
		this.x = y;
	}

//	Point() {
//
//	}

	void showPoint() {
		System.out.println(x + ", " + y);
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
