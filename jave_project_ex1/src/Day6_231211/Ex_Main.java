package Day6_231211;

public class Ex_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Person hong = new Person("홍길동", 30);
//		System.out.println(hong.name);
//		hong.age = 30;
//		System.out.println(hong.age);
//		System.out.println(hong.getName());
//		
//		
//		Person kim = new Person("김철수", 20);
//		kim.age = 20;
//		System.out.println(kim.name);
//		System.out.println(kim.getName());
		
		
		
		Person lee = new Person("이영희", 25);
//		lee.age = 25;
//		int age = lee.getAge();
//		System.out.println(age);
		
		
		lee.info();
		
//		kim.info();
//		hong.info();
		
		
		// Calculator 객체 생성 후 sum 함수 호출 해보기
		
		Calculator calc = new Calculator();
		int num = calc.sum(2, 3);
		System.out.println(num);
		
		
		int num2 = calc.sum(2, 3, 4);
		
		// 정수 + 실수
		double num3 = calc.sum(1, 1.5);
		
		
		
		
	} //

} //
