package day6;

public class Ex3_Ref_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human hong = new Human("홍길동", 30);
		Human kim = new Human("김철수", 20);

		int a = 10;
		int b = a;

		int num = 10;
		hong.numAdd(num);

		System.out.println(num); // 10

		// hong의 주소가 예를들어 qwer123 이다.
		// hong.age == qwer123.age 와 같다
		hong.newYear(hong); //
		// hong.age == 30+1 이 되어 31이 됩니다
		System.out.println(hong.age);

	}

}
