package Day9_231214;

public class Animal {

	String name;
	int age;
	
	Animal(){
		
	}
	
	Animal(String name){
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
		
	void print(){
		System.out.println("동물 이름은 " + name + " 입니다.");
	}
	
	int getAge() {
		return this.age;
	}
	
	void print2(){
		System.out.println(name + " 나이는 " + age + "살 입니다.");
	}
	
	// 1. name, age 변수 선언
	// 2. 생성자 만들기 
	//	2-1. 기본생성자
	//	2-2. name을 받아서 초기화 하는 생성자
	// 3. name을 리턴해주는 메소드 생성(getName)
	// 4. 동물 이름은 ooo 입니다. 출력해주는 메소드(print)
	// 5. age를 리턴해주는 메소드 생성(getAge)
	
	
	
}//
