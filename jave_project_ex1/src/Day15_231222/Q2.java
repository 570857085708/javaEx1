package Day15_231222;

import java.util.Random;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		 2. 랜덤한 숫자를 이용하여 구구단 문제를 3문제 출력하시오.
//		 (정답을 입력받을 필요 없이 문제만 출력하면 됨)

		Random ran = new Random();
		
		int cnt = 0;
		for(int i=0; i<3; i++) {
			int a = ran.nextInt(8)+2;                   
			int b = ran.nextInt(9)+1;                   
			System.out.println(a + " * " + b + " = ");
		}
		
		
	}

}
