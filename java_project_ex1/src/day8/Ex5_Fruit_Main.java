package day8;

public class Ex5_Fruit_Main {

	static void boxing(Ex5_Fruit obj) { // 해당 코드에 static을 넣지 않으면 Main에서 Ex5_Fruit_Main의 객체를 생성해야만 아래 메소드를 사용할수있다.
		//
		// Object obj로도 사용 할 수 있다 ( 모든 클래스들의 조상격, 하지만 Fruit 클래스로 범위를 한정짓는게 좋다. )
		// Object를 이용하게되면 다른 class 내 객체도 집어넣을 수 있기때문이다.
		// instanceof 를 사용하면 Fruit(슈퍼클래스)내 서브클래스들의 객체 비교를 통해 true 혹은 false 값을 알아낼수있다.
		if (obj instanceof Ex5_Banana) {
			System.out.println("바나나를 상자에 담았다.");
		} else if (obj instanceof Ex5_Orange) {
			System.out.println("오렌지를 상자에 담았다.");
		} else if (obj instanceof Ex5_Apple) {
			System.out.println("사과를 상자에 담았다.");
		} else {
			System.out.println("모르겠다.");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex5_Banana banana = new Ex5_Banana("바나나", "노란색", 1000); // 서브클래스 내 super를 작성하여 객체 생성과 동시에 변수를 선언할수있다.
		Ex5_Orange orange = new Ex5_Orange("오렌지", "오렌지색", 2000);
		Ex5_Apple apple = new Ex5_Apple("사과", "빨간색", 10000);
//		banana.setFruit("바나나", "노란색", 1000);

//		banana.getPrice();
//		orange.getPrice();
//		apple.getPrice();
//		Ex5_Fruit_Main a = new Ex5_Fruit_Main(); // static을 선언하였기 때문에 객체를 만들 필요가 없다.
		boxing(banana);
		boxing(orange);
		boxing(apple);

		banana.getPrice();
		apple.getPrice(); // 현재 apple 클래스에서 재정의한 상태

	}

}
