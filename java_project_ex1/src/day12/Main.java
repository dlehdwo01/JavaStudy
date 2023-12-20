package day12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int cnt = str.length();
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'c') {
				if (str.charAt(i + 1) == '=') {
					cnt--;
				} else if (str.charAt(i + 1) == '-') {
					cnt--;
				}
			}

			if (str.charAt(i) == 'd') {
				if (str.charAt(i + 1) == '-') {
					cnt--;
				} else if (str.charAt(i + 1) == 'z' && i < str.length() - 2) {
					if (str.charAt(i + 2) == '=') {
						cnt--;
						cnt--;
					}
				}
			}
			
			

		}
		System.out.println(cnt);
	}
}
