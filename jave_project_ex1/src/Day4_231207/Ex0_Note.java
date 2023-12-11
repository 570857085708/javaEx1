package Day4_231207;

import java.util.Scanner;

public class Ex0_Note {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 반복문 ( for, while, do~while )
		
		Scanner s = new Scanner(System.in);
		System.out.print("몇단을 원하십니까 : ");
		int num1 = s.nextInt();
						
		for(int i=2; i<=9; i++) {
			System.out.println("== "+i+" 단==");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);	
			}
		}
		
		
		//  삼항연산자
		
		int a = 10;
		int b = 20;
		int max = 0;
		if(a>b) {
			max = a;
		} else {
			max = b;
		}
		
		max = (a >= b) ? a : b; 		// (true)면 a가 max (false)면 b가 max
		
		
		
		
		
		// 배열 -> 정렬 sort ( 선택정렬, 버블정렬)
		
	}

}
