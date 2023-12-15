package day10;

public abstract class Ex2_Calculator {
	// 추상 클래스는 abstract가 붙으며 메소드들이 선언만 되고 구현되면 안됨
	// 선언된 메소드들은 무조건 서브클래스에서 구현되야만함
	// class가 아닌 interface 선언시 메소드들에 abstract 생략 가능
	// interface는 상속시 extends가 아닌 implements를 사용해야함
	// interface는 public만 허용됨. public static final은 생략 가능
	// interface는 추상형 메소드만 이용됨, 상황에 따라서 기본 메소드도 사용됨
	// 기본 메소드는 앞에 접근지시자를 입력해주어야함

	abstract int add(int x, int y);

	abstract int subtract(int x, int y);

	abstract double average(int[] arr);
}
