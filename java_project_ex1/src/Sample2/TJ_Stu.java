package Sample2;

import Sample1.Student;

public class TJ_Stu extends Student {
	// extends는 상속받겠다는 명령어_ Student 클래스를 상속받겠다는 의미

	TJ_Stu(String stuName, int stuNo, String stuDept, int age) {
		this.stuName = stuName;
		this.stuNo = stuNo;
//		this.stuDept =  stuDept; //default
//		this.age = age; //private
	}
}
