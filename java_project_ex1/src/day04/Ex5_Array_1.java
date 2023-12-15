package day04;

//import java.util.Arrays;
import java.util.Scanner;

public class Ex5_Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// for문 연습(1) - Array 관련 X
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + " * " + j + " = " + (i*j));				
//			}
//		}		

//		int a[] = new int[10]; // a라는 변수에 10이라는 정수를 넣을 공간을 만듦
//		a[0] = 10; // 현재 해당 상태 - [10, 0, 0, 0, 0, 0, 0, 0, 0, 0]
//		a[3] = 30; // 현재 해당 상태 - [10, 0, 0, 30, 0, 0, 0, 0, 0, 0] // a[@] 에 들어가는 숫자는 배열 순번을 뜻함
//		a[9] = 1; // 현재 해당 상태 - [10, 0, 0, 30, 0, 0, 0, 0, 0, 1]
//		System.out.println(a[3]); // 출력시 30 출력됨

//		int b[] = { 1, 2, 3, 4, 5, 6, 7 }; // b[0] = 1 , b[1] = 2 , b[3] = 3
//		System.out.println(b.length);
//
//		for (int i = 0; i < b.length; i++) { // length는 배열의 크기를 정수로 나타냄
//			System.out.println(b[i]); // 배열 내 순차적인 출력을 위해서는 반복문을 이용합니다.
//		}
//
//		int c[] = new int[5]; //배열에 반복되는 수 넣기 
//		for (int i = 0; i < c.length; i++) {
//			c[i] = i + 1; // c[0] = 1 , c[1] = 2, c[2] = 3 ...;
//		}

		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력해주세요 : ");
			int input = in.nextInt();
			a[i] = input;
			System.out.println((i + 1) + "번째 수 : " + a[i]);
		}
//		System.out.println(Arrays.toString(a)); // 배열에 입력된 숫자를 확인하기 위하여 출력하는 방법1
		System.out.println();
		int sum = 0; // 배열에 있는 정수의 모든 합을 구하기 위한 변수
		for (int i = 0; i < a.length; i++) {
			System.out.println("입력된 " + (i + 1) + "번째 수 : " + a[i]); // 배열에 입력된 숫자를 확인하기 위하여 출력하는 방법2 - for문
			sum += a[i]; // 배열에 있는 정수의 모든 합 구하기
		}
		System.out.println();
		System.out.println("배열에 입력된 값의 평균은 " + ((double) sum / a.length));

		int max = a[0]; // 최대값 변수 생성. 배열에 있는 수 중 아무거나 넣기. 단, 숫자가 들어가면 안될 것. 이유는 부여된 수가 가장 클 경우 배열에 있는수와
						// 관계없이 max값은 부여된 수로 고정됨.
		int min = a[0]; // 최소값 변수 생성. 상동
		int cnt=0;

		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) { // max값이 배열에 있는 수보다 작으면 배열에 있는수가 max값이 됨
				max = a[i];
				cnt=i+1;
			}
			if (min > a[i]) { // min값이 배열에 있는 수보다 크면 배열에 있는수가 min값이 됨
				min = a[i];
			}
		}

		System.out.println("배열에 입력된 최소값은 " + min + " 입니다.");
		System.out.println("배열에 입력된 최대값은 " + max + " 입니다. 위치는 " + cnt + " 입니다");
		
		
		in.close();
		
		
		

	}
}
