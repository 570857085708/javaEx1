package Day2_231205;

import java.util.Scanner;

public class Ex8_Subjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 숫자를 입력받고 해당 숫자가 10보다 클 경우 '큰 수', 아닐경우 '작은 수'를 출력하시오. (조건문)
//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요 : ");
//		int i = s.nextInt();
//		if(i>10) {
//			System.out.println("큰 수");
//		} else{
//			System.out.println("작은수");
//		}
		
		
		
		
		// 2. 숫자를 입력받고 해당 숫자가 90이상일 경우 'A 등급', 
		// 70점 이상일 경우 'B 등급', 50점 이상일 경우 'C 등급', 
		// 그 외의 숫자일 경우 'F 등급'을 출력하시오. (조건문)
//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요 : ");
//		int y = s.nextInt();
//		if(y>=90) {
//			System.out.println("A등급");
//		} else if(y>=70){
//			System.out.println("B등급");
//		} else if(y>=50) {
//			System.out.println("C등급");
//		} else {
//			System.out.println("F등급");
//		}
	
		
		
		
		
		// 3. 2번에서 작성한 코드를 switch~case문으로 바꿔서 작성하시오.
		// (2번에서 switch를 썻다면 else if로 변경)
		
//		switch(y/10) {
//		case 100:
//		case 9 :
//			System.out.println("A등급");
//			break;
//		case 8 :
//		case 7 :
//			System.out.println("B등급");
//			break;
//		case 6 :
//		case 5 :
//			System.out.println("C등급");
//			break;
//		default :
//			System.out.println("F등급");
//			break;
//		}
		
		
		
		// 4. 반복문을 통해 1부터 10까지 숫자를 차례대로 출력하시오.
		
//		for(int t=1; t<11; t++) {
//			System.out.println(t);
//		}
		
		
		
		
		
		// 5. 반복문을 통해 1부터 100중에서 짝수만 화면에 차례대로 출력하시오.
//		int sum = 0;
//		for(int w=1; w<=100; w++) {
//			sum = w % 2 ==0;
//			System.out.println(sum);
//			} 
		
		
		
		// 6. 반복문을 통해 1부터 100중 홀수의 합, 짝수의 합을 각각 구하시오.
		
//		int oddSum = 0;
//		int evenSum = 0;
//		for(int i=1; i<=100; i++) {
//			if(i % 2 == 0) {
//				evenSum += i; // 2 + 4 + 6 ...
//			} else {
//				oddSum += i; // 1 + 3 + 5 ...
//			}
//		} 
//		System.out.println(oddSum);
//		System.out.println(evenSum);
		
		
		// 7. 반복문을 통해 1부터 100중 3의 배수 이면서 동시에 5의 배수인 숫자(ex, 15, 30, 45..) 출력하시오.

		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
		
			}
		}	
	}

	}





