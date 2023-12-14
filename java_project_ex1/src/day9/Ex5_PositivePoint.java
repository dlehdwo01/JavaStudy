package day9;

public class Ex5_PositivePoint extends Ex5_Point {
	int positiveX;
	int positiveY;

	Ex5_PositivePoint(int x, int y) {
		super(x, y);
		if (x < 0 || y < 0) {
			super.move(0, 0);
		}
	}

	Ex5_PositivePoint() {
	}

	protected void move(int x, int y) {
		if (x > 0 && y > 0) {
			super.move(x, y);
		}
	}

	public String toString() {
		return "(" + super.getX() + "," + super.getY() + ") 의 점";
	}

}
