package Day13_231220;

import java.util.Scanner;

public class Ex4_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// age 변수를 선언하고 
		// Scanner 클래스를 이용해서 입력받기.
		// 스캐너 입력시 타입에 맞지 않는 값 입력할 경우
		// 예외 처리 ('잘못입력') 
		// 예외에 상관없이 'finally!!' 문구 출력
		
		Scanner s = new Scanner(System.in);
		int age;

		while(true) {	
		 try {
			System.out.print("나이 : ");
			age = s.nextInt();
			break;
		} catch(Exception e) {
			System.out.println("잘못입력");
			s.next();
		} finally {
			System.out.println("finally!!");
		}
		}
		
		
	}//

}//
