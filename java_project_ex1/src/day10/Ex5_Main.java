package day10;

public class Ex5_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex5_Point p1 = new Ex5_Point(1, 2);
		Ex5_Point p2 = new Ex5_Point(3, 4);
		Ex5_Point p3 = new Ex5_Point(3, 4);
		System.out.println("p1=> " + p1);
		System.out.println("p2=> " + p2);
		System.out.println("p2와 p1의 값은 같은가=> " + p2.equals(p1));
		System.out.println("p2와 p3의 값은 같은가=> " + p2.equals(p3));
		String name = "홍길동";

//		// 객체이름만 호출하면 자동으로 toString으로 호출하게된다. toString을 오버라이딩하여 주로 사용됨.
//		System.out.println("p1.getClass()=> " + p1.getClass());
//		System.out.println("p1.toString()=> " + p1.toString());

		Ex5_Rect r1 = new Ex5_Rect(3, 4);
		Ex5_Rect r2 = new Ex5_Rect(4, 3);
		System.out.println(r1.equals(r2));
		String age = "13123";
		int age2 = Integer.parseInt(age);
//		 Integer.parseInt() 를 통해 숫자로 이루어진 문자열을 숫자로 바꿀 수 있다. 단, 문자가 들어가면 오류; 숫자만 가능
		System.out.println(age2);

	}

}
