package Day8_231213;
	
public class Ex5_6_7_Main {
	
	static void print(Ex5_Human obj) {
		if(obj instanceof Ex6_Student) {
			System.out.println("해당 객체는 학생입니다.");
		} else if(obj instanceof Ex7_Worker) {
			System.out.println("해당 객체는 직장인입니다.");
		} else {
		System.out.println("해당 객체는 사람입니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex5_Human h = new Ex5_Human();
		Ex6_Student s = new Ex6_Student();
		Ex7_Worker w = new Ex7_Worker();
		
		Ex5_Human h2 = new Ex6_Student();
		Ex5_Human w2 = new Ex7_Worker();
//		Student s2 = new Human()		(X)
		
		
		print(w);
		
		
		
		
	} //

}
