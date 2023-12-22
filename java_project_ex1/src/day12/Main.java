package day12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			String A = in.nextLine();
			if (A.charAt(0) == ' ') {
				break;
			} else {
				System.out.println(A);
			}
		}
	}
}
