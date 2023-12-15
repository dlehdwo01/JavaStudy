package day09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String N = in.next();
		in.close();
		int arr[] = new int[26];

		for (int i = 0; i < N.length(); i++) {
			if (65 <= N.charAt(i) && N.charAt(i) < 91) { // 대문자 일때
				arr[N.charAt(i) - 'A']++;
			} else if (N.charAt(i) >= 97) { // 소문자 일때
				arr[N.charAt(i) - 'a']++;
			}
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		int q = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[max]) {
				q++;
			}
		}
		if (q > 1) {
			System.out.println("?");
		} else {
			System.out.println((char) (max + 'A'));
		}
	}
}
