package day6;

public class Person {
	String name;
	int age;
	String addr;

	// 생성자(메소드) 를 만듦 , 생성자명은 클래스명과 동일해야한다.
	// 이름과 나이 받기
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Person(String name) {
		this.name = name;
	}

	Person() {

	}

	// 주소 받기
	void setAddr(String addr) {
		this.addr = addr;
	}

	// 이름 내보내기
	String getName() {
		return name;
	}

	// 나이 내보내기
	int getAge() {
		return age;
	}

	// 정보 내보내기
	void info() {
		System.out.println("이름은 " + name + ", 나이는 " + age + ", 주소는 " + addr + " 입니다.");
		
	}
	
	// 
}
