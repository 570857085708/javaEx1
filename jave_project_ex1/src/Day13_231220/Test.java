package Day13_231220;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
//		2. 숫자를 1개 입력받고 해당 숫자의 구구단을 출력하시오.
//		단, 입력받은 숫자는 2부터 9사이의 값이어야 하며 이외의 값이 입력될 경우 재입력하도록 함

		System.out.print("숫자 입력 : ");
		int sum = s.nextInt();
		if(sum >=2  && sum <=9) {
			System.out.println("=="+sum+"단==");
			for(int i=1; i<=9; i++) {
			System.out.println(sum+"*"+i+"="+sum*i);
			}
		}else {
			System.out.println("재입력");
		}
		
		
		
//		3. 배열을 아래와 같이 선언하고, 조건에 맞게 5개의 숫자를 
//		입력받아서 배열에 순차적으로 넣으시오.
//		조건 1) 입력받은 숫자는 1부터 10사이의 값이어야 하며, 
//		이외의 숫자를 입력할 경우 재입력하도록 한다.
//		조건 2) 기존에 입력된 숫자와 중복되어서는 안된다.
		
		int arr[] = new int[5];
		while(true) {
			for(int i=0; i<arr.length; i++) {
				System.out.print(i+1+"번째 숫자 입력 : ");
				arr[i] = s.nextInt();
			}
		}
		
		
		
//		4. 랜덤 구구단 문제를 출력하고 정답을 입력받으시오.
//		단, 구구단은 5번 반복하며, 정답 입력 시 정답&오답 여부 및 점수를 출력해주어야 함.
//		
//		Random ran = new Random();
//		
//		int cnt = 0;
//		for(int i=0; i<5; i++) {
//			int a = ran.nextInt(8)+2;                   
//			int b = ran.nextInt(9)+1;                   
//			System.out.println(a + " * " + b + " = ");
//			int answer = s.nextInt();
//			if(answer == a*b) {
//				System.out.println("정답!");
//				cnt++;                                 
//			} else {
//				System.out.println("오답! 정답은 " + a*b + " 입니다.");
//			} 
//		}
//			System.out.println("5문제 풀이 끝!");            
//			System.out.println("점수는 " + cnt * 20 + "점 입니다! (한문제당 20점)"); 
		
//		
		
		
		
		
	} //

}
