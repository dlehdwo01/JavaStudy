package day5;

public class Ex2_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 15, 9, 2, 11 };
		// 배열에서 짝수들의 합과 홀수들의 합을 구하고
		// 두 수의 차이를 구해보기
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 0; i < arr.length; i++) {

			evenSum = (arr[i] % 2 == 0) ? evenSum += arr[i] : evenSum; // 삼항연산자
			oddSum = (arr[i] % 2 != 0) ? oddSum += arr[i] : oddSum; // 삼항연산자

			if (arr[i] % 2 == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}
		System.out.println("짝수의 합은 " + evenSum + " 입니다.");
		System.out.println("홀수의 합은 " + oddSum + " 입니다.");
		System.out.println("두 수의 차이는 " + Math.abs(evenSum - oddSum) + " 입니다.");
		
		// for-each
		for(int v : arr) {
			System.out.println(v);
		}
		
		
		
		
	}

}
