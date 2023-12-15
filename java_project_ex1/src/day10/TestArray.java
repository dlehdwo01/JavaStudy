package day10;

public class TestArray {
	// 배열을 매개변수로 받아서
	// 0번째 인덱스 값과 마지막 인덱스 값 위치 변경

	static public void changeArr(int[] arr) {
		int temp = arr[arr.length - 1];
		arr[arr.length - 1] = arr[0];
		arr[0] = temp;
	}

	public static String chageString(String str) {
		str = str + "!!";
		return str;
	}

}
