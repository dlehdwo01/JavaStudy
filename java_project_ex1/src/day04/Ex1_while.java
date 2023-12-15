package day04;

import java.util.Scanner;

public class Ex1_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int A = in.nextInt();

//		int sum = 0; // 1~A 까지의 합
//		
//		int i = 1; //for문과 달리 변수는 밖에서 생성
//		while (i <= A) { // for문에서의 조건을 괄호안에 넣기 , 괄호안의 내용이 true면 무한 반복
//			sum += i; // 
//			i++; // 무한 반복되지않게 매반복시마다 i값 +1을 함으로써 위 괄호안의 조건에서 벗어남 
//		}
//		System.out.println("1부터 " + A + "까지의 합은 " + sum + " 입니다.");

		int sum = 0;
		int i = 1;
		while (i <= A) {
			if (i % 2 == 1) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		in.close();

	}

}
