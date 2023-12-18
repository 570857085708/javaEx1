package Day11_231218;

import java.util.Random;
import java.util.Vector;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 1부터 45까지 랜덤한 숫자 6개 출력. ( 중복 x )
		
		Random ran = new Random();
		Vector<Integer> v = new Vector<Integer>();
		
		while(v.size() < 6) {
			int sum = ran.nextInt(45);
			for(int i=1; i<v.size(); i++) {
				if(i != sum) {
					System.out.println(i);	
				}
			}
		}
		
		
		
		
//		2. 텍스트가 회전하여 반복하는 코드를 작성
		
		
		
		
		
	}

}
