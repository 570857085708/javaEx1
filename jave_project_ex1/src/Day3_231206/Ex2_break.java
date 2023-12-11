package Day3_231206;

import java.util.Scanner;

public class Ex2_break {

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		System.out.print("첫번째 숫자 : ");
//		int num1 = s.nextInt();
	
		
//		for(int i=1; i<=10; i++) {
//			if(i==5) {
//				break;
//			}
//			System.out.println(i);
//		}
//		
		
		// 반복문을 이용해서 숫자를 5개 입력받고 입력받은 수의 합을 구하시오.
//		int sum=0;
//		for(int i=1; i<=5; i++) {
//			System.out.print( i +"번째 숫자 입력 : ");
//			sum += s.nextInt();
//		}
//		System.out.println("5개 숫자의 합 : " + sum);
		
		
		
		// 반복문을 이용해서 숫자를 10개 입력받고 입력받은 수의 합을 구하시오. 단, 0을 입력하면 그 즉시 종료
		
		Scanner s = new Scanner(System.in);
//		System.out.print("첫번째 숫자 : ");
//		int num1 = s.nextInt();
		
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			System.out.print( i + "번째 숫자 입력 : ");
//			int num1 = s.nextInt();
//		 if(num1==0) {
//			break;
//		 }
//		 sum +=num1;
//		} System.out.print("입력한 수의 합 : " + sum);
		
		
		
		// 무한루프
		
//		for(;;) { 
//			System.out.println("종료(0),계속(1)");
//			int num1 = s.nextInt();
//		 	if(num1 == 0) {
//			System.out.println("종료되었습니다.");
//			break;
//		 } 
//		}

//		int sum = 0;
//		int cnt = 0;		
//		for(;;) { 
//			System.out.print("합산할 숫자를 입력해 주세요 : ");			
//			int num1 = s.nextInt();
//			sum += num1;
//			cnt++;
//			System.out.println("종료(0),계속(1)");			
//		 	if(s.nextInt() == 0) {
//			System.out.println("종료되었습니다.");
//			break;
//		 } 	
//		}
//		System.out.println("총" + cnt + "개의 숫자의 합 : " + sum);
		
		int sum = 0;
		int cnt = 0;
		//시작시 합산할 숫자를 입력하기 위한 초기값
		int flg = 1;
		for(;;) {
			//무한 루프 포문이기 떄문에 다시 시작
			// 하단에서 입력받은 값을통해 끝낼지 계속할지 이프문으로 결정
			if(flg == 0) {
				System.out.println("종료되었습니다.");
				break;
			} else if(flg == 1) {
				System.out.print("합산할 숫자를 입력해주세요 : ");
				// 콘솔창에 입력받을 숫자 저장
				int num1 = s.nextInt();
				sum += num1;
				cnt++;
			} else {
				System.out.println("0 또는 1만 입력해주세요.");
			}			
			System.out.print("종료(0), 계속(1) : ");
			// 종료할 경우 0 계속할 경우 1입력
			flg = s.nextInt();
		}
		System.out.println("총 " + cnt + "개의 숫자의 합 : " + sum);
		
		
		
		
		
	} //
} //
