package Day6_231211;

public class Human {

		String name;
		int age;
		String phone;
		String bloodType;
		
		Human(String name, int age){
			this.name = name;
			this.age = age;
		}
		
		// 1. 메소드를생성
		// 1-1 리턴x, 이름: numAdd, 파라미터 정수형 1개받기
		// 1-2 리턴x, 이름: newYear, 파라미터 Human 타입
		
		void numAdd(int x) {
			x++;
		}
		
		void newYear(Human human) {
			// human == qwer123
			// human.age == qwer123.age
			human.age++;
			// qwer123.age++
			// qwer123.age == 31;
		}
		
		
		
		
		
		
		
		
		
		
}//
