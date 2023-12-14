package Sample3_Day8_231213;

public class Apple extends Fruit {

	Apple(String kind, String color, int price){
		super(kind, color, price);
	}
	
	void getPrice() {
		super.getPrice();
		System.out.println("사과는 할인해서 200원");
	}
	
	
	
	
	
}//
