package day7;

public class Human {
	static int money; // 회비 (개인마다 갖고있는 돈이 아닌 공용의 돈)
	private String name;
	private int age;

	static void staticTest() {
		System.out.println("현재 잔액 : " + money);
//		name = "홍길동"; // 오류가 나는 이유는 static을 이용했기 때문에 객체가 없다. 
//		객체가 없기때문에 name을 사용할수없다.

	}

	Human(String name) {
		this.name = name;
	}

	// 메소드
	// 회비
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		Human.money = money;
	}

	// 이름
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 나이
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
