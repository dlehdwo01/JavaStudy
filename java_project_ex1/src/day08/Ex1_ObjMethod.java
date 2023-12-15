package day08;

public class Ex1_ObjMethod {
	private String name;

	Ex1_ObjMethod(String name) {
		this.name = name;
	}

	Ex1_ObjMethod() {
	}

	static int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	void nameEquals(Ex1_ObjMethod obj) { // 클래스 객체를 입력받을 수도 있다.
		if (this.name.equals(obj.name)) {
			System.out.println("이름이 같은 사람 입니다.");
		} else {
			System.out.println("이름이 다른 사람 입니다.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
