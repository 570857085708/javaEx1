package Sample4_Day9_231214;

public class Person {

//	1) 클래스 명 : Person
//	2) 변수 : name(이름), age(나이), phone(핸드폰 번호)
//	3) 객체를 생성하면서 이름, 나이를 초기화
//	4) 모든 변수는 private로 선언하며 get, set 메소드 구현
//	5) 매개변수로 phone값을 입력받아서 저장하는 메소드 생성
//	6) 이름 : 홍길동, 나이 20, 핸드폰번호 123-123 값을 가지는 객체 생성
	
	private String name;
	private int age;
	private String phone;
	
	Person(String name, int age){
		
	}
	Person(String phone){
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}//
