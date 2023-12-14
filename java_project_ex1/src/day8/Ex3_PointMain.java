package day8;

public class Ex3_PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex6_Point point = new Ex6_Point(1,2);
//		point.setXY(1, 2);
		point.showPoint();
		System.out.println();

		Ex6_PointColor cPoint = new Ex6_PointColor(3,4,"green");
//		cPoint.setXY(3, 4);
//		cPoint.setColor("Red");
		cPoint.showColorPoint();
		
		
	}

}
