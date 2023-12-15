package day10;

public interface Ex3_MobilePhoneInterface extends Ex3_PhoneInterface {
	// interface와 interface끼리 상속도 가능하다.
	// interface에서 class는 implements 이지만 interface끼리는 extends를 사용.
	void sendSMS();

	void receiveSMS();

	@Override
	default void sendCall() {
		// TODO Auto-generated method stub

	}

	@Override
	default void receiveCall() {
		// TODO Auto-generated method stub

	}

}
