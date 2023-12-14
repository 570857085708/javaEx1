package Day9_231214;

public class Animal_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 이름이 "뽀삐"인 Animal 객체 생성
		// 2. getName 메소드 호출
		// 3. getAge 메소드 호출 후 변수에 담은 다음 출력


		Animal poppy = new Animal("뽀삐");
		
		String name = poppy.getName();
		System.out.println(name);
		poppy.print();								// 출력!
		
		poppy.age = 10;
		int age = poppy.getAge();
		System.out.println(age);
		poppy.print2();
		
		
	} //

}
