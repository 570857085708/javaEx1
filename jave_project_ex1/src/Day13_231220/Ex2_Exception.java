package Day13_231220;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		while(true) {
		System.out.print("나눠질 숫자를 입력 : ");
		int dividend = s.nextInt();
		System.out.print("나눌 숫자를 입력 : ");
		int divisor = s.nextInt();
		
		try {
			System.out.println(dividend/divisor);
			break;									// 정상적인 값 입력 후엔 프로그램 종료
		} catch (Exception e) {						// Exception은 부모클래스
			// TODO: handle exception
			System.out.println("에러 발생");
			System.out.println(e.getMessage()); 	// 불친절한 자동문구 발생
		} 
		}
		
	}//

}//
