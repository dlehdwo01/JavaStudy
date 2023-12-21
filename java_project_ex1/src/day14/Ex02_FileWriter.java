package day14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex02_FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("C:\\test\\java.txt");
			while (true) {
				String line = scanner.nextLine();
				if (line.length() == 0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2); // \r\n은 줄바꿈, 0은 시작지점, 2바이트를 이용해서
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();

	}

}
