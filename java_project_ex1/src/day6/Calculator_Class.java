package day6;

public class Calculator_Class {

//	오버로딩 : 동일한 이름의 메소드가 여러개 정의되는 것 = 이름이 동일하더라도 조건에 따라 자동 구분됨.		
//		 	 ★★★오버로딩은 1.매개변수의 개수가 다르거나 2.데이터 타입이 달라야 정상작동 됨.
//	주의사항 : 매개변수의 개수와 데이터 타입이 같으면 무조건 작동하지 않음 / 메소드 내 변수를 다르게 입력하더라도 작동X

	int sum(int x, int y) { // 2개의 정수를 받아야 작동
		return x + y;
	}

	int sum(int x, int y, int z) { // 3개의 정수를 받아야 작동
		return x + y + z;
	}

	double sum(int x, double y) { // 1개의 정수, 1개의 실수를 받아야 작동
		return x + y;
	}

}
