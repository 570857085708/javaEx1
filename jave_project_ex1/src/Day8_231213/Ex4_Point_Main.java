package Day8_231213;

public class Ex4_Point_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 생성 후 x = 1, y = 2 값 넣어보기
		
		Ex4_Point point = new Ex4_Point(1, 2);
//		point.setXY(1, 2);
		point.showPoint();
		
		Ex4_ColorPoint cPoint = new Ex4_ColorPoint(3, 4, "green");
//		cPoint.setXY(3, 4);
//		cPoint.setColor("green");
		cPoint.showColorPoint();
		
		
		
	}//

}
