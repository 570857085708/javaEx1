package Day4_231207;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		
		
//		int a[] = new int[10];   // 공간이 10개 할당 
//		a[0] = 10;    // 첫번째가 10
//		a[3] = 30;    // 네번째가 30
//		a[9] = 1;     // 아홉번째가 1
//		
//		
//		System.out.println(a[3]);
		
//		int b[] = {1,2,3,4,5,6,7,8,9};
//		System.out.println(b.length);
		
//		for(int i=0; i<b.length; i++) {
//			System.out.println(b[i]);
//		}
		
//		int c[] = new int[5];
//		for(int i=0; i<c.length; i++) {
//			c[i] = i+1;
//		}
		
		
		// 1. 정수형 5개의 공간을 가지는 배열을 생성
		// 2. 다섯개의 공간에 값을 넣는데, 사용자로부터 입력받아서 넣기
		
		int array[] = new int[5];
				for(int i=0; i<array.length; i++) {
					System.out.print(i+1+"번째 숫자 입력 : ");
					array[i] = s.nextInt();
				}
		//배열값 확인
				System.out.println(Arrays.toString(array));
		
		// 3. 해당 배열에 있는 값들의 평균 구하기
				int sum = 0; // 소수점 출력 원할시 double 변경
				for(int i=0; i<array.length; i++) {
					sum += array[i];
				}
				System.out.println("평균 값 : " + sum / array.length); // 혹은 여기서 double 강제형변환
		
		
				
		// 4. 해당 배열에 있는 값 중에서 가장 큰 수 구하기		
				
				int max = array[0];                              // 1
				for(int i=0; i<array.length; i++) {
					if(array[i]>max) {
						max = array[i];                          // 2
					}
				} 
				System.out.println("가장 큰 값 : " + max);
				
				//max=(array[i] > array[maxIdx]) ? array[i]: max;
		
		// 5. 가장 큰 값의 위치		
				
				int idx = 0;
				for(int i=1; i<array.length; i++) {
					if(array[i] < array[idx]) {
						idx = i;
					}
				}
				System.out.println("위치 : " + idx + "번째");
				
				
				
		// 가장 큰 값의 위치를 맨 앞의 값과 위치 변경	
				
				int temp = 0;
//				temp = array[i];
//				array[i] = array[idx];
				array[idx] = temp;
				
		//	가장 큰 값의 위치와 가장 작은 값의 위치 변경	
				
				int maxIdx = 0;
				int minIdx = 0;
				for(int i=1; 1<array.length; i++) {
					if(array[i] > array[maxIdx]) {
						maxIdx = i;
					}
					if(array[i] < array[minIdx]) {
						minIdx = i;
					}
					
				}
				
				
				int temp2 = array[minIdx];
				array[minIdx] = array[maxIdx];
				array[maxIdx] = temp2;
				
				
				
	} //m

} //c
