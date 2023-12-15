package day10;

public class Ex2_GoodCalc extends Ex2_Calculator {
	// interface는 상속시 extends가 아닌 implements를 사용해야함

	@Override
	int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	int subtract(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	double average(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double) sum / arr.length;
	}

}
