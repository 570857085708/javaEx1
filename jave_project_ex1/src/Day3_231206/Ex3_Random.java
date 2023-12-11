package Day3_231206;

import java.util.Random;
import java.util.Scanner;

public class Ex3_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		
		// 랜덤한 숫자 생성
		Random ran = new Random();
//		for(int i=0; i<10; i++){
//			// ran. nextInt(9)        => 0~8 까지 랜덤 생성
//			// ran. nextInt(9)+1      => 1~9 까지 랜덤 생성
//			System.out.println(ran.nextInt(9));
//			}
		
//		int a = ran.nextInt(); // 랜덤한 숫자를 만들어주는 메소드(함수)
//		for(int i=0; i<20; i++) {
//			System.out.println(ran.nextInt(100)+1);  // 1~100
//			}
			
		
//			System.out.println(ran.nextInt(9) + " * " + ran.nextInt(9) + " = " );
		
		int a = ran.nextInt(8) + 2;
		int b = ran.nextInt(9) + 1;
		System.out.println(a + " * " + b + " = " );
		int answer = s.nextInt();
		if(answer == (a * b)) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		
		
	
		
		
		
	}

}
