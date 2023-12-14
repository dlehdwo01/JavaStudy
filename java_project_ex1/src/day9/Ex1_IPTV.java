package day9;

public class Ex1_IPTV extends Ex1_ColorTV {
	private String addr;

	Ex1_IPTV(String addr, int size, int color) {
		super(size, color);
		this.addr = addr;
	}

	void printProperty() {
		System.out.println("나의 IPTV는 " + addr + " 주소의 " + super.getSize() + "인치 " + super.getColor() + "컬러");
	}
}
