package day14;

import java.io.File;

public class FileEx {
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----");
		File[] subFiles = dir.listFiles(); // dir 경로 내 모든 파일 및 폴더를 배열화함
		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified(); // 파일 수정한 날짜를 받아옴 t는 시간정보이며 printf를 통해 원하는 값으로 변환하여 사용
			System.out.print(f.getName()); // 파일명을 호출 및 출력해냄
			System.out.print("\t파일 크기: " + f.length()); // 파일에서 length는 파일의 용량을 나타냄
			System.out.printf("\t수정한 시간: %tY년 %tb %td일 %ta %tT\n", t, t, t, t, t);

//			%tY: 현재의 날짜를 년도를 생략없이 출력한다. (ex. 2014)
//			%ty: 현재의 날짜를 년도를 앞자리 생략하여 출력한다. (ex. 14)
//			%tm: 현재의 날짜를 01~12(월) 형식으로 출력한다.
//			%th: 현재의 날짜를 1~12(월) 형식으로 출력한다.
//			%tb: 현재의 날짜를 영문 약자(월) 형식으로 출력한다. (한글 환경에서는 '숫자+월'로 출력되며 %tB와 차이가 없다.)
//			%tB: 현재의 날짜를 영문(월) 형식으로 출력한다. (한글 환경에서는 '숫자+월'로 출력되며 %tb와 차이가 없다.)
		}
	}

	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName()); // getPath() 전체주소, getParent()
																						// 상위폴더, getName() 파일명.확장자
		String res = "";
		if (f1.isFile())
			res = "파일";
		else if (f1.isDirectory())
			res = "디렉토리";
		System.out.println(f1.getPath() + "은 " + res + "입니다.");
		File f2 = new File("c:\\test\\javasample.txt");
		if (!f2.exists()) { // 존재하는 파일인가? 존재하면 true , 없다면 false
			f2.mkdir(); // 디렉토리(폴더) 생성
		}
		listDirectory(new File("c:\\test"));
		f2.renameTo(new File("c:\\test\\javasample"));
		listDirectory(new File("c:\\test"));
	}
}
