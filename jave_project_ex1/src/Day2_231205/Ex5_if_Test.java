package Day2_231205;

import java.util.Scanner;

public class Ex5_if_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num1 = s.nextInt();
		
		// 1. 사용자가 입력한 숫자가 5의 배수면
		// "5의 배수 입니다." 아니면 "5의 배수가 아니다" 출력
		if(num1 % 5 == 0) {
			System.out.println("5의 배수입니다.");
		} else {
			System.out.println("5의 배수가 아닙니다.");
		}
				
		
		// 2. 사용자가 입력한 숫자가 홀수이면서 10보다 크면
		// "10보다 큰 홀수 입니다."
		// 10보다 큰 짝수일 경우 "10보다 큰 짝수 입니다."
		// 위 조건에 해당하지 않으면 "10보다 작은 수 입니다." 출력
		
		if(num1 >10 && num1 % 2 == 1) {
			System.out.println("10보다 큰 홀수입니다.");
		} else if(num1 >10 && num1 % 2 == 0) {
			System.out.println("10보다 큰 짝수입니다.");
		} else {
			System.out.println("10보다 작은 수 입니다.");
		}
		
		
		
		
		
		
	}

}
