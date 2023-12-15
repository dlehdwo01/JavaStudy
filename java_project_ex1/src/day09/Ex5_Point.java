package day09;

public class Ex5_Point {
	private int x, y;

	public Ex5_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Ex5_Point() {
		this.x = 0;
		this.y = 0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
