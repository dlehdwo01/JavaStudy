package day14;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex03_BufferStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\test\\system.ini");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);

			while ((c = fin.read()) != -1) {
				out.write(c);
			}
			// 파일 데이터가 모두 출력된 상태
//			new Scanner(System.in).nextLine(); 
			out.flush(); // 버퍼에 남아 있던 문자 모두 출력
			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
