package day09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String a = in.next();
		char[] num = a.toCharArray();
		int sum = 0;
		in.close();

		for (int i = 0; i < N; i++) {
			sum += num[i] - '0';
		}
		System.out.println(sum);
	}
}
