package day9;

class Ex1_TV {
	private int size;

	public Ex1_TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}

	public static void main(String[] args) {
		Ex1_ColorTV myTV = new Ex1_ColorTV(32, 1024);
		myTV.printProperty();

		Ex1_IPTV iptv = new Ex1_IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();
	}

}
