package Day6_231211;

public class Person {
		
		
	
		String name;
		int age;
		String addr;
		
		// 생성자(메소드)
		Person(String name, int age){
			this.name = name;
			this.age = age;
			
		}
		// 이름만
		Person(String name){
			this.name = name;
		}
		// 아무것도
		Person(){
			
		}
	
		
		
		
		String getName() {
			return name;
		}
		
		int getAge() {
			return age;
		}
		
		void setAddr(String addr) {
			this.addr = addr;
			
		}
	
		void info() {
			System.out.println("이름은 " + name + ',' + " 나이는 " + age + "살 입니다.");
		}
		
		
	
	
} //
