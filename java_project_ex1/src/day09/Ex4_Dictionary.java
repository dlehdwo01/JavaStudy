package day09;

public class Ex4_Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static void kor2Eng(String word) {
		/* 검색 코드 작성 */
		int f = 0;
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word)) {
				System.out.println(word + "는 " + eng[i]);
				f++;
				break;
			}
		}
		if (f == 0) {
			System.out.println(word + "는 저의 사전에 없습니다.");
		}
	}
}
