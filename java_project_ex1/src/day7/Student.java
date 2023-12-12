package day7;

public class Student {
	int stuNo;
	String stuName;
	String stuDept;
	int age;
	String sex;

	// 생성자
	// 학번, 이름 초기화하는 생성자
	Student(int stuNo, String stuName) {
		this.stuNo = stuNo;
		this.stuName = stuName;
	}

	// 학번, 이름, 학과 초기화하는 생성자
	Student(int stuNo, String stuName, String stuDept) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}

	// 메소드
	// 나이와 성별 저장
	void setInfo(int age, String sex) {
		this.age = age;
		this.sex = sex;
	}

	// 호출시 객체의 나이 값 리턴
	int getAge() {
		return age;
	}

	// 학생 정보 출력
	void info() {
		System.out.println("학번 : " + stuNo);
		System.out.println("학과 : " + stuDept);
		System.out.println("이름 : " + stuName);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
	}

}
