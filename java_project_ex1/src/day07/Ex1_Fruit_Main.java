package day07;



public class Ex1_Fruit_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아무것도 입력하지 않으면 자동으로 default 값을 설정. 같은 패키지만 접근이 가능하다.
		// public 다른 패키지도 모두 접근이 가능.
		// private 같은 패키지이더라도 접근이 불가하다. 같은 클래스만 접근 가능.
		// protected 같은 패키지만 접근이 가능하다. 다른 클래스에게 상속해준경우엔 패키지가 다르더라도 접근이 가능하다.
		Fruit banana = new Fruit("바나나", "노란색", 1000);
		
		banana.setPrice(1500);
		System.out.println(banana.getPrice());
		

	}

}
