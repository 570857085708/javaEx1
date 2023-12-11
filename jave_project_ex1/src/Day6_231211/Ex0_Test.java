package Day6_231211;

import java.util.Scanner;

public class Ex0_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		
		//1. 정수를 5개 담을 수 있는 배열 선언
		
		int array[]=new int [5];
		
		//2. 배열에 순서대로 1,2,3,4,5 넣기
		
		
		
		for(int i=0; i<array.length; i++) {
			array[i] = i+1; 
			}
		
		//3. 5번개의 숫자를 입력받아서 배열에 순서대로 넣기 (2번에 넣어던 값에 덮어쓰기)
		
		for(int i=0; i<array.length; i++) {
			array[i] = s.nextInt();                             
			}
		
		//4. 배열내 값의 총합 구하기
		
		int sum=0;
		for(int v : array) {
			sum += v;
		}
		
		
		
		//5. 구구단 출력하기
		
		
		for(int i=2; i<=9; i++) {
			System.out.println("======="+i+"단======");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		
		// 6. [1,4,3,5,2] 배열 선언 후 * 표시하기
		
		int array2[] = {1,4,3,5,2};
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i]; j++) {
				System.out.print("*");
			}
			System.out.println("\\test");                        // 줄바꿈 =  \n  ,  탭 = \t  , "\"안녕하세요."" = 문자열 "로 인식
		}
		
		
		
		
	} //

} //
