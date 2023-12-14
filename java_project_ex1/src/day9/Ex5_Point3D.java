package day9;

public class Ex5_Point3D extends Ex5_Point {
	int z;

	public Ex5_Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public String toString() {
		return "(" + super.getX() + "," + super.getY() + "," + z + ") 의 점";
	}

	void moveUp() {
		this.z = z + 1;
	}

	void moveDown() {
		this.z = z - 1;
	}

	protected void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
}
