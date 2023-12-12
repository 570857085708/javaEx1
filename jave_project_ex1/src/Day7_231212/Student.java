package Day7_231212;

public class Student {

	// 클래스 필드 + 메소드 (변수들의 집합)
	int stuNo;
	String stuName;
	String stuDept;
	int age;
	String gender;
	
	// this() = 생선자에서 다른 생성자 호출
	Student(int stuNo, String stuName){
		this(1234, "홍길동", "");                   // 반드시 생성자의 첫번째
	}
	
	Student(int stuNo, String stuName, String stuDept){
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}
	
	void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	int getAge() {
		return this.age;
	}
	
	
	
		
	
	
	
	
	
	
	
}//
