package Day3_231206;

import java.util.Random;
import java.util.Scanner;

public class Ex6_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
//		int random = ran.nextInt(100)+1; // 1
//		int cnt = 0;
//		
//		for(;;) {
//			cnt++;
//			System.out.println(cnt+ "번째 시도, 숫자를 입력 하십쇼 : ");
//			int answer = s.nextInt(); // 2
//			if(answer == random) {
//				System.out.println(cnt + " 번째 쩡답입니다! ");
//					break;
//			} else if(answer > random) {
//				System.out.println(" 따~운입니다! ");
//			} else {
//				System.out.println(" 업~입니다! ");
//			}
//			}
			
		
		
		int cnt = 0;
		for(int i=0; i<5; i++) {
			int a = ran.nextInt(8)+2;                   //1
			int b = ran.nextInt(9)+1;                   //1
			System.out.println(a + " * " + b + " = ");
			int answer = s.nextInt();
			if(answer == a*b) {
				System.out.println("정답!");
				cnt++;                                  // 2
			} else {
				System.out.println("오답! 정답은 " + a*b + " 입니다.");
			} 
		}
			System.out.println("5문제 풀이 끝!");              //3
			System.out.println("점수는 " + cnt * 20 + "점 입니다! (한문제당 20점)");   //4
		
		
		
		
		
		
	}

}
