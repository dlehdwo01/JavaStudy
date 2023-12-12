package day7;

public class Human_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human lee = new Human("이동재");
		Human park = new Human("박승영");
		Human kim = new Human("김동휘");
		Human hwang = new Human("황선영");
//		Human won = new Human("원희수");

		lee.setMoney(300000);
		System.out.println(park.getMoney()); // 300,000 결과가 나온다. money를 static으로 선언하였기 때문에.
		kim.setMoney(300000 - 50000);
		System.out.println(hwang.getMoney()); // 250,000 결과가 나온다. 객체들이 모두 money라는 변수의 값을 공유함.

		lee.setAge(30);
		System.out.println(park.getAge()); // lee의 age는 static이 아니기때문에 park의 age가 출력된다

		Human.money = 100000; // static을 선언한 변수는 객체를 만들지 않고도 불러 올 수 있다.
		Human.staticTest(); // static을 선언한 메소드도 객체없이 클래스.메소드 가능

	}

}
