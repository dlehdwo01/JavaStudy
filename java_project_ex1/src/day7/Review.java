package day7;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hong 객체생성 (Student)
		Student hong = new Student(1234, "홍길동");

		// yu 객체 생성 (Student)
		Student yu = new Student(1357, "유재석", "컴퓨터학과");

		// hong 객체 나이, 성별 입력
		hong.setInfo(20, "남자");
		// hong 객체 나이 출력
		System.out.println(hong.getAge());

	}

}
