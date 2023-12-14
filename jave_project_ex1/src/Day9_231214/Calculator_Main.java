package Day9_231214;

public class Calculator_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Calculator 객체 생성후 오버로딩된 메소드 3가지 호출해보기

	Calculator calc = new Calculator();
	
	int num1 = calc.multifle(0, 0);
		System.out.println(num1);
	int num2 = calc.multifle(0, 0, 0);
		System.out.println(num2);
	double num3 = calc.multifle(0, 0);
		System.out.println(num3);
		
	calc.multifle(num2, num3);			// static
	calc.multifle(num2, num1, num2);    // non static
	
		
		
		
	// Book 객체 3개 만들기
		// 1.1 제목 : 자바책, 저자 : 홍길동, 번호 : 123
		// 1.2 제목 : 홍길동전, 저자 입력 x, 번호 : 321
		// 1.3 아무것도 입력 x
		

	Book java = new Book("자바책", "홍길동", 123);
	Book hong = new Book("홍길동전", 321);
	Book x = new Book();
	
	
	
	
	}//

}//
