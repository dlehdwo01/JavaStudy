package day04;

public class Ex4_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i = 1; i <= 5; i++) {
//			for(int j=1; j<=i; j++) {			
//			System.out.print(i+" ");
//			}
//		}

//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++)
//				System.out.println(i + " * " + j + " = " + (i * j));
//		}

		for (int i = 9; i >= 2; i--) {
			System.out.println("=====" + i + "단" + "=====");
			for (int j = 9; j >= 1; j--) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}

	}
}
