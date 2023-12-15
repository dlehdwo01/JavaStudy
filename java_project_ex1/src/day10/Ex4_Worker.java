package day10;

public class Ex4_Worker implements Ex4_Human {

	void work() {
		System.out.println("일한다.");
	}

	@Override
	public void walk(int x) {
		System.out.println(x + "미터를 걷다");
		// TODO Auto-generated method stub
	}

	@Override
	public void eat(String food) {
		System.out.println(food + "를 먹다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		System.out.println("잔다.");
		// TODO Auto-generated method stub

	}

}
