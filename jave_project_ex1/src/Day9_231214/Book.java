package Day9_231214;

public class Book {

	String title;
	String author;
	int num;
	
	// 1. 3개의 생성자 만들어보기
	//	1.1 3개의 매개변수 받아서 초기화
	//	1.2 title, num을 받아서 초기화
	//	1.3 기본 생성자
	
	Book(String title, String author, int num){
		this.title = title;
		this.author = author;
		this.num = num;
	}
	
	Book(String title, int num){
//		this();  기본생성자 호출
//		title = 홍길동전, num = 321
		this(title, "익명", num); //밑에 코드 3줄과 같은 형태 (반드시 첫줄에 호출)
//		this.title = title;
//		this.author = "익명";
//		this.num = num;
	}
	
	Book(){
		this(null, null, 0);
//		this.title = null;
//		this.author = null;
//		this.num = 0;
	}
	
		
}//
