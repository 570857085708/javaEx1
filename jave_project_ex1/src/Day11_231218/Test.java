package Day11_231218;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////		1. 1부터 45까지 랜덤한 숫자 6개 출력. ( 중복 x )
//		
//		int arr[] = new int[6];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int) (Math.random() * 45 + 1);	// 강제형변환
//			for(int j=0; j<i; j++) {					// 중복숫자빼기
//				if(arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//			}
//			
//		}
////		Arrays.sort(arr); // 오름차순으로 정리
//		System.out.println(Arrays.toString(arr));
//		
		
//		2. 텍스트가 회전하여 반복하는 코드를 작성
		
		System.out.print("텍스트를 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		for(int i=0; i<str.length(); i++){
			String first = str.substring(0, 1);
			String last = str.substring(1);
			str = last + first;
			System.out.println(str);
		}
		
		
		
		
	}

}
