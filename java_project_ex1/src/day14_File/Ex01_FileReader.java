package day14_File;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileReader fin = null;
//		try {
//			fin = new FileReader("C:\\test\\system.ini");
//			int c;
//			while ((c = fin.read()) != -1) {
//				System.out.print((char) c);
//			}
//			fin.close();
//
//		} catch (IOException e) {
//			System.out.println("입출력 오류");
//		}

		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\test\\java.txt");
			in = new InputStreamReader(fin, "US-ASSII");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
