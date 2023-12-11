package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex6_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner in = new Scanner(System.in);

		// 1부터 100까지 랜덤된 수 UP AND DOWN 게임 만들기
//		int random = ran.nextInt(100) + 1; // 랜덤 수 생성
//		int cnt = 0; // 카운트 갯수
//		// n번만에 정답이 나올지 모르기 때문에 무한루프
//		for (;;) {
//			cnt++; //시도마다 카운트+1
//			System.out.print(cnt + "번째 시도, 숫자를 입력하세요. : "); 
//			int ans=in.nextInt();
//			if(ans==random) {
//				System.out.println("정답입니다 ! "+cnt+"번째에 맞추셨습니다.");
//				break; //정답시 루프 종료				
//			} else if (ans>random){ // 입력된 수가 랜덤수보다 클때는 DOWN
//				System.out.println("DOWN!");				
//			} else { // 입력된 수가 랜덤수보다 크지않으며 같지 않을때 UP
//				System.out.println("UP!");
//			}
//		}

		
		//구구단 맞추기 게임 만들기
		
		int cnt = 0; // 정답 수
		System.out.print("몇 문제를 푸시겠습니까? : ");		
		int question = in.nextInt(); // 문제 수
		for (int i = 0; i < question; i++) {
			int a = ran.nextInt(8) + 2; // 2~9
			int b = ran.nextInt(9) + 1; // 1~9
			System.out.print(a + " * " + b + " = ");
			int ans = in.nextInt(); // 정답 입력
			if (ans == a * b) {
				cnt++; 
				System.out.println("정답 !");
			} else {
				System.out.println("오답 ! 정답은 : " + (a * b) + " 입니다.");
			}
		}
		System.out.println(question + " 문제 풀이 끝 !");
		System.out.println((cnt * (100/question)) + " 점 입니다! (한 문제당 "+ (100/question) + "점)");
	}
}
