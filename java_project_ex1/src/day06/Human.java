package day06;

public class Human {
	String name;
	int age;
	String phone;
	String bloodType;

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void numAdd(int i) {
		i++;
	}

	void newYear(Human human) {
		// human == qwer123 의 주소가 넘어왔다
		// human.age == qwer123 이 된다
		human.age++;
	}

}
