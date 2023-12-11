package Day4_231207;

import java.util.Random;
import java.util.Scanner;

public class Ex1_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요 : ");
//		int num1 = s.nextInt();
		
		
		
//		int i = 1;
//		while(i<=9){
//			System.out.println(i);
//			i++;
//		}
		
		// while문을 이용해서 1부터 사용자가 입력한 숫자까지의 합
//		int sum = 0;
//		int i = 1;
//		while(i<=num1) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		
		
		
		// while문을 이용해서 1부터 사용자가 입력한 숫자에서 홀수의 합
//		int sum = 0;
//		int i = 1;
//		while(i<=num1) {
//			if(i % 2 != 0) {
//				sum += i;                          // 1
//			}
//			i++;
//		} 
//		System.out.println(sum);                  // 2
		
		
		
		// while문으로 UpAndDown 게임만들기
		
		Random ran = new Random();
		int random = ran.nextInt(100)+1;
		
		int cnt = 0;;
		while(true){
			cnt++;
			System.out.print(cnt + " 번째 숫자를 입력하세요 : ");
			int input = s.nextInt();		
			
			if(input<1 || input>100) {
				
				System.out.println("1부터 100사이의 숫자를 입력하세요.");
				cnt--;
			} else if(input == random) {
				System.out.println("축하합니당! " + cnt + "번째 정답이예용");
				break;
			} else if(input > random) {
				System.out.println("숫자 따~~~운!");
			} else {
				System.out.println("숫자 업~~~~!");
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	} //m

} //c
