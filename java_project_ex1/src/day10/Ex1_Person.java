package day10;

public class Ex1_Person {
	private String name;
//	private int age;
//	private String addr;

	Ex1_Person() {
	}

	Ex1_Person(String name, int age) {
		this(name, age, "알 수 없음");
	}

	Ex1_Person(String name, int age, String addr) {
		this.name = name;
//		this.age = age;
//		this.addr = addr;
	}

	public String getName() {
		return name;
	}
}
