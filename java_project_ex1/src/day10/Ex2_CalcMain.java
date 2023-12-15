package day10;

public class Ex2_CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator cal = new Calculator(); // 추상 클래스의 객체는 생성 할 수 없다.
		Ex2_GoodCalc cal = new Ex2_GoodCalc();
		int arr[] = { 1, 2, 3, 5, 1, 6, 8 };
		System.out.println(cal.average(arr));

	}

}
