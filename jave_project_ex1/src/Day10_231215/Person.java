package Day10_231215;

public class Person {

	private String name;
	int age;
	String addr;
	
	// 생성자 3개
	// 1. 기본생성자
	// 2. 이름, 나이, 초기화 (주소는 알수없음)
	// 3. 이름, 나이, 주소 초기화
	
	Person(){}
	
	Person(String name, int age){
		this(name, age, "알수없음");
	}
	
	Person(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}
	
	
	
	
}//
