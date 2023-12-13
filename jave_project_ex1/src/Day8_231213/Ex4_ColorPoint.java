package Day8_231213;

public class Ex4_ColorPoint extends Ex4_Point{

	private String color;

	Ex4_ColorPoint(int x, int y, String color){
		super(x,y);
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	void showColorPoint() {
		System.out.print(color); 
		showPoint();
	}
	
	
	
	
	
	
}//
