package day06;

public class Ex2_ObjArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int intArr[] = new int[5];
//		String strArr[] = new String[5]; // String 이나 Person이나 클래스이다.

		Person p = new Person();
		Person hong = new Person("홍길동", 30);
		Person kim = new Person("김철수");

		p.info();
		hong.info();
		kim.info();

//		Calculator_Class cal = new Calculator_Class();
//		int num = cal.sum(2, 3);
//		System.out.println(num);
//		int num2 = cal.sum(2, 3, 5);
//		System.out.println(num2);
//		// 정수 + 실수
//		double num3 = cal.sum(2, 3.5);
//		System.out.println(num3);
		Person personArr[] = new Person[5];

		for (int i = 0; i < personArr.length; i++) {
			personArr[i] = new Person();
		}
		Person aa = new Person();

		aa = hong; // 1. aa라는 객체는 hong과 같다고 가정했을때
		hong.age = 10; // 2. aa와 hong이 같아진 이후 hong만 따로 age를 변경한다.
//		personArr[1].info();
		hong.info();
		aa.info(); // 3. 하지만 aa도 age가 같이 변경된다. ( aa = hong 의 개념은 각각의 개체가 관리되고 있는것이 아닌 aa가 hong의 주소(레퍼런스)를
					// 공유받고있음을 나타낸다)
		
		

	}

}
