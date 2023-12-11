package Day3_231206;

import java.util.Scanner;

public class Ex4_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int num2 = s.nextInt();
		
		// 두개의 숫자 중 큰 수는 ㅇㅇ 입니다.
//		if(num1 > num2) {
//			System.out.println("두개의 숫자 중 큰 수는" + num1 + "입니다.");
//		} else {
//			System.out.println("두개의 숫자 중 큰 수는" + num2 + "입니다.");
//		}
		
		// 1. 삼항연산자
		int max2 = (num1 >= num2) ? num1 : num2;
		
		if(num1 >= num2) {                  // 위와 같은공식
			max2 = num1;
		} else {
			max2 = num2;
		}
		
		// 2. 메소드(함수)를 이용
		int max = Math.max(num1, num2);
			System.out.println("두개의 숫자 중 큰 수는" + max + "입니다.");
		
			
			
			
		
		
		
	} // M

} // C
