package day10;

public class Ex5_Point {
	int x;
	int y;

	Ex5_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x는 " + x + " y는 " + y + "  입니다.";
	}

	public boolean equals(Object p) {
		Ex5_Point obj = (Ex5_Point) p;
		if (x == obj.x && y == obj.y) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(Ex5_Point obj) {
		if (x == obj.x && y == obj.y) {
			return true;
		} else {
			return false;
		}
	}
}
