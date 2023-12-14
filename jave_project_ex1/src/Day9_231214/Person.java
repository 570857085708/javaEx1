package Day9_231214;

public class Person {
	
	String name;					// 1
	int age;
		
	Person(){						// 2-1
		
	};						
	Person(String name){			// 2-2
		this.name = name;		
	};						
	
	String getName(){						// 3
		return name;
	}

	
	
	// 1. name, age 변수 선언
	// 2. 생성자 만들기 
	//	2-1. 기본생성자
	//	2-2. name을 받아서 초기화 하는 생성자
	// 3. name을 리턴해주는 메소드 생성(getName)
	
	
	
}
