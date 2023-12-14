package day9;

public class Ex3_ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		/* 배열 a와 b를 연결한 새로운 배열 리턴 */
		int[] c = new int[a.length + b.length];
		int idx = a.length;
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[idx] = b[i];
			idx++;
		}
		return c;

	}

	public static void print(int[] a) {
		/* 배열 a 출력 */
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.print(" ]");
	}
}
