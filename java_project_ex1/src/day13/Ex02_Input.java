package day13;

import java.util.Scanner;

public class Ex02_Input {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = in.nextInt();
		in.nextLine();// ★
		System.out.print("이름 : ");

//		String name = in.next(); // 공백을 만날때까지 입력 가능한 장치 
		String name = in.nextLine(); // \n을 만날때까지 입력 가능한 장치
		// 나이 : 27
		// 이름 : 키 :
		// 이름과 키가 붙어서 나오는 이유는 나이 입력시 엔터를 누름으로 인해서 버퍼엔 27\n이 남게된다
		// 나이에 27을 출력해주고나면 \n이 남기때문에 다음 입력부분인 nextLine으로 입력되게된다.
		// 그리하여 나이를 입력한 후에 nextLine 을 한번 더 입력함으로 인해서 버퍼를 비워둘 필요가 있다.
		System.out.print("키 : ");
		int height = in.nextInt();

//		String info = in.nextLine();
//		System.out.println(info);

	}
}
