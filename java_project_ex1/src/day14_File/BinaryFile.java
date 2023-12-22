package day14_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		File src = new File("C:\\test\\picture.jpg");
//		File dest = new File("c:\\test\\copyimg3.jpg");
//		int c;
//		try {
//			FileInputStream fi = new FileInputStream(src);
//			FileOutputStream fo = new FileOutputStream(dest);
//			while ((c = fi.read()) != -1) {
//				fo.write((byte) c);
//			}
//			fi.close();
//			fo.close();
//			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
//		} catch (IOException e) {
//			System.out.println("파일 복사 오류");
//		}
		File src = new File("C:\\\\test\\\\picture.jpg");
		File dest = new File("c:\\\\test\\\\copyimg4.jpg");
		double beforeTime = System.currentTimeMillis();
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024 * 10]; // 10KB 버퍼
			while (true) {
				int n = fi.read(buf); // 버퍼 크기만큼 읽기. n은 실제 읽은 바이트
				fo.write(buf, 0, n); // buf[0]부터 n 바이트 쓰기
				if (n < buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
		double afterTime = System.currentTimeMillis();
		double secDiffTime = (afterTime - beforeTime) / 1000; // 밀리세컨드는 1000분의 1초이기 때문에 1000을 나눔
		System.out.println(beforeTime);
		System.out.println(afterTime);
		System.out.println("시간차이(m) : " + secDiffTime);
	}

}
