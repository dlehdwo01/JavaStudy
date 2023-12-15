package day10;

public class Ex5_Rect {
	int width;
	int height;

	Ex5_Rect(int w, int h) {
		this.width = w;
		this.height = h;
	}

	// 받는 타입이 Rect 일때
	public boolean equals(Ex5_Rect obj) {
		if (this.width * this.height == obj.width * obj.height) {
			return true;
		} else {
			return false;
		}
	}

	// 받는 타입이 Object 일때 오버라이딩
	public boolean equals(Object obj) {
		Ex5_Rect r = (Ex5_Rect) obj; // obj(슈퍼클래스)객체 를 Rect(서브클래스) 클래스로 강제 변환
		if (this.width * this.height == r.width * r.height) {
			return true;
		} else {
			return false;
		}
	}
}
