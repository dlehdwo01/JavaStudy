package day07;

public class Student {
	// 클래스에서는 해당 변수선언 영역을 '필드'라고 부른다. / 클래스 = 필드(변수) + 메소드
	int stuNo;
	String stuName;
	String stuDept;
	int age;
	String gender;

//	Student() {
//		this.stuName = "알 수 없음";
//	}

	// 생성자
	// 학번, 이름 초기화하는 생성자
	// this() => 생성자에서 다른 생성자 호출
	Student(int stuNo, String stuName) {
		this(stuNo, stuName, "");
		System.out.println();
	}

	// 학번, 이름, 학과 초기화하는 생성자
	Student(int stuNo, String stuName, String stuDept) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}

	Student() {

	}

	// 메소드
	// 나이와 성별 저장
	void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}

	// 호출시 객체의 나이 값 리턴
	int getAge() {
		return this.age;
	}

//	// 학생 정보 출력
//	void info() {
//		System.out.println("학번 : " + stuNo);
//		System.out.println("학과 : " + stuDept);
//		System.out.println("이름 : " + stuName);
//		System.out.println("나이 : " + age);
//		System.out.println("성별 : " + gender);
//	}
}
