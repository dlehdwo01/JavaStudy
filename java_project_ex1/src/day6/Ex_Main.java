package day6;

import java.util.Scanner;

public class Ex_Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String n=in.next();		
		System.out.print("나이를 입력하세요 : ");
		int age=in.nextInt();
		
		Person aPerson = new Person(n,age);		
		
		aPerson.addr="인천광역시";
		
		aPerson.info();
		

//		Person hong = new Person("홍길동");
//		hong.age = 30;
//		System.out.println(hong.getName());
//		System.out.println(hong.getAge());
//
//		Person kim = new Person("김철수");
//		kim.age = 20;
//		System.out.println(kim.getName());
//		System.out.println(kim.getAge());
//		
//		Person lee=new Person("이영희");
//		lee.age=25;
//		System.out.println(lee.getAge());
//		hong.info();
//		lee.info();
//		kim.info();

	}

}
