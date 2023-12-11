package Day3_231206;

import java.util.Random;
import java.util.Scanner;

public class Ex5_UpAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		// 1 부터 100 사이의 숫자 맞추기
		int random = ran.nextInt(100)+1;      // 1~100
		int cnt = 0;
		for(;;) {
			cnt++;
			System.out.println(cnt + "번째 시도, 숫자 입력 : ");
			int answer = s.nextInt();
			if(answer == random) {
				System.out.println("정답!!! " + cnt + "번째에 맞춤ㅋ");
				break;
			} else if(answer > random) {
				System.out.println("따~운!!");
				} else {
					System.out.println("업~!!");
				}
		}
		
		
		
		
		
	} //m

} //c
