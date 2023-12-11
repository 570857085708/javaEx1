package Day6_231211;

public class Ex1_Obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArr[] = new int[5];
		String strArr[] = new String[5];
		Person personArr[] = new Person[5];
		
//		Person p = new Person();
//		Person kim = new Person("김철수");
//		Person hong = new Person("홍길동", 20);
		
		strArr[0] = new String("안녕!");
		// strArr = "안녕!";
		
		personArr[0] = new Person("홍길동");
		
		for(int i=0; i<personArr.length; i++) {
			personArr[i] = new Person();
		}
		
		personArr[0].name = "홍길동";
		
		
		
		
		
		
	} //

}
