package Day13_231220;

import java.util.Scanner;

public class Ex3_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
	
		System.out.print("나이 : ");
		int age = s.nextInt();
		System.out.print("이름과 주소: ");
		s.nextLine(); // 버퍼에 있는 값(입력 스트링)을 비우기 위한 용도.
		String info = s.nextLine();
		System.out.print("키 : ");
		int height = s.nextInt();
		
//		String info = s.nextLine();
//		System.out.println(info);
		
		
		
	}//

}//
