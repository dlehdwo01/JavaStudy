package day13;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class WordQuiz {
	private String name; // 퀴즈 프로그램의 이름
	private Vector<Word> v;

	public WordQuiz(String name) {
		this.name = name;
		v = new Vector<Word>();
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("emotion", "감정"));
		v.add(new Word("human", "인간"));
		v.add(new Word("stock", "주식"));
		v.add(new Word("trade", "거래"));
		v.add(new Word("society", "사회"));
		v.add(new Word("baby", "아기"));
		v.add(new Word("honey", "꿀"));
		v.add(new Word("dall", "인형"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("painting", "그림"));
		v.add(new Word("fault", "오류"));
		v.add(new Word("example", "보기"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("statue", "조각상"));
	}

	void run() {
		System.out.println("'" + name + "'의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
		while (true) {
			// 보기 4개 생성
			int arr[] = new int[4];
			for (int i = 0; i < 4; i++) {
				arr[i] = ran.nextInt(v.size());
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						i--;
					}
				}
			}
			// 보기 4개중 1개 출제
			int exno = ran.nextInt(4); // 정답 idx
			System.out.println(v.get(arr[exno]).getEnglish() + "?");

			// 보기 나열
			for (int i = 0; i < arr.length; i++) {
				System.out.print("(" + (i + 1) + ")" + v.get(arr[i]).getKorean() + " ");
			}
			System.out.print(":>");

			// 정답 입력
			int answer = in.nextInt();
			if (answer == -1) {
				System.out.println(name + "를 종료합니다...");
				break;
			} else if (answer - 1 == exno) {
				System.out.println("정답입니다 !!");
			} else {
				System.out.println("오답입니다. !!");
			}
		}
	}

	public static void main(String[] args) {
		WordQuiz game = new WordQuiz("영어 문제 풀이!!");
		game.run();

	}
}