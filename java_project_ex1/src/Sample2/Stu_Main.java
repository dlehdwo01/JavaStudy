package Sample2;

import Sample1.Student;

public class Stu_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();		
		s.stuName = "홍길동";
//		s.stuNo = 123;
//		s.stuDept = "컴퓨터";
//		s.age = 20;
		s.setAge(20);
		System.out.println(s.getAge());
//		System.out.println(s.age);

	}

}
