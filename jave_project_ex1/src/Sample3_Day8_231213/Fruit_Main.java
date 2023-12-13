package Sample3_Day8_231213;

public class Fruit_Main {

	static void boxing(Fruit fruit) {
		if(fruit instanceof Banana) {
			System.out.println("바나나를 상자에 담았다.");
		} else if(fruit instanceof Apple){
			System.out.println("사과를 상자에 담았다.");
		} else if(fruit instanceof Orange){
			System.out.println("오렌지를 상자에 담았다.");
		} else {
			System.out.println("뭔가를 상자에 담았다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
	Apple apple = new Apple("사과","빨강",1000);
	Banana banana = new Banana("바나나", "노랑", 1500);
	Orange orange = new Orange("오렌지", "주황", 2000);
	
	boxing(banana);	
	
	banana.getPrice();
	apple.getPrice();
	
	
	// 1. Banana, Apple, Orange 모두 받아서 처리할 수 있도록
	// 매개변수 선언
	// 2. Banana 객체가 들어오면
	// '바나나를 상자에 담았다.' 	출력
		
	} //

}
