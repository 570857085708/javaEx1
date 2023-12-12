package Day7_231212;

public class Student {

	// 클래스 필드 + 메소드 (변수들의 집합)
	int stuNo;
	String stuName;
	String stuDept;
	int age;
	String gender;
	
	
	Student(int stuNo, String stuName){
		this.stuNo = stuNo;
		this.stuName = stuName;
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
	
	
	
		
	
	//5. 메인 메소드에서 해당 클래스를 이용하여 객체 생성 및 호출
   // 1. 객체명 : hong, 이름 : 홍길동, 학번 : 1234
   // 2. 객체명 : yu, 이름 : 유재석 : 학번 : 1357, 학과 : 컴퓨터학과
    //3. hong 객채에서 setInfo를 통해 값 입력(나이 : 20, 성별 : 남)
   // 4. hong 객체에서 getAge 호출 후 해당 값 출력
	
	
}//
