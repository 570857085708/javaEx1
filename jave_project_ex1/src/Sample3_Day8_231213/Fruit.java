package Sample3_Day8_231213;

public class Fruit {

	private String kind;
	private String color;
	private int price;
	Fruit(){}
	Fruit(String kind, String color, int price){					
		this.kind = kind;
		this.color = color;
		this.price = price;
	}
	
	void getPrice() {
		System.out.println(this.kind + "는 " + this.price + "원 입니다.");
	}
	
//	void setFruit(String kind, String color, int price) {
//		this.kind = kind;
//		this.color = color;
//		this.price = price;								// Fruit(){} 코드중복. 가독성 떨어짐.
//	}
	
	
//	1. 클래스 생성 (모든 변수는 private)
//	 1) 클래스명 : Fruit, 필드 : kind(과일명), color, price
//		생성자 : 3개의 필드 값 모드 초기화
//		메소드 : getPrice 호출 시 'kind는 price원 입니다' 출력(ex, 바나나는 1000원 입니다.)
//	 2) 클래스명 : Banana, Orange, Apple 클래스 생성 및 Fruit클래스 상속받기
//		(필드 및 메소드는 구현안해도 됨)
//		
//	2. 메인클래스 생성 후 객체 메인 함수에서 2번에서 만든 클래스 객체 만들기
//	 1) 클래스명 : FruitMain
//	 2) Banana, Orange, Apple 객체 생성(값 임의로 넣기) 
}//
