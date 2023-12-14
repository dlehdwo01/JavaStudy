package day9;

public class Ex2_Rectangle_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2_Rectangle r = new Ex2_Rectangle(2, 2, 8, 7);
		Ex2_Rectangle s = new Ex2_Rectangle(5, 5, 6, 6);
		Ex2_Rectangle t = new Ex2_Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if (t.contactings(r))
			System.out.println("t는 r을 포함합니다.");

		if (t.contactings(s))
			System.out.println("t는 s를 포함합니다.");

	}

}
