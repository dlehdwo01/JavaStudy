package day7;

public class Calculator_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Calculator.sum(2, 5));
		System.out.println(Calculator.sum(2, 5, 9));
		System.out.println(Calculator.sum(2.1, 5.4));
		System.out.println(Calculator.circleArea(2));

//		Human lee = new Human("이동재");
//		Human dong = new Human("이동재");
		// lee == dong이 아니다. 객체는 각자 다른 레퍼런스를 갖고있기때문이다.

		String name = "이동재";
		String name2 = new String("이동재");
		String name3 = "이동재";
		System.out.println(name == name2); // false
		System.out.println(name == name3); // true

		System.out.println(name.equals(name2)); // true
		// 문자열을 비교할땐 부등호 '=' 를 사용하면 안되며
		// 문자열을 비교할때는 꼭 name.equals(name2) 와 같이 equals 함수를 이용해야한다.

		// Calculator의 메소드 sum 앞에 static을 붙이면 객체 생성 상관없이 클래스내 메소드를 바로 사용 가능하다
		Calculator.sum(1, 3);
		Calculator.sum(2, 5, 9);
		Calculator.sum(2.1, 3.3);
	}

}
