package day7;

public class Calculator {
	final static double PI = 3.14;
	// final 혹은 static에서는 변수를 대문자로 기재한다. (final과 static은 대부분 한쌍처럼 움직인다.)

	static int sum(int a, int b) {
		return a + b;
	}

	static int sum(int a, int b, int c) {
		return a + b + c;
	}

	static double sum(double a, double b) {
		return a + b;
	}

	static double circleArea(int a) {
		return a * a * PI;
	}
}
