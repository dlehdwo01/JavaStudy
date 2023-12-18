package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번 문제
//		Random ran = new Random();
//		int arr[] = new int[6];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = ran.nextInt(45) + 1;
//			for (int j = 0; j < i; j++)
//				if (arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//		}
//
//		int arr[] = new int[6];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random() * 45 + 1);
//
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));

		// 2번 문제
		Scanner in = new Scanner(System.in);
		ArrayList<Character> al = new ArrayList<>();

		System.out.print("텍스트를 입력하세요 : ");
		String text = in.nextLine();
		// ArrayList를 이용한 방법
//		char arr[];
//		arr = text.toCharArray();
//
//		for (int i = 0; i < arr.length; i++) {
//			al.add(arr[i]);
//		}
//		for (int j = 0; j < arr.length; j++) {
//			for (int i = 0; i < arr.length; i++) {
//				System.out.print(al.get(i));
//			}
//			System.out.println();
//			char temp = al.get(0);
//			al.remove(0);
//			al.add(temp);
//		}

		// String 메소드를 이용한 방법
		for (int i = 0; i < text.length(); i++) {
			String first = text.substring(0, 1);
			String last = text.substring(1);
			text = last + first;
			System.out.println(text);
		}

	}
}