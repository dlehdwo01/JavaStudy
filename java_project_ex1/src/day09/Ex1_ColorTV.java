package day09;

public class Ex1_ColorTV extends Ex1_TV {
	private int color;

	Ex1_ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	int getColor() {
		return color;
	}

	void printProperty() {
		System.out.println(super.getSize() + "인치 " + color + "컬러");

	}
}
