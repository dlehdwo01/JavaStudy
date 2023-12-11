package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// 배열 내 순서 바꾸기
		// a = [30,20,50,10,40]
		// a = [50,20,30,10,40] 로 바꾸기

		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int input = in.nextInt();
			a[i] = input;
		}
		int max = a[0];
		int min = a[0];
		int maxidx = 0;
		int minidx = 0;

//		for (int i = 1; i < a.length; i++) {
//			if (max < a[i]) {
//				max = a[i];
//				maxidx = i;
//			}
//			if (min > a[i]) {
//				min = a[i];
//				minidx = i;
//			}
//		}

		// 간단한 if문은 삼항연산자를 이용하여 코드수를 줄일 수 있다.

		for (int i = 1; i < a.length; i++) {
			maxidx = (a[maxidx] < a[i]) ? i : maxidx;
			minidx = (a[minidx] > a[i]) ? i : minidx;
		}

		System.out.println("배열 순서 " + Arrays.toString(a));
		int temp = a[minidx]; // 0번째 수 저장
		a[minidx] = a[maxidx]; // 0번째 자리에 최대값 부여
		a[maxidx] = temp; // 최대값이 있던 자리에 0번째 수 부여
//		System.out.println("최대값은 " + max + " 입니다.");
//		System.out.println("최대값의 위치는 " + idx + " 입니다.");
		System.out.println("최대값과 최소값의 순서를 변경한 배열 " + Arrays.toString(a));

	}

}
