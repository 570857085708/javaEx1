package Day2_231205;

public class Ex7_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//반복문
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//		}		
		
//		int sum = 0;
//		for(int i=1; i<101; i++) {
//			sum += i; // sum = sum + i;
//			// 첫번째 i=1, sum = 0+1
//			// 두번째 i=2, sum = 1+2
//			// 세번째 i=3, sum = 3+3
//		}
//		System.out.println(sum);
//		
		// 1. 숫자 20~0 순으로 출력
//		for(int i=20; i>=0; i--) {
//			System.out.println(i);
//		}
//		
//		
		// 2. 1부터 100중에서 3의 배수들 숫자의 합
//		int sum = 0;
//		for(int i=1; i<101; i++) {
//			sum = i % 3 == 0;
//		}
//		System.out.println(sum);
		
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		
	} //main

} //class
