package day8;

public class Ex4_Main {

	static void print(Ex4_Human obj) { // Human 내 모든 서브클래스들을 넣을 수 있다.
		if (obj instanceof Ex4_Student) { // 서브클래스들을 instanceof를 사용하여 분류할수있다.
			System.out.println("해당 객체는 학생입니다.");
		} else if (obj instanceof Ex4_Worker) {
			System.out.println("해당 객체는 직장인입니다.");
		} else {
			System.out.println("해당 객체는 사람입니다.");
		}
	}

//	static void print(Ex4_Student student) {
//		System.out.println("해당 객체는 학생입니다.");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex4_Human lee = new Ex4_Human();
		Ex4_Student park = new Ex4_Student();
		Ex4_Worker kim = new Ex4_Worker();

		// 서브클래스 -> 슈퍼클래스 가능
		Ex4_Human lee2 = new Ex4_Student();
		// Student 클래스를 Human 클래스에 담을 수 있다.
		// 하지만 Human의 메소드와 변수만 이용가능(study와 학번은 이용불가)
//		 Ex4_Student lee3 = new Ex4_Human(); //( 위와 같은 이유)
		Ex4_Human lee4 = new Ex4_Worker();

//		Ex4_Student lee2stu = (Ex4_Student) lee2;
		// lee2를 Student 클래스로 강제변환 시키는게 가능하다
		// 슈퍼클래스 -> 서브클래스 하는 방법

		print(lee); // human으로 받을 수 있다 // instanceof 를 사용하여 Human으로 분류할수있다
		print(park); // human으로 받을 수 있다 // instanceof 를 사용하여 Student로 분류할수있다
		print(kim); // human으로 받을 수 있다 // instanceof 를 사용하여 Worker로 분류할수있다
		print(lee2); //
		print(lee4); //
	}

}
