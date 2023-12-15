package day08;

public class Ex1_ObjMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 5, 7, 9 };
		int sum = Ex1_ObjMethod.sumArray(arr);
		System.out.println("배열의 총합 : " + sum); // static 메소드일경우 객체 생성없이 메소드를 호출 할 수 있다

//		Ex1_ObjMethod obj = new Ex1_ObjMethod(); // static 메소드가 아닌경우 객체를 생성한 후 객체를 통해 메소드를 호출 할 수 있다
//		int sum2 = obj.sumArray(arr);
//		System.out.println("배열의 총합 : " + sum2);

		Ex1_ObjMethod hong1 = new Ex1_ObjMethod("홍길동");
		Ex1_ObjMethod hong2 = new Ex1_ObjMethod("홍길동");
		Ex1_ObjMethod hong3 = new Ex1_ObjMethod("이동재");

		// Ex1_ObjMethod 클래스에서 객체를 비교하는 메소드 생성
		// 두 객체가 가지고 있는 name의 값이 같다면 
		// '같은 사람 입니다.' 라는 메시지 출력
		//조건1. 매개변수로 객체를 넘겨서 비교하기
		
		hong1.nameEquals(hong2);
		hong1.nameEquals(hong3);
	}
}
