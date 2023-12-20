package Day13_231220;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_Exception {

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
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0으로 나눌 수 없음");
		} catch (InputMismatchException e) {
			System.out.println("제대로 입력 바람.");
			s.next(); // 버퍼에 있는 값(입력 스트링)을 비우기 위한 용도.
		} finally {
			System.out.println("finally는 무조건 실행");
		}
		}
		
	}//

}//
